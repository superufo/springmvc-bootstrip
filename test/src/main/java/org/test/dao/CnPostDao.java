package org.test.dao;

import org.test.entity.CnPost;
import org.test.entity.CnPostWithBLOBs;

public interface CnPostDao {
    int deleteByPrimaryKey(String code);

    int insert(CnPostWithBLOBs record);

    int insertSelective(CnPostWithBLOBs record);

    CnPostWithBLOBs selectByPrimaryKey(String code);

    int updateByPrimaryKeySelective(CnPostWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(CnPostWithBLOBs record);

    int updateByPrimaryKey(CnPost record);
}