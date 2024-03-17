package com.asn.infrastructure;

import com.asn.model.accountaggregate.Account;

public interface AccountRepository {
    void save(Account account);
    Account findById(String accountId);
    // 其他可能的方法，如delete, update等
}
