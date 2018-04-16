package com.earlybird.server.sys;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.earlybird.dao.sys.AdminDao;
import com.earlybird.dao.sys.PermsDao;
import com.earlybird.entity.sys.Perms;

@Service("permsService")
public class PermsService{
	
	@Autowired
	private PermsDao permsDao;
	
	public ArrayList<Perms> query() {
		return this.permsDao.query();
	}


	public ArrayList<Perms> selectlimitsByRole(String roleId) {
		return this.permsDao.queryByRole(roleId);
	}

}
