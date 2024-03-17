package com.asn.dto;

public class AccountCreationRequest {

    private String holderName;
    private String email;
    private String currency;

    // 必须有一个无参数的构造函数
    public AccountCreationRequest() {
    }

    // Getters 和 Setters
    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    // toString 方法，便于调试
    @Override
    public String toString() {
        return "AccountCreationRequest{" +
                "holderName='" + holderName + '\'' +
                ", email='" + email + '\'' +
                ", currency='" + currency + '\'' +
                '}';
    }
}

