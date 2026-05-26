package com.pnb.transaction;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * TransactionValidator055 — Business rule validation.
 */
@ApplicationScoped
public class TransactionValidator055 {

    public List<String> validate(TransactionDto055 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("transaction DTO must not be null");
            return errors;
        }
        if (dto.getTranField000() != null && dto.getTranField000().isBlank()) {
            errors.add("tranField000 must not be blank if provided");
        }
        if (dto.getTranField006() != null && dto.getTranField006() < 0) {
            errors.add("tranField006 must not be negative");
        }
        if (dto.getTranField008() != null && dto.getTranField008().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("tranField008 must not be negative");
        }
        if (dto.getTranField009() != null && dto.getTranField009().isBlank()) {
            errors.add("tranField009 must not be blank if provided");
        }
        if (dto.getTranField010() != null && dto.getTranField010().isBlank()) {
            errors.add("tranField010 must not be blank if provided");
        }
        if (dto.getTranField012() != null && dto.getTranField012().isBlank()) {
            errors.add("tranField012 must not be blank if provided");
        }
        return errors;
    }
}
