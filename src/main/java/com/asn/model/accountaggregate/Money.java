package com.asn.model.accountaggregate;

import java.math.BigDecimal;

public final class Money {
    private final BigDecimal amount;
    private final String currency;

    public Money(BigDecimal amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    // Getters
    public BigDecimal getAmount() {
        return amount;
    }

    public String getCurrency() {
        return currency;
    }

    // 值对象应该是不可变的，因此不提供setters

    // 重写equals和hashCode方法来确保基于值的比较
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Money)) return false;
        Money money = (Money) o;
        return amount.equals(money.amount) && currency.equals(money.currency);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(amount, currency);
    }

    // toString方法便于输出表示
    @Override
    public String toString() {
        return amount + " " + currency;
    }
}
