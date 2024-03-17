package com.asn.application;

import com.asn.model.accountaggregate.Account;
import com.asn.model.accountaggregate.AccountCreationService;

public class AccountApplicationService {

    private final AccountCreationService accountCreationService;

    public AccountApplicationService(AccountCreationService accountCreationService) {
        this.accountCreationService = accountCreationService;
    }

    public Account createNewAccount(String holderName, String email, String currency) {
        // 这里可以添加应用层面的逻辑，比如权限校验、日志记录等
        return accountCreationService.createAccount(holderName, email, currency);
    }

    // 这里可以添加其他业务逻辑，如账户转账、查询账户信息等
}

