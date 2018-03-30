package org.test.impl;

import org.test.entity.CnAdmin;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.test.dao.CnAdminDao;
import org.test.service.ICnAdminService;

@Service("cnAdminServiceImpl")
public class CnAdminServiceImpl implements ICnAdminService {

	@Autowired
	private CnAdminDao cnAdminDao;
	
	
	@Override
	public CnAdmin getAdminInfoByid(int id) {
		// TODO Auto-generated method stub
		return this.cnAdminDao.selectByPrimaryKey(id);
	}
}
