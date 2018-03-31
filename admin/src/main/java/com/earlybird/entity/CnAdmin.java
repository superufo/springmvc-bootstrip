package com.earlybird.entity;

import java.util.Date;

public class CnAdmin {
    private Integer id;

    private String userName;

    private String name;

    private String password;

    private String email;

    private String userLogin;

    private String deleteReason;

    private Date createdate;

    private Date modifydate;

    private String deleted;

    private String mobile;

    private Byte sex;

    private String imagin;

    private Date birth;

    private String identityId;

    private String fullName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getUserLogin() {
        return userLogin;
    }

    public void setUserLogin(String userLogin) {
        this.userLogin = userLogin == null ? null : userLogin.trim();
    }

    public String getDeleteReason() {
        return deleteReason;
    }

    public void setDeleteReason(String deleteReason) {
        this.deleteReason = deleteReason == null ? null : deleteReason.trim();
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public Date getModifydate() {
        return modifydate;
    }

    public void setModifydate(Date modifydate) {
        this.modifydate = modifydate;
    }

    public String getDeleted() {
        return deleted;
    }

    public void setDeleted(String deleted) {
        this.deleted = deleted == null ? null : deleted.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public Byte getSex() {
        return sex;
    }

    public void setSex(Byte sex) {
        this.sex = sex;
    }

    public String getImagin() {
        return imagin;
    }

    public void setImagin(String imagin) {
        this.imagin = imagin == null ? null : imagin.trim();
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public String getIdentityId() {
        return identityId;
    }

    public void setIdentityId(String identityId) {
        this.identityId = identityId == null ? null : identityId.trim();
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName == null ? null : fullName.trim();
    }
}