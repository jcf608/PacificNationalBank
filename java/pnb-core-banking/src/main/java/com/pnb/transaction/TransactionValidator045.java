package com.pnb.transaction;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * TransactionValidator045 — Business rule validation.
 */
@ApplicationScoped
public class TransactionValidator045 {

    public List<String> validate(TransactionDto045 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("transaction DTO must not be null");
            return errors;
        }
        if (dto.getTranField002() != null && dto.getTranField002().isBlank()) {
            errors.add("tranField002 must not be blank if provided");
        }
        if (dto.getTranField003() != null && dto.getTranField003().isBlank()) {
            errors.add("tranField003 must not be blank if provided");
        }
        if (dto.getTranField007() != null && dto.getTranField007().isBlank()) {
            errors.add("tranField007 must not be blank if provided");
        }
        if (dto.getTranField012() != null && dto.getTranField012() < 0) {
            errors.add("tranField012 must not be negative");
        }
        if (dto.getTranField013() != null && dto.getTranField013().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("tranField013 must not be negative");
        }
        if (dto.getTranField014() != null && dto.getTranField014().isBlank()) {
            errors.add("tranField014 must not be blank if provided");
        }
        if (dto.getTranField016() != null && dto.getTranField016().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("tranField016 must not be negative");
        }
        return errors;
    }
}
