package com.pnb.transaction;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * TransactionValidator059 — Business rule validation.
 */
@ApplicationScoped
public class TransactionValidator059 {

    public List<String> validate(TransactionDto059 dto) {
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
        if (dto.getTranField007() != null && dto.getTranField007().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("tranField007 must not be negative");
        }
        if (dto.getTranField008() != null && dto.getTranField008().isBlank()) {
            errors.add("tranField008 must not be blank if provided");
        }
        if (dto.getTranField009() != null && dto.getTranField009().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("tranField009 must not be negative");
        }
        if (dto.getTranField010() != null && dto.getTranField010().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("tranField010 must not be negative");
        }
        if (dto.getTranField013() != null && dto.getTranField013().isBlank()) {
            errors.add("tranField013 must not be blank if provided");
        }
        if (dto.getTranField017() != null && dto.getTranField017().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("tranField017 must not be negative");
        }
        if (dto.getTranField018() != null && dto.getTranField018().isBlank()) {
            errors.add("tranField018 must not be blank if provided");
        }
        return errors;
    }
}
