package com.pnb.transaction;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * TransactionValidator053 — Business rule validation.
 */
@ApplicationScoped
public class TransactionValidator053 {

    public List<String> validate(TransactionDto053 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("transaction DTO must not be null");
            return errors;
        }
        if (dto.getTranField001() != null && dto.getTranField001().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("tranField001 must not be negative");
        }
        if (dto.getTranField004() != null && dto.getTranField004().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("tranField004 must not be negative");
        }
        if (dto.getTranField009() != null && dto.getTranField009().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("tranField009 must not be negative");
        }
        if (dto.getTranField010() != null && dto.getTranField010() < 0) {
            errors.add("tranField010 must not be negative");
        }
        if (dto.getTranField011() != null && dto.getTranField011().isBlank()) {
            errors.add("tranField011 must not be blank if provided");
        }
        if (dto.getTranField012() != null && dto.getTranField012().isBlank()) {
            errors.add("tranField012 must not be blank if provided");
        }
        return errors;
    }
}
