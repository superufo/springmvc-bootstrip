package com.earlybird.entity.sys;

import com.earlybird.entity.BaseEntity;

public class RolePerms extends BaseEntity<RolePerms> {
    private String id;

    private String roleId;

    private String permissionId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getSysRoleId() {
        return roleId;
    }

    public void setSysRoleId(String roleId) {
        this.roleId = roleId == null ? null : roleId.trim();
    }

    public String getSysPermissionId() {
        return permissionId;
    }

    public void setSysPermissionId(String permissionId) {
        this.permissionId = permissionId == null ? null : permissionId.trim();
    }
}