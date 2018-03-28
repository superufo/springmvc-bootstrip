package org.test.impl;

import org.test.entity.CnAdmin;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.test.dao.CnAdminDao;
import org.test.service.ICnAdminService;

@Service("ICnAdminService")
public class CnAdminServiceImpl implements ICnAdminService {

	@Resource
	private CnAdminDao cnAdminDao;
	
	@Override
	public CnAdmin getAdminInfoByid(int id) {
		// TODO Auto-generated method stub
		return this.cnAdminDao.selectByPrimaryKey(id);
	}
}
