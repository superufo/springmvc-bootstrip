package org.test.mapper;

import org.test.entity.CnCustomer;

public interface CnCustomerMapper {
    int deleteByPrimaryKey(String code);

    int insert(CnCustomer record);

    int insertSelective(CnCustomer record);

    CnCustomer selectByPrimaryKey(String code);

    int updateByPrimaryKeySelective(CnCustomer record);

    int updateByPrimaryKeyWithBLOBs(CnCustomer record);

    int updateByPrimaryKey(CnCustomer record);
}