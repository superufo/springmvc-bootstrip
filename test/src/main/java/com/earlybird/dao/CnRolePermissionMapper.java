package com.earlybird.dao;

import com.earlybird.entity.CnRolePermission;

public interface CnRolePermissionMapper {
    int deleteByPrimaryKey(String id);

    int insert(CnRolePermission record);

    int insertSelective(CnRolePermission record);

    CnRolePermission selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(CnRolePermission record);

    int updateByPrimaryKey(CnRolePermission record);
}