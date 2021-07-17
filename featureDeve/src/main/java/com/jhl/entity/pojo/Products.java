package com.jhl.entity.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class Products {
    private String prodId;

    private Integer vendId;

    private String prodName;

    private BigDecimal prodPrice;

    private Date createTime;

    private Date updateTime;

    private String prodDesc;

    public String getProdId() {
        return prodId;
    }

    public void setProdId(String prodId) {
        this.prodId = prodId == null ? null : prodId.trim();
    }

    public Integer getVendId() {
        return vendId;
    }

    public void setVendId(Integer vendId) {
        this.vendId = vendId;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName == null ? null : prodName.trim();
    }

    public BigDecimal getProdPrice() {
        return prodPrice;
    }

    public void setProdPrice(BigDecimal prodPrice) {
        this.prodPrice = prodPrice;
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

    public String getProdDesc() {
        return prodDesc;
    }

    public void setProdDesc(String prodDesc) {
        this.prodDesc = prodDesc == null ? null : prodDesc.trim();
    }
}