package com.asn.controller;

import com.asn.application.AccountApplicationService;
import com.asn.dto.AccountCreationRequest;
import com.asn.model.accountaggregate.Account;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

    private final AccountApplicationService accountService;

    public AccountController(AccountApplicationService accountService) {
        this.accountService = accountService;
    }

    @PostMapping("/accounts")
    public Account createAccount(@RequestBody AccountCreationRequest request) {
        return accountService.createNewAccount(request.getHolderName(), request.getEmail(), request.getCurrency());
    }

    // 定义AccountCreationRequest DTO来接收请求数据
}
