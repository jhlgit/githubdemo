package com.jhl.entity.pojo;

import java.util.Date;

public class Vendors {
    private Integer vendId;

    private String vendName;

    private String vendAddress;

    private String vendCity;

    private String vendState;

    private String vendZip;

    private String vendCountry;

    private Date createTime;

    private Date updateTime;

    public Integer getVendId() {
        return vendId;
    }

    public void setVendId(Integer vendId) {
        this.vendId = vendId;
    }

    public String getVendName() {
        return vendName;
    }

    public void setVendName(String vendName) {
        this.vendName = vendName == null ? null : vendName.trim();
    }

    public String getVendAddress() {
        return vendAddress;
    }

    public void setVendAddress(String vendAddress) {
        this.vendAddress = vendAddress == null ? null : vendAddress.trim();
    }

    public String getVendCity() {
        return vendCity;
    }

    public void setVendCity(String vendCity) {
        this.vendCity = vendCity == null ? null : vendCity.trim();
    }

    public String getVendState() {
        return vendState;
    }

    public void setVendState(String vendState) {
        this.vendState = vendState == null ? null : vendState.trim();
    }

    public String getVendZip() {
        return vendZip;
    }

    public void setVendZip(String vendZip) {
        this.vendZip = vendZip == null ? null : vendZip.trim();
    }

    public String getVendCountry() {
        return vendCountry;
    }

    public void setVendCountry(String vendCountry) {
        this.vendCountry = vendCountry == null ? null : vendCountry.trim();
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