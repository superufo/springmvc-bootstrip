package com.earlybird.dao.sys;

import com.earlybird.dao.annotation.MyBatisDao;
import com.earlybird.entity.sys.Role;
import com.earlybird.entity.sys.RolePerms;

@MyBatisDao
public interface RolePermsDao {
    int deleteByPrimaryKey(String id);

    int insert(RolePerms record);

    int insertSelective(RolePerms record);

    RolePerms selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(RolePerms record);

    int updateByPrimaryKey(RolePerms record);

	Role selectPermsByRoleId(String roleId);
}