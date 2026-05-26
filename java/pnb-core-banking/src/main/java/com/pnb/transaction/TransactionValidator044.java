package com.pnb.transaction;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * TransactionValidator044 — Business rule validation.
 */
@ApplicationScoped
public class TransactionValidator044 {

    public List<String> validate(TransactionDto044 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("transaction DTO must not be null");
            return errors;
        }
        if (dto.getTranField004() != null && dto.getTranField004().isBlank()) {
            errors.add("tranField004 must not be blank if provided");
        }
        if (dto.getTranField005() != null && dto.getTranField005().isBlank()) {
            errors.add("tranField005 must not be blank if provided");
        }
        if (dto.getTranField007() != null && dto.getTranField007().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("tranField007 must not be negative");
        }
        if (dto.getTranField010() != null && dto.getTranField010().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("tranField010 must not be negative");
        }
        if (dto.getTranField011() != null && dto.getTranField011().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("tranField011 must not be negative");
        }
        if (dto.getTranField013() != null && dto.getTranField013().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("tranField013 must not be negative");
        }
        if (dto.getTranField014() != null && dto.getTranField014().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("tranField014 must not be negative");
        }
        return errors;
    }
}
