package com.earlybird.system;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

import org.apache.log4j.Logger;
import org.apache.shiro.realm.AuthorizingRealm;
import org.springframework.beans.factory.annotation.Autowired;

import redis.clients.jedis.exceptions.JedisConnectionException;

import com.earlybird.system.SysRedisKey;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.alibaba.fastjson.JSON;
import com.earlybird.dao.sys.AdminRoleDao;
import com.earlybird.dao.sys.PermsDao;
import com.earlybird.dao.sys.RoleDao;
import com.earlybird.entity.sys.Role;
import com.earlybird.entity.sys.Perms;
import com.earlybird.shiro.cash.RedisSentinelManager;
import com.earlybird.shiro.cash.RedisClusterManager;
import com.earlybird.shiro.cash.RedisManager;

import redis.clients.jedis.*;

public class SysClusterCache {
	private static Logger logger = Logger.getLogger(AuthorizingRealm.class);

	@Autowired
	private PermsDao permsDao;
	@Autowired
	private RoleDao roleDao;
	@Autowired
	private AdminRoleDao adminRoleDao;

	private RedisClusterManager redisClusterManager = null;
	private volatile JedisCluster jedisCluster = null;

	public SysClusterCache() {
		this.redisClusterManager = new RedisClusterManager();
		this.redisClusterManager.setHost("127.0.0.1:6379,127.0.0.1:6379");
		this.redisClusterManager.setDatabase(0);
		this.jedisCluster = this.redisClusterManager.getJedisCluster();
	}

	public Map<String, String> getALlPerms() {
		ArrayList<Perms> permsList = new ArrayList<Perms>();

		int pageStart = 1;
		int pageSize = 1;
		// 查询数据库权限 存入redis
		PageHelper.startPage(1, 1); // 开始分页
		permsList = permsDao.query();
		if (permsList.isEmpty()) {
			logger.info(" permsList Null");
			return null;
		}

		PageInfo<Perms> pageInfo = new PageInfo<>(permsList);

		Map<String, String> resMap = this.jedisCluster.hgetAll(SysRedisKey.REDIS_PERMISSION);

		if (resMap.isEmpty()) {
			while (pageInfo.isHasNextPage()) {
				for (Perms eachItem : permsList) {
					String permCode = eachItem.getPercode();
					this.jedisCluster.hset(SysRedisKey.REDIS_PERMISSION, permCode, JSON.toJSONString(eachItem));
					resMap.put(permCode, JSON.toJSONString(eachItem));
				}

				pageStart = pageStart + pageSize - 1;
				PageHelper.startPage(pageStart, pageSize);

				permsList = permsDao.query();
				pageInfo = new PageInfo<>(permsList);

			}
		}

		return this.jedisCluster.hgetAll(SysRedisKey.REDIS_PERMISSION);
	}

}
