package com.pnb.transaction;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * TransactionValidator047 — Business rule validation.
 */
@ApplicationScoped
public class TransactionValidator047 {

    public List<String> validate(TransactionDto047 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("transaction DTO must not be null");
            return errors;
        }
        if (dto.getTranField002() != null && dto.getTranField002().isBlank()) {
            errors.add("tranField002 must not be blank if provided");
        }
        if (dto.getTranField003() != null && dto.getTranField003().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("tranField003 must not be negative");
        }
        if (dto.getTranField004() != null && dto.getTranField004().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("tranField004 must not be negative");
        }
        if (dto.getTranField006() != null && dto.getTranField006().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("tranField006 must not be negative");
        }
        if (dto.getTranField012() != null && dto.getTranField012().isBlank()) {
            errors.add("tranField012 must not be blank if provided");
        }
        if (dto.getTranField013() != null && dto.getTranField013().isBlank()) {
            errors.add("tranField013 must not be blank if provided");
        }
        if (dto.getTranField014() != null && dto.getTranField014() < 0) {
            errors.add("tranField014 must not be negative");
        }
        if (dto.getTranField017() != null && dto.getTranField017().isBlank()) {
            errors.add("tranField017 must not be blank if provided");
        }
        if (dto.getTranField018() != null && dto.getTranField018().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("tranField018 must not be negative");
        }
        return errors;
    }
}
