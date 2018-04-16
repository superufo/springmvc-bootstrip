package com.earlybird.dao.sys;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.earlybird.dao.annotation.MyBatisDao;
import com.earlybird.entity.sys.Role;
import com.earlybird.entity.sys.RolePermsDetail;

@MyBatisDao
public interface RoleDao {
    int delete(String id);

    int insert(Role record);

    Role queryById(String id);
 
    Role queryPermsByRoleId(String roleid);
    
    ArrayList<Role> query();
}