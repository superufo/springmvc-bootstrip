package com.earlybird.dao.sys;

import com.earlybird.dao.annotation.MyBatisDao;
import com.earlybird.entity.BaseEntity;
import com.earlybird.entity.sys.AdminRole;

import com.earlybird.entity.sys.AdminRoleDetail;

@MyBatisDao
public interface AdminRoleDao {
	 AdminRoleDetail queryAdminRoleByUserName(String userName);
}
