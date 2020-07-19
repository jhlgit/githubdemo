package com.jhl.entity.podo;

import org.springframework.stereotype.Component;

import java.util.Date;
@Component
public class Operation {
    private Double logId;

    private Integer custId;

    private Date createTime;

    private Date updateTime;

    private String content;

    private String remark;

    public Double getLogId() {
        return logId;
    }

    public void setLogId(Double logId) {
        this.logId = logId;
    }

    public Integer getCustId() {
        return custId;
    }

    public void setCustId(Integer custId) {
        this.custId = custId;
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}