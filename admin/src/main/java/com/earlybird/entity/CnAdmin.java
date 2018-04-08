package com.earlybird.entity;

import java.util.Date;

import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Length;

/**
 * Bean Validation 中内置的 constraint       
 * @Null   被注释的元素必须为 null       
 * @NotNull    被注释的元素必须不为 null       
 * @AssertTrue     被注释的元素必须为 true       
 * @AssertFalse    被注释的元素必须为 false       
 * @Min(value)     被注释的元素必须是一个数字，其值必须大于等于指定的最小值       
 * @Max(value)     被注释的元素必须是一个数字，其值必须小于等于指定的最大值       
 * @DecimalMin(value)  被注释的元素必须是一个数字，其值必须大于等于指定的最小值       
 * @DecimalMax(value)  被注释的元素必须是一个数字，其值必须小于等于指定的最大值       
 * @Size(max=, min=)   被注释的元素的大小必须在指定的范围内       
 * @Digits (integer, fraction)     被注释的元素必须是一个数字，其值必须在可接受的范围内       
 * @Past   被注释的元素必须是一个过去的日期       
 * @Future     被注释的元素必须是一个将来的日期       
 * @Pattern(regex=,flag=)  被注释的元素必须符合指定的正则表达式       
 * Hibernate Validator 附加的 constraint       
 * @NotBlank(message =)   验证字符串非null，且长度必须大于0       
 * @Email  被注释的元素必须是电子邮箱地址       
 * @Length(min=,max=)  被注释的字符串的大小必须在指定的范围内       
 * @NotEmpty   被注释的字符串的必须非空       
 * @Range(min=,max=,message=)  被注释的元素必须在合适的范围内 
 */
public class CnAdmin {
    private Integer id;

    @NotEmpty(message="{cnAdmin.userName.not.empty}")
    @Length(min=6,max=18,message="{cnAdmin.userName.size}")  
    private String userName;

    private String name;

    @NotEmpty(message="{cnAdmin.password.not.empty}")
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