package com.earlybird.dao.sys;

import com.earlybird.dao.annotation.MyBatisDao;
import com.earlybird.entity.sys.Admin;

@MyBatisDao
public interface AdminDao {
	Admin  query();
	
    Admin queryByLoginInfo(String userName,String pwd);
    
    Admin queryByUserName(String userName);

	Admin queryById(int id);

	Admin deleteById(int id);
	
	boolean insert(Admin admin);
	
	boolean updateById(Admin admin);
}