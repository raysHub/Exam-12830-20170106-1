package com.ray.dto;

import java.sql.Date;

public class Customer {

    private Long customerId;

    private String firstName;

    private String lastName;

    private String email;

    private long addressId;

    private byte active;

    private Date createDate;

    private Date lastUpdate;

    public Long getCustomerId() {
        return customerId;
    }

    public Customer setCustomerId(Long customerId) {
        this.customerId = customerId;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public Customer setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public Customer setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public Customer setEmail(String email) {
        this.email = email;
        return this;
    }

    public long getAddressId() {
        return addressId;
    }

    public Customer setAddressId(long addressId) {
        this.addressId = addressId;
        return this;
    }

    public byte getActive() {
        return active;
    }

    public Customer setActive(byte active) {
        this.active = active;
        return this;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public Customer setCreateDate(Date createDate) {
        this.createDate = createDate;
        return this;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public Customer setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
        return this;
    }

}
