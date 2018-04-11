package com.earlybird.service;

import com.earlybird.entity.CnRole;

public interface ICnRoleService {
    int deleteByPrimaryKey(String id);

    int insert(CnRole record);

    int insertSelective(CnRole record);

    CnRole selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(CnRole record);

    int updateByPrimaryKey(CnRole record);
}