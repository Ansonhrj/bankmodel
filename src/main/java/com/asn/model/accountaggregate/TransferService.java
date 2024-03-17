package com.asn.model.accountaggregate;

public class TransferService {

    public void transfer(Account source, Account target, Money amount) {
        // 确认源账户有足够的余额
        if (source.getBalance().getAmount().compareTo(amount.getAmount()) < 0) {
            throw new IllegalArgumentException("Insufficient balance.");
        }

        // 扣减源账户余额
        source.debit(amount);
        
        // 增加目标账户余额
        target.credit(amount);
        
        // 记录交易、更新账户状态等...
    }
}

