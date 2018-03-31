package com.earlybird.entity;

import java.util.Date;

public class CnPost {
    private String code;

    private String name;

    private String fulljob;

    private String description;

    private String customerCode;

    private String customerName;

    private String departmentCode;

    private String departmentName;

    private Date startDate;

    private Date endDate;

    private Byte enabled;

    private Byte status;

    private String needNum;

    private Integer handleNum;

    private Integer finishNum;

    private String province;

    private String city;

    private String town;

    private String street;

    private Integer minMoney;

    private Integer maxMoney;

    private Integer workYear;

    private String education;

    private String mode;

    private Date keyinDate;

    private String keyinUser;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getFulljob() {
        return fulljob;
    }

    public void setFulljob(String fulljob) {
        this.fulljob = fulljob == null ? null : fulljob.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode == null ? null : customerCode.trim();
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName == null ? null : customerName.trim();
    }

    public String getDepartmentCode() {
        return departmentCode;
    }

    public void setDepartmentCode(String departmentCode) {
        this.departmentCode = departmentCode == null ? null : departmentCode.trim();
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName == null ? null : departmentName.trim();
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Byte getEnabled() {
        return enabled;
    }

    public void setEnabled(Byte enabled) {
        this.enabled = enabled;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public String getNeedNum() {
        return needNum;
    }

    public void setNeedNum(String needNum) {
        this.needNum = needNum == null ? null : needNum.trim();
    }

    public Integer getHandleNum() {
        return handleNum;
    }

    public void setHandleNum(Integer handleNum) {
        this.handleNum = handleNum;
    }

    public Integer getFinishNum() {
        return finishNum;
    }

    public void setFinishNum(Integer finishNum) {
        this.finishNum = finishNum;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town == null ? null : town.trim();
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street == null ? null : street.trim();
    }

    public Integer getMinMoney() {
        return minMoney;
    }

    public void setMinMoney(Integer minMoney) {
        this.minMoney = minMoney;
    }

    public Integer getMaxMoney() {
        return maxMoney;
    }

    public void setMaxMoney(Integer maxMoney) {
        this.maxMoney = maxMoney;
    }

    public Integer getWorkYear() {
        return workYear;
    }

    public void setWorkYear(Integer workYear) {
        this.workYear = workYear;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education == null ? null : education.trim();
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode == null ? null : mode.trim();
    }

    public Date getKeyinDate() {
        return keyinDate;
    }

    public void setKeyinDate(Date keyinDate) {
        this.keyinDate = keyinDate;
    }

    public String getKeyinUser() {
        return keyinUser;
    }

    public void setKeyinUser(String keyinUser) {
        this.keyinUser = keyinUser == null ? null : keyinUser.trim();
    }
}