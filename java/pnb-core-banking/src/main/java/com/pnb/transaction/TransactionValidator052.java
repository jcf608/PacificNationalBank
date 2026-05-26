package com.pnb.transaction;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * TransactionValidator052 — Business rule validation.
 */
@ApplicationScoped
public class TransactionValidator052 {

    public List<String> validate(TransactionDto052 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("transaction DTO must not be null");
            return errors;
        }
        if (dto.getTranField005() != null && dto.getTranField005().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("tranField005 must not be negative");
        }
        if (dto.getTranField007() != null && dto.getTranField007().isBlank()) {
            errors.add("tranField007 must not be blank if provided");
        }
        if (dto.getTranField009() != null && dto.getTranField009().isBlank()) {
            errors.add("tranField009 must not be blank if provided");
        }
        if (dto.getTranField010() != null && dto.getTranField010() < 0) {
            errors.add("tranField010 must not be negative");
        }
        if (dto.getTranField011() != null && dto.getTranField011().isBlank()) {
            errors.add("tranField011 must not be blank if provided");
        }
        return errors;
    }
}
