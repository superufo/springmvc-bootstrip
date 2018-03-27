package org.test.entity;

import java.util.Date;

public class CnRole {
    private Integer roleId;

    private String roleName;

    private String roleDeleteReason;

    private Date roleCreatedate;

    private Date roleModifydate;

    private String roleDeleted;

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    public String getRoleDeleteReason() {
        return roleDeleteReason;
    }

    public void setRoleDeleteReason(String roleDeleteReason) {
        this.roleDeleteReason = roleDeleteReason == null ? null : roleDeleteReason.trim();
    }

    public Date getRoleCreatedate() {
        return roleCreatedate;
    }

    public void setRoleCreatedate(Date roleCreatedate) {
        this.roleCreatedate = roleCreatedate;
    }

    public Date getRoleModifydate() {
        return roleModifydate;
    }

    public void setRoleModifydate(Date roleModifydate) {
        this.roleModifydate = roleModifydate;
    }

    public String getRoleDeleted() {
        return roleDeleted;
    }

    public void setRoleDeleted(String roleDeleted) {
        this.roleDeleted = roleDeleted == null ? null : roleDeleted.trim();
    }
}