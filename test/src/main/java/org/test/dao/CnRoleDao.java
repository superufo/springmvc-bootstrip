package org.test.dao;

import org.test.entity.CnRole;

public interface CnRoleDao {
    int deleteByPrimaryKey(Integer roleId);

    int insert(CnRole record);

    int insertSelective(CnRole record);

    CnRole selectByPrimaryKey(Integer roleId);

    int updateByPrimaryKeySelective(CnRole record);

    int updateByPrimaryKey(CnRole record);
}