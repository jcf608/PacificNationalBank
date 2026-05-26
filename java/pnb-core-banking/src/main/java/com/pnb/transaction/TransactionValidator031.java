package com.pnb.transaction;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * TransactionValidator031 — Business rule validation.
 */
@ApplicationScoped
public class TransactionValidator031 {

    public List<String> validate(TransactionDto031 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("transaction DTO must not be null");
            return errors;
        }
        if (dto.getTranField000() != null && dto.getTranField000() < 0) {
            errors.add("tranField000 must not be negative");
        }
        if (dto.getTranField003() != null && dto.getTranField003().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("tranField003 must not be negative");
        }
        if (dto.getTranField004() != null && dto.getTranField004() < 0) {
            errors.add("tranField004 must not be negative");
        }
        if (dto.getTranField006() != null && dto.getTranField006().isBlank()) {
            errors.add("tranField006 must not be blank if provided");
        }
        if (dto.getTranField007() != null && dto.getTranField007().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("tranField007 must not be negative");
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
