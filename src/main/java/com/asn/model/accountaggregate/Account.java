package com.asn.model.accountaggregate;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Account {
    private final String accountNumber;
    private final AccountHolder accountHolder;
    private Money balance; // 使用Money值对象表示余额
    private final LocalDateTime createdAt;

    public Account(String accountNumber, AccountHolder accountHolder, String currency) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = new Money(BigDecimal.ZERO, currency); // 初始余额设置为0
        this.createdAt = LocalDateTime.now(); // 账户创建时间
    }

    // Getter方法
    public String getAccountNumber() {
        return accountNumber;
    }

    public AccountHolder getAccountHolder() {
        return accountHolder;
    }

    public Money getBalance() {
        return balance;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    // 存款方法
    public void deposit(Money amount) {
        if (amount.getAmount().compareTo(BigDecimal.ZERO) > 0) {
            if (!amount.getCurrency().equals(this.balance.getCurrency())) {
                throw new IllegalArgumentException("Currency mismatch.");
            }
            this.balance = new Money(this.balance.getAmount().add(amount.getAmount()), this.balance.getCurrency());
        } else {
            throw new IllegalArgumentException("Deposit amount must be positive.");
        }
    }

    // toString方法便于调试
    @Override
    public String toString() {
        return "Account{" +
                "accountNumber='" + accountNumber + '\'' +
                ", accountHolder=" + accountHolder +
                ", balance=" + balance +
                ", createdAt=" + createdAt +
                '}';
    }

    public void debit(Money amount) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'debit'");
    }

    public void credit(Money amount) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'credit'");
    }
}
