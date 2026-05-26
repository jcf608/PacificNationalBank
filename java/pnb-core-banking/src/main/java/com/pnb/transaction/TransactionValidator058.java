package com.pnb.transaction;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * TransactionValidator058 — Business rule validation.
 */
@ApplicationScoped
public class TransactionValidator058 {

    public List<String> validate(TransactionDto058 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("transaction DTO must not be null");
            return errors;
        }
        if (dto.getTranField001() != null && dto.getTranField001().isBlank()) {
            errors.add("tranField001 must not be blank if provided");
        }
        if (dto.getTranField002() != null && dto.getTranField002() < 0) {
            errors.add("tranField002 must not be negative");
        }
        if (dto.getTranField003() != null && dto.getTranField003().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("tranField003 must not be negative");
        }
        if (dto.getTranField004() != null && dto.getTranField004().isBlank()) {
            errors.add("tranField004 must not be blank if provided");
        }
        if (dto.getTranField008() != null && dto.getTranField008() < 0) {
            errors.add("tranField008 must not be negative");
        }
        if (dto.getTranField009() != null && dto.getTranField009() < 0) {
            errors.add("tranField009 must not be negative");
        }
        if (dto.getTranField014() != null && dto.getTranField014().isBlank()) {
            errors.add("tranField014 must not be blank if provided");
        }
        if (dto.getTranField015() != null && dto.getTranField015().isBlank()) {
            errors.add("tranField015 must not be blank if provided");
        }
        return errors;
    }
}
