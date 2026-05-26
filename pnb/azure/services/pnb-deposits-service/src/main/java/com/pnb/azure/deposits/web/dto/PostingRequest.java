package com.pnb.azure.deposits.web.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import java.math.BigDecimal;

public record PostingRequest(
        @NotBlank String transactionId,
        @NotNull BigDecimal amount,
        @NotBlank String channel,
        String narrative) {}
