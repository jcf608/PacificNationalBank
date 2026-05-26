package com.pnb.transaction;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * TransactionValidator026 — Business rule validation.
 */
@ApplicationScoped
public class TransactionValidator026 {

    public List<String> validate(TransactionDto026 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("transaction DTO must not be null");
            return errors;
        }
        if (dto.getTranField002() != null && dto.getTranField002().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("tranField002 must not be negative");
        }
        if (dto.getTranField003() != null && dto.getTranField003().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("tranField003 must not be negative");
        }
        if (dto.getTranField007() != null && dto.getTranField007().isBlank()) {
            errors.add("tranField007 must not be blank if provided");
        }
        if (dto.getTranField009() != null && dto.getTranField009() < 0) {
            errors.add("tranField009 must not be negative");
        }
        return errors;
    }
}
