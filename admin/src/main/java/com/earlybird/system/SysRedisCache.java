package com.earlybird.system;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

import org.apache.log4j.Logger;
import org.apache.shiro.realm.AuthorizingRealm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import redis.clients.jedis.exceptions.JedisConnectionException;

import com.earlybird.system.SysRedisKey;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.alibaba.fastjson.JSON;
import com.earlybird.dao.sys.AdminRoleDao;
import com.earlybird.dao.sys.PermsDao;
import com.earlybird.dao.sys.RoleDao;
import com.earlybird.entity.sys.Role;
import com.earlybird.server.sys.PermsService;
import com.earlybird.entity.sys.Admin;
import com.earlybird.entity.sys.Perms;
import com.earlybird.shiro.cash.RedisSentinelManager;
import com.earlybird.shiro.cash.RedisClusterManager;
import com.earlybird.shiro.cash.RedisManager;

import com.earlybird.common.*;
import com.earlybird.common.utils.ObjectUtils;
import com.earlybird.common.utils.SpringContextHolder;
import com.earlybird.common.utils.StringUtils;

import redis.clients.jedis.*;

public class SysRedisCache {
	private static Logger logger = Logger.getLogger(SysRedisCache.class);
	
	private PermsService permsService = SpringContextHolder.getBean(PermsService.class);
	
	private  RedisManager redisManager = null;
	
	public SysRedisCache() {
		this.redisManager = SpringContextHolder.getBean(RedisManager.class);
		this.redisManager.setHost("127.0.0.1:6379");
		this.redisManager.setDatabase(0);
	}
	
	public Map<String,String> getALlPerms() {
		ArrayList<Perms> permsList = new ArrayList<Perms>();
		Map<String,String> resMap = null;
		String redisKey = SysRedisKey.REDIS_PERMISSION; 
		
		this.redisManager.del(redisKey);
        resMap = this.redisManager.hgetAll(redisKey);
		
		if ( ObjectUtils.isNullOrEmpty(resMap) == true ) {
			int pageNum = 1;
			int pageSize = 2;
			PageInfo<Perms> pageInfo;
			
			do {
				// 查询数据库权限 存入redis
				PageHelper.startPage(pageNum, pageSize); // 开始分页
				permsList = permsService.query();
				pageInfo = new PageInfo<Perms>(permsList);
				
				Long tatal = pageInfo.getTotal();
				logger.info(" tatal:"+ String.valueOf(tatal));
				
				if ( permsList==null ||  permsList.isEmpty()) {
					break;
				}
	
				for (Perms eachItem : permsList) {
					String permCode = eachItem.getPercode();
					logger.info("permCode:" + JSON.toJSONString(permCode));	
					this.redisManager.hset(redisKey,permCode, JSON.toJSONString(eachItem),24800);
				}

				pageNum = pageNum + 1;
			} while ( pageInfo.isHasNextPage() );
		}

		return this.redisManager.hgetAll(redisKey);
	}
	
	

}
