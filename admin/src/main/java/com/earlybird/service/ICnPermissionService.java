package com.earlybird.service;

import com.earlybird.entity.CnPermission;

public interface ICnPermissionService {
    int deleteByPrimaryKey(Long id);

    int insert(CnPermission record);

    int insertSelective(CnPermission record);

    CnPermission selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CnPermission record);

    int updateByPrimaryKey(CnPermission record);
}