package com.earlybird.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;

import com.earlybird.dao.CnAdminDao;
import com.earlybird.dao.CnAdminRoleDao;
import com.earlybird.service.ICnAdminAuthMenuPerm;
import com.earlybird.entity.CnMenu;
import com.earlybird.entity.CnAdmin;
import com.earlybird.entity.CnRole;

import com.earlybird.entity.CnAdminRoleDetail;


public class ICnAdminAuthMenuPermServiceImpl  implements ICnAdminAuthMenuPerm {

	@Autowired
	private CnAdminDao cnAdminDao;
	@Autowired
	private CnAdminRoleDao cnAdminRoleDao;
	
	
	@Override
	public ArrayList<CnMenu> getMenuPermissionByUserName(String userName) {
		// TODO Auto-generated method stub
		CnAdminRoleDetail  cnAdminRoleInfo = this.cnAdminRoleDao.selectAdminRoleByUserName(userName);
		
		
		
		
		return null;
	}

	@Override
	public boolean updateMenuPermissionByUserName() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteMenuPermissionByUserName() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ArrayList<CnMenu> getMenuPermissionByUserName() {
		// TODO Auto-generated method stub
		return null;
	}

	@SuppressWarnings("rawtypes")
	@Override
	public Map getCnAdminDetail(String userName) throws DataAccessException {
		// TODO Auto-generated method stub
		HashMap<String,Object> adminDetailMap = new HashMap<>(); 
		
		CnAdminRoleDetail  cnAdminRoleInfo = this.cnAdminRoleDao.selectAdminRoleByUserName(userName);
		
	    adminDetailMap.put("adminInfo", cnAdminRoleInfo.getAdminId());
		
		
		
		return null;
	}

}
