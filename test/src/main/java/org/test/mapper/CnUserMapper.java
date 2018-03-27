package org.test.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.test.entity.CnUser;
import org.test.entity.CnUserExample;

public interface CnUserMapper {
    int countByExample(CnUserExample example);

    int deleteByExample(CnUserExample example);

    int deleteByPrimaryKey(String openid);

    int insert(CnUser record);

    int insertSelective(CnUser record);

    List<CnUser> selectByExample(CnUserExample example);

    CnUser selectByPrimaryKey(String openid);

    int updateByExampleSelective(@Param("record") CnUser record, @Param("example") CnUserExample example);

    int updateByExample(@Param("record") CnUser record, @Param("example") CnUserExample example);

    int updateByPrimaryKeySelective(CnUser record);

    int updateByPrimaryKey(CnUser record);
}