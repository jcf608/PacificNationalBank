package com.pnb.transaction;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * TransactionValidator027 — Business rule validation.
 */
@ApplicationScoped
public class TransactionValidator027 {

    public List<String> validate(TransactionDto027 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("transaction DTO must not be null");
            return errors;
        }
        if (dto.getTranField004() != null && dto.getTranField004() < 0) {
            errors.add("tranField004 must not be negative");
        }
        if (dto.getTranField006() != null && dto.getTranField006() < 0) {
            errors.add("tranField006 must not be negative");
        }
        if (dto.getTranField007() != null && dto.getTranField007() < 0) {
            errors.add("tranField007 must not be negative");
        }
        if (dto.getTranField009() != null && dto.getTranField009().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("tranField009 must not be negative");
        }
        if (dto.getTranField010() != null && dto.getTranField010().isBlank()) {
            errors.add("tranField010 must not be blank if provided");
        }
        return errors;
    }
}
