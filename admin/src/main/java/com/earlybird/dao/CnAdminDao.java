package com.earlybird.dao;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.earlybird.entity.CnAdmin;

public interface CnAdminDao {
    int deleteByPrimaryKey(Integer id);

    int insert(CnAdmin record);

    int insertSelective(CnAdmin record);

    CnAdmin selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CnAdmin record);

    int updateByPrimaryKey(CnAdmin record);
    
    CnAdmin selectByLoginInfo(String userName,String pwd);
}