package com.jhl.entity.pojo;

public class Productcustomers {
    private String custName;

    private String custContact;

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName == null ? null : custName.trim();
    }

    public String getCustContact() {
        return custContact;
    }

    public void setCustContact(String custContact) {
        this.custContact = custContact == null ? null : custContact.trim();
    }
}