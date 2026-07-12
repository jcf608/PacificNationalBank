package com.pnb.platform.core;

import java.math.BigDecimal;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class AccountServiceTest {
    @Test
    void applyLedgerPostingAddsAmount() {
        AccountService svc = new AccountService();
        assertEquals(new BigDecimal("110.25"), svc.applyLedgerPosting(new BigDecimal("100.00"), new BigDecimal("10.25")));
    }
}
