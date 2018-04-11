package com.earlybird.dao;

import com.earlybird.entity.CnPermission;

public interface CnPermissionDao {
    int deleteByPrimaryKey(Long id);

    int insert(CnPermission record);

    int insertSelective(CnPermission record);

    CnPermission selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CnPermission record);

    int updateByPrimaryKey(CnPermission record);
}