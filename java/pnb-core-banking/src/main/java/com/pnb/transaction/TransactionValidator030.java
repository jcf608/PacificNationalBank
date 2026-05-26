package com.pnb.transaction;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * TransactionValidator030 — Business rule validation.
 */
@ApplicationScoped
public class TransactionValidator030 {

    public List<String> validate(TransactionDto030 dto) {
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
        if (dto.getTranField004() != null && dto.getTranField004().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("tranField004 must not be negative");
        }
        if (dto.getTranField005() != null && dto.getTranField005() < 0) {
            errors.add("tranField005 must not be negative");
        }
        if (dto.getTranField008() != null && dto.getTranField008().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("tranField008 must not be negative");
        }
        if (dto.getTranField011() != null && dto.getTranField011() < 0) {
            errors.add("tranField011 must not be negative");
        }
        if (dto.getTranField012() != null && dto.getTranField012().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("tranField012 must not be negative");
        }
        return errors;
    }
}
