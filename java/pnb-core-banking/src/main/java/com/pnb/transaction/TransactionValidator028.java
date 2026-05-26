package com.pnb.transaction;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * TransactionValidator028 — Business rule validation.
 */
@ApplicationScoped
public class TransactionValidator028 {

    public List<String> validate(TransactionDto028 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("transaction DTO must not be null");
            return errors;
        }
        if (dto.getTranField001() != null && dto.getTranField001() < 0) {
            errors.add("tranField001 must not be negative");
        }
        if (dto.getTranField002() != null && dto.getTranField002() < 0) {
            errors.add("tranField002 must not be negative");
        }
        if (dto.getTranField003() != null && dto.getTranField003().isBlank()) {
            errors.add("tranField003 must not be blank if provided");
        }
        if (dto.getTranField004() != null && dto.getTranField004().isBlank()) {
            errors.add("tranField004 must not be blank if provided");
        }
        if (dto.getTranField005() != null && dto.getTranField005() < 0) {
            errors.add("tranField005 must not be negative");
        }
        if (dto.getTranField006() != null && dto.getTranField006().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("tranField006 must not be negative");
        }
        if (dto.getTranField008() != null && dto.getTranField008() < 0) {
            errors.add("tranField008 must not be negative");
        }
        if (dto.getTranField010() != null && dto.getTranField010().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("tranField010 must not be negative");
        }
        return errors;
    }
}
