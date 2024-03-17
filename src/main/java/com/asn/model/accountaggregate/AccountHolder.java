package com.asn.model.accountaggregate;

public class AccountHolder {
    private final String id;
    private final String name;
    private final String email;

    public AccountHolder(String id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    // Getters
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    // toString method for debugging purposes
    @Override
    public String toString() {
        return "AccountHolder{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
