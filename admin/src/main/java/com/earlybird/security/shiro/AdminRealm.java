package com.earlybird.security.shiro;

import org.apache.log4j.Logger;
import org.apache.shiro.authc.*;
import org.apache.shiro.authc.credential.SimpleCredentialsMatcher;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.earlybird.entity.sys.Admin;
import com.earlybird.entity.sys.AdminRoleDetail;
import com.earlybird.entity.sys.Role;
import com.earlybird.server.sys.AdminAuthPermService;
import com.earlybird.shiro.cash.RedisManager;
import com.earlybird.system.SysRedisCache;
import com.earlybird.system.SysRedisKey;
import com.earlybird.entity.sys.Perms;
import com.earlybird.dao.sys.RoleDao;
import com.earlybird.common.utils.Md5Utils;
import com.earlybird.common.utils.ObjectUtils;
import com.earlybird.common.utils.SpringContextHolder;
import com.earlybird.controller.LoginController;
import com.earlybird.dao.sys.AdminDao;
import com.earlybird.dao.sys.AdminRoleDao;
import com.earlybird.dao.sys.PermsDao;
//import com.earlybird.dao.sys.AdminRoleDao;

import com.earlybird.common.utils.Md5Utils;
import com.alibaba.fastjson.JSON;

import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;

public class AdminRealm extends AuthorizingRealm {
	@Autowired
	private PermsDao permsDao;

	@Autowired
	private RoleDao roleDao;

	@Autowired
	private AdminDao adminDao;

	@Autowired
	private AdminRoleDao adminRoleDao;

	@Autowired
	private static Logger logger = Logger.getLogger(AuthorizingRealm.class);

	private RedisManager redisManager = null;

	public AdminRealm() {
		super();
		this.redisManager = new RedisManager(); // SpringContextHolder.getBean(RedisManager.class);
		this.redisManager.setHost("127.0.0.1:6379");
		this.redisManager.setDatabase(0);
	}

	// 获取授权信息
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		SimpleAuthorizationInfo authInfo = new SimpleAuthorizationInfo();

		principals.getPrimaryPrincipal();

		AdminRoleDetail adminRoleDetail = adminRoleDao.queryAdminRoleByUserName("");

		String roleId = null;
		ArrayList<Perms> permsList = new ArrayList<Perms>();
		List<Perms> roleList = roleDao.queryPermsByRoleId(roleId).getPermsList();

		int pageStart = 1;
		int pageSize = 1;
		// 查询数据库权限 存入redis
		PageHelper.startPage(1, 1); // 开始分页
		permsList = permsDao.queryByRole(roleId);
		PageInfo<Perms> pageInfo = new PageInfo<>(permsList);

		while (pageInfo.isHasNextPage()) {
			for (Perms eachItem : permsList) {
				String permCode = eachItem.getPercode();
				authInfo.addStringPermission(permCode);
			}

			pageStart = pageStart + pageSize - 1;
			PageHelper.startPage(pageStart, pageSize);

			permsList = permsDao.query();
			pageInfo = new PageInfo<>(permsList);
		}

		logger.info("authInfo:" + JSON.toJSONString(authInfo));
		return authInfo;
	}

	// 获取认证信息
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		UsernamePasswordToken Token = (UsernamePasswordToken) token;
		String userName = Token.getUsername();
		String password = String.valueOf(Token.getPassword());

		// 获取用户信息和角色信息
		AdminRoleDetail arDetail = adminRoleDao.queryAdminRoleByUserName(userName);
		logger.info("AdminRealm arDetail :" + arDetail.getPassword() + " password:" + password);
		if (arDetail.getPassword().equals(password) == false) {
			throw new IncorrectCredentialsException("密码错误");
		}

		// 获取用户角色的权限菜单
		String roleId = arDetail.getRoleId();

		String redisKey = new StringBuffer(SysRedisKey.REDIS_PERMISSION).append(roleId).toString();

		Set<String> res = this.redisManager.smembers(redisKey);
		if (ObjectUtils.isNullOrEmpty(res) == true) {
			Role roleInfo = roleDao.queryPermsByRoleId(roleId);
			ArrayList<Perms> permsList = (ArrayList<Perms>) roleInfo.getPermsList();
			logger.info("AdminRealm roleInfo :" + JSON.toJSONString(roleInfo) + " permsList:"
					+ JSON.toJSONString(permsList));
			
			String members[] = new String[permsList.size()];

			if (ObjectUtils.isNullOrEmpty(permsList) == false) {
				int i = 0;
				for (Perms perm : permsList) {
					logger.info("AdminRealm perm :" + JSON.toJSONString(perm));
					members[i] = perm.getPercode();
					i++;
				}
			}
			
			if (ObjectUtils.isNullOrEmpty(members) == false) {
				logger.info("AdminRealm members :" + JSON.toJSONString(members) );
				this.redisManager.sadd(redisKey, members);
			}

			/*** todo sort by key hash 查询 **/
			// new SysRedisCache().getALlPerms();
		}

		arDetail.setPermsStrList(new ArrayList(this.redisManager.smembers(redisKey)));
		logger.info("AdminRealm arDetail :" + JSON.toJSONString(arDetail));
		// Expect password is "123456"
		return new SimpleAuthenticationInfo(arDetail, password, Token.getUsername());
	}

	@PostConstruct
	public void initCredentialsMatcher() {
		setCredentialsMatcher(new SimpleCredentialsMatcher());
	}

}
