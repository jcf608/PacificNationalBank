package com.pnb.transaction;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * TransactionValidator046 — Business rule validation.
 */
@ApplicationScoped
public class TransactionValidator046 {

    public List<String> validate(TransactionDto046 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("transaction DTO must not be null");
            return errors;
        }
        if (dto.getTranField002() != null && dto.getTranField002() < 0) {
            errors.add("tranField002 must not be negative");
        }
        if (dto.getTranField008() != null && dto.getTranField008().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("tranField008 must not be negative");
        }
        if (dto.getTranField009() != null && dto.getTranField009().isBlank()) {
            errors.add("tranField009 must not be blank if provided");
        }
        if (dto.getTranField011() != null && dto.getTranField011().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("tranField011 must not be negative");
        }
        if (dto.getTranField012() != null && dto.getTranField012().isBlank()) {
            errors.add("tranField012 must not be blank if provided");
        }
        if (dto.getTranField013() != null && dto.getTranField013().isBlank()) {
            errors.add("tranField013 must not be blank if provided");
        }
        return errors;
    }
}
