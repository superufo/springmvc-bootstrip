package com.earlybird.server.sys;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.earlybird.dao.sys.AdminDao;
import com.earlybird.entity.sys.Admin;

@Service("adminService")
public class AdminService  {

	@Autowired
	private AdminDao adminDao;
	
	public Admin getAdminInfoByid(int id) {
		return this.adminDao.queryById(id);
	}
	
	public Admin selectByLoginInfo(String userName,String pwd) {
		return this.adminDao.queryByLoginInfo(userName,pwd);
	}


	public Admin selectByUserName(String userName) {
		return null;
	}

	public Admin selectByPrimaryKey(int id) {
		return null;
	}
	
}
