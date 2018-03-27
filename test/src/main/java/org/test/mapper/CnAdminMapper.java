package org.test.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.test.entity.CnAdmin;
import org.test.entity.CnAdminExample;

public interface CnAdminMapper {
    int countByExample(CnAdminExample example);

    int deleteByExample(CnAdminExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CnAdmin record);

    int insertSelective(CnAdmin record);

    List<CnAdmin> selectByExample(CnAdminExample example);

    CnAdmin selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CnAdmin record, @Param("example") CnAdminExample example);

    int updateByExample(@Param("record") CnAdmin record, @Param("example") CnAdminExample example);

    int updateByPrimaryKeySelective(CnAdmin record);

    int updateByPrimaryKey(CnAdmin record);
}