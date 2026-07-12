package com.pnb.platform.channel;

import com.pnb.platform.core.AccountService;
import java.math.BigDecimal;

public class TransferApi {
    private final AccountService accountService = new AccountService();

    public BigDecimal previewTransfer(BigDecimal sourceBalance, BigDecimal transferAmount) {
        return accountService.applyLedgerPosting(sourceBalance, transferAmount.negate());
    }
}
