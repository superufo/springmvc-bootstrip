package com.earlybird.dao;

import com.earlybird.entity.CnAdminRole;

import com.earlybird.entity.CnAdminRoleDetail;

public interface CnAdminRoleDao {
    int deleteByPrimaryKey(Integer id);

    int insert(CnAdminRole record);

    int insertSelective(CnAdminRole record);

    CnAdminRole selectByPrimaryKey(Integer id);

    CnAdminRole selectByadminId(Integer adminId);
    
    CnAdminRoleDetail  selectAdminRoleByUserName(String userName);
    
    int updateByPrimaryKeySelective(CnAdminRole record);

    int updateByPrimaryKey(CnAdminRole record);
}