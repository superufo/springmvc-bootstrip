package com.earlybird.server.sys;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.earlybird.common.utils.StringUtils;
import com.earlybird.dao.sys.AdminRoleDao;
import com.earlybird.dao.sys.RolePermsDao;
import com.earlybird.entity.sys.AdminRole;
import com.earlybird.entity.sys.AdminRoleDetail;
import com.earlybird.entity.sys.Role;

@Service ("adminAuthPermService")
public class AdminAuthPermService  implements Serializable {

	@Autowired
	private AdminRoleDao adminDao;
	@Autowired
	private RolePermsDao rolePermsDao;
	@Autowired
	private AdminRoleDao adminRoleDao;
	
	
	public Map<String, Object> getPermissionByUserName(String userName) {
		Map<String, Object> userInfo = new HashMap<String, Object>();
		String roleId = null;
		
		AdminRoleDetail  cnAdminRoleInfo = this.adminRoleDao.queryAdminRoleByUserName(userName);
		
		userInfo.put("adminRoleInfo", cnAdminRoleInfo);
	
		roleId = cnAdminRoleInfo.getRoleId();
		Role roleInfo = rolePermsDao.selectPermsByRoleId(roleId);		
		userInfo.put("rolePermsInfo", roleInfo);

		return userInfo;
	}

	public boolean updatePermissionByUserName() {
		return false;
	}

	public boolean deletePermissionByUserName() {
		return false;
	}
	
}
