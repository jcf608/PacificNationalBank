package com.pnb.transaction;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * TransactionValidator056 — Business rule validation.
 */
@ApplicationScoped
public class TransactionValidator056 {

    public List<String> validate(TransactionDto056 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("transaction DTO must not be null");
            return errors;
        }
        if (dto.getTranField000() != null && dto.getTranField000().isBlank()) {
            errors.add("tranField000 must not be blank if provided");
        }
        if (dto.getTranField002() != null && dto.getTranField002().isBlank()) {
            errors.add("tranField002 must not be blank if provided");
        }
        if (dto.getTranField004() != null && dto.getTranField004() < 0) {
            errors.add("tranField004 must not be negative");
        }
        if (dto.getTranField006() != null && dto.getTranField006() < 0) {
            errors.add("tranField006 must not be negative");
        }
        if (dto.getTranField010() != null && dto.getTranField010().isBlank()) {
            errors.add("tranField010 must not be blank if provided");
        }
        if (dto.getTranField011() != null && dto.getTranField011().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("tranField011 must not be negative");
        }
        if (dto.getTranField014() != null && dto.getTranField014() < 0) {
            errors.add("tranField014 must not be negative");
        }
        return errors;
    }
}
