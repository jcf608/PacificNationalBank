package com.pnb.transaction;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * TransactionValidator020 — Business rule validation.
 */
@ApplicationScoped
public class TransactionValidator020 {

    public List<String> validate(TransactionDto020 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("transaction DTO must not be null");
            return errors;
        }
        if (dto.getTranField000() != null && dto.getTranField000().isBlank()) {
            errors.add("tranField000 must not be blank if provided");
        }
        if (dto.getTranField004() != null && dto.getTranField004() < 0) {
            errors.add("tranField004 must not be negative");
        }
        if (dto.getTranField006() != null && dto.getTranField006().isBlank()) {
            errors.add("tranField006 must not be blank if provided");
        }
        if (dto.getTranField009() != null && dto.getTranField009().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("tranField009 must not be negative");
        }
        if (dto.getTranField011() != null && dto.getTranField011() < 0) {
            errors.add("tranField011 must not be negative");
        }
        if (dto.getTranField012() != null && dto.getTranField012() < 0) {
            errors.add("tranField012 must not be negative");
        }
        return errors;
    }
}
