package com.pnb.azure.deposits.web.dto;

import java.math.BigDecimal;
import java.time.Instant;

public record PostingResult(
        String accountNumber,
        String transactionId,
        BigDecimal ledgerBalance,
        BigDecimal availableBalance,
        String status,
        Instant postedAt) {}
