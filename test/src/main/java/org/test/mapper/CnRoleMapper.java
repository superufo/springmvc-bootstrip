package org.test.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.test.entity.CnRole;
import org.test.entity.CnRoleExample;

public interface CnRoleMapper {
    int countByExample(CnRoleExample example);

    int deleteByExample(CnRoleExample example);

    int deleteByPrimaryKey(Integer roleId);

    int insert(CnRole record);

    int insertSelective(CnRole record);

    List<CnRole> selectByExample(CnRoleExample example);

    CnRole selectByPrimaryKey(Integer roleId);

    int updateByExampleSelective(@Param("record") CnRole record, @Param("example") CnRoleExample example);

    int updateByExample(@Param("record") CnRole record, @Param("example") CnRoleExample example);

    int updateByPrimaryKeySelective(CnRole record);

    int updateByPrimaryKey(CnRole record);
}