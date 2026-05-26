package com.pnb.transaction;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * TransactionValidator032 — Business rule validation.
 */
@ApplicationScoped
public class TransactionValidator032 {

    public List<String> validate(TransactionDto032 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("transaction DTO must not be null");
            return errors;
        }
        if (dto.getTranField000() != null && dto.getTranField000().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("tranField000 must not be negative");
        }
        if (dto.getTranField001() != null && dto.getTranField001().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("tranField001 must not be negative");
        }
        if (dto.getTranField003() != null && dto.getTranField003() < 0) {
            errors.add("tranField003 must not be negative");
        }
        if (dto.getTranField004() != null && dto.getTranField004().isBlank()) {
            errors.add("tranField004 must not be blank if provided");
        }
        if (dto.getTranField005() != null && dto.getTranField005().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("tranField005 must not be negative");
        }
        if (dto.getTranField008() != null && dto.getTranField008().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("tranField008 must not be negative");
        }
        if (dto.getTranField012() != null && dto.getTranField012().isBlank()) {
            errors.add("tranField012 must not be blank if provided");
        }
        if (dto.getTranField013() != null && dto.getTranField013().isBlank()) {
            errors.add("tranField013 must not be blank if provided");
        }
        if (dto.getTranField015() != null && dto.getTranField015().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("tranField015 must not be negative");
        }
        return errors;
    }
}
