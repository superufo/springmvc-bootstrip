package org.test.mapper;

import org.test.entity.CnAdmin;

public interface CnAdminMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CnAdmin record);

    int insertSelective(CnAdmin record);

    CnAdmin selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CnAdmin record);

    int updateByPrimaryKey(CnAdmin record);
}