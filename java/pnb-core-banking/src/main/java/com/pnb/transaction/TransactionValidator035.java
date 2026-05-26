package com.pnb.transaction;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * TransactionValidator035 — Business rule validation.
 */
@ApplicationScoped
public class TransactionValidator035 {

    public List<String> validate(TransactionDto035 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("transaction DTO must not be null");
            return errors;
        }
        if (dto.getTranField003() != null && dto.getTranField003() < 0) {
            errors.add("tranField003 must not be negative");
        }
        if (dto.getTranField007() != null && dto.getTranField007().isBlank()) {
            errors.add("tranField007 must not be blank if provided");
        }
        if (dto.getTranField008() != null && dto.getTranField008() < 0) {
            errors.add("tranField008 must not be negative");
        }
        if (dto.getTranField011() != null && dto.getTranField011().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("tranField011 must not be negative");
        }
        if (dto.getTranField012() != null && dto.getTranField012().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("tranField012 must not be negative");
        }
        if (dto.getTranField013() != null && dto.getTranField013().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("tranField013 must not be negative");
        }
        if (dto.getTranField015() != null && dto.getTranField015() < 0) {
            errors.add("tranField015 must not be negative");
        }
        if (dto.getTranField017() != null && dto.getTranField017().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("tranField017 must not be negative");
        }
        return errors;
    }
}
