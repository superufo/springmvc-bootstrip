package com.earlybird.dao.sys;

import java.util.ArrayList;

import com.earlybird.dao.annotation.MyBatisDao;
import com.earlybird.entity.sys.Perms;

@MyBatisDao
public interface PermsDao {
    ArrayList<Perms> queryByRole(String roleId);
	ArrayList<Perms> query();
	ArrayList<Perms> queryByPercode();
	
	boolean insert(Perms perms); 
	boolean deleteByPercode(String percode);
	boolean updateByPercode(String percode);
}