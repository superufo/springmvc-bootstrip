package com.earlybird.dao;

import com.earlybird.entity.CnRole;

public interface CnRoleMapper {
    int deleteByPrimaryKey(String id);

    int insert(CnRole record);

    int insertSelective(CnRole record);

    CnRole selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(CnRole record);

    int updateByPrimaryKey(CnRole record);
}