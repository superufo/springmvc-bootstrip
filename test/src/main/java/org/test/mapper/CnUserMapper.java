package org.test.mapper;

import org.test.entity.CnUser;

public interface CnUserMapper {
    int deleteByPrimaryKey(String openid);

    int insert(CnUser record);

    int insertSelective(CnUser record);

    CnUser selectByPrimaryKey(String openid);

    int updateByPrimaryKeySelective(CnUser record);

    int updateByPrimaryKey(CnUser record);
}