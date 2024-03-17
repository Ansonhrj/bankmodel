package com.asn.model.accountaggregate;

import java.util.UUID;

public class AccountCreationService {

    public Account createAccount(String holderName, String email, String currency) {
        // 生成唯一的账号
        String accountNumber = generateUniqueAccountNumber();

        // 创建账户持有人实例
        AccountHolder accountHolder = new AccountHolder(UUID.randomUUID().toString(), holderName, email);

        // 创建账户实例
        Account newAccount = new Account(accountNumber, accountHolder, currency);

        // 返回创建的账户实例
        return newAccount;
    }

    private String generateUniqueAccountNumber() {
        // 这里只是示例生成方法，实际中应根据业务规则生成账号
        return "ACC-" + UUID.randomUUID().toString().substring(0, 8).toUpperCase();
    }
}
