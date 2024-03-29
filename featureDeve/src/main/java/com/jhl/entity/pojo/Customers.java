package com.jhl.entity.pojo;

import java.util.Date;

public class Customers {
    private Integer custId;

    private String custName;

    private String custAddress;

    private String custCity;

    private String custState;

    private String custZip;

    private String custCountry;

    private String custContact;

    private String custEmail;

    private Integer custAge;

    private String custMobile;

    private String custIdType;

    private String custIdNo;

    private Date createTime;

    private Date updateTime;

    public Integer getCustId() {
        return custId;
    }

    public void setCustId(Integer custId) {
        this.custId = custId;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName == null ? null : custName.trim();
    }

    public String getCustAddress() {
        return custAddress;
    }

    public void setCustAddress(String custAddress) {
        this.custAddress = custAddress == null ? null : custAddress.trim();
    }

    public String getCustCity() {
        return custCity;
    }

    public void setCustCity(String custCity) {
        this.custCity = custCity == null ? null : custCity.trim();
    }

    public String getCustState() {
        return custState;
    }

    public void setCustState(String custState) {
        this.custState = custState == null ? null : custState.trim();
    }

    public String getCustZip() {
        return custZip;
    }

    public void setCustZip(String custZip) {
        this.custZip = custZip == null ? null : custZip.trim();
    }

    public String getCustCountry() {
        return custCountry;
    }

    public void setCustCountry(String custCountry) {
        this.custCountry = custCountry == null ? null : custCountry.trim();
    }

    public String getCustContact() {
        return custContact;
    }

    public void setCustContact(String custContact) {
        this.custContact = custContact == null ? null : custContact.trim();
    }

    public String getCustEmail() {
        return custEmail;
    }

    public void setCustEmail(String custEmail) {
        this.custEmail = custEmail == null ? null : custEmail.trim();
    }

    public Integer getCustAge() {
        return custAge;
    }

    public void setCustAge(Integer custAge) {
        this.custAge = custAge;
    }

    public String getCustMobile() {
        return custMobile;
    }

    public void setCustMobile(String custMobile) {
        this.custMobile = custMobile == null ? null : custMobile.trim();
    }

    public String getCustIdType() {
        return custIdType;
    }

    public void setCustIdType(String custIdType) {
        this.custIdType = custIdType == null ? null : custIdType.trim();
    }

    public String getCustIdNo() {
        return custIdNo;
    }

    public void setCustIdNo(String custIdNo) {
        this.custIdNo = custIdNo == null ? null : custIdNo.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}