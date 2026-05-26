package com.pnb.transaction;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * TransactionValidator040 — Business rule validation.
 */
@ApplicationScoped
public class TransactionValidator040 {

    public List<String> validate(TransactionDto040 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("transaction DTO must not be null");
            return errors;
        }
        if (dto.getTranField003() != null && dto.getTranField003().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("tranField003 must not be negative");
        }
        if (dto.getTranField004() != null && dto.getTranField004().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("tranField004 must not be negative");
        }
        if (dto.getTranField009() != null && dto.getTranField009() < 0) {
            errors.add("tranField009 must not be negative");
        }
        if (dto.getTranField011() != null && dto.getTranField011().isBlank()) {
            errors.add("tranField011 must not be blank if provided");
        }
        return errors;
    }
}
