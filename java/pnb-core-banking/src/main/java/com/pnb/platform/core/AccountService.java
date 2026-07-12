package com.pnb.platform.core;

import java.math.BigDecimal;

public class AccountService {
    public BigDecimal applyLedgerPosting(BigDecimal currentBalance, BigDecimal postingAmount) {
        if (currentBalance == null || postingAmount == null) {
            throw new IllegalArgumentException("Balance and posting amount are required");
        }
        return currentBalance.add(postingAmount);
    }
}
