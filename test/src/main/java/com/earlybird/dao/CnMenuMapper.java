package com.earlybird.dao;

import com.earlybird.entity.CnMenu;

public interface CnMenuMapper {
    int deleteByPrimaryKey(String id);

    int insert(CnMenu record);

    int insertSelective(CnMenu record);

    CnMenu selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(CnMenu record);

    int updateByPrimaryKey(CnMenu record);
}