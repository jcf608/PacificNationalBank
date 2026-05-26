package com.pnb.transaction;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * TransactionValidator057 — Business rule validation.
 */
@ApplicationScoped
public class TransactionValidator057 {

    public List<String> validate(TransactionDto057 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("transaction DTO must not be null");
            return errors;
        }
        if (dto.getTranField002() != null && dto.getTranField002().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("tranField002 must not be negative");
        }
        if (dto.getTranField003() != null && dto.getTranField003().isBlank()) {
            errors.add("tranField003 must not be blank if provided");
        }
        if (dto.getTranField007() != null && dto.getTranField007() < 0) {
            errors.add("tranField007 must not be negative");
        }
        if (dto.getTranField008() != null && dto.getTranField008().isBlank()) {
            errors.add("tranField008 must not be blank if provided");
        }
        if (dto.getTranField009() != null && dto.getTranField009().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("tranField009 must not be negative");
        }
        if (dto.getTranField010() != null && dto.getTranField010().isBlank()) {
            errors.add("tranField010 must not be blank if provided");
        }
        if (dto.getTranField014() != null && dto.getTranField014() < 0) {
            errors.add("tranField014 must not be negative");
        }
        if (dto.getTranField015() != null && dto.getTranField015().isBlank()) {
            errors.add("tranField015 must not be blank if provided");
        }
        if (dto.getTranField016() != null && dto.getTranField016() < 0) {
            errors.add("tranField016 must not be negative");
        }
        return errors;
    }
}
