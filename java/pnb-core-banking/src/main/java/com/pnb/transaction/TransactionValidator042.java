package com.pnb.transaction;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * TransactionValidator042 — Business rule validation.
 */
@ApplicationScoped
public class TransactionValidator042 {

    public List<String> validate(TransactionDto042 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("transaction DTO must not be null");
            return errors;
        }
        if (dto.getTranField001() != null && dto.getTranField001() < 0) {
            errors.add("tranField001 must not be negative");
        }
        if (dto.getTranField002() != null && dto.getTranField002().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("tranField002 must not be negative");
        }
        if (dto.getTranField008() != null && dto.getTranField008() < 0) {
            errors.add("tranField008 must not be negative");
        }
        if (dto.getTranField011() != null && dto.getTranField011().isBlank()) {
            errors.add("tranField011 must not be blank if provided");
        }
        if (dto.getTranField012() != null && dto.getTranField012() < 0) {
            errors.add("tranField012 must not be negative");
        }
        return errors;
    }
}
