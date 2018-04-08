package com.earlybird.impl;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.earlybird.dao.CnAdminDao;
import com.earlybird.entity.CnAdmin;
import com.earlybird.service.ICnAdminService;

@Service("cnAdminServiceImpl")
public class CnAdminServiceImpl implements ICnAdminService {

	@Autowired
	private CnAdminDao cnAdminDao;
	
	
	@Override
	public CnAdmin getAdminInfoByid(int id) {
		// TODO Auto-generated method stub
		return this.cnAdminDao.selectByPrimaryKey(id);
	}
	
	@Override
	public CnAdmin selectByLoginInfo(String userName,String pwd) {
		// TODO Auto-generated method stub
		return this.cnAdminDao.selectByLoginInfo(userName,pwd);
	}
	
}
