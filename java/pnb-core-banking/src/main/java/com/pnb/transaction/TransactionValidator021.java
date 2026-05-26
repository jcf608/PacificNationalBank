package com.pnb.transaction;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * TransactionValidator021 — Business rule validation.
 */
@ApplicationScoped
public class TransactionValidator021 {

    public List<String> validate(TransactionDto021 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("transaction DTO must not be null");
            return errors;
        }
        if (dto.getTranField004() != null && dto.getTranField004() < 0) {
            errors.add("tranField004 must not be negative");
        }
        if (dto.getTranField009() != null && dto.getTranField009().isBlank()) {
            errors.add("tranField009 must not be blank if provided");
        }
        if (dto.getTranField012() != null && dto.getTranField012().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("tranField012 must not be negative");
        }
        if (dto.getTranField014() != null && dto.getTranField014().isBlank()) {
            errors.add("tranField014 must not be blank if provided");
        }
        if (dto.getTranField015() != null && dto.getTranField015().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("tranField015 must not be negative");
        }
        if (dto.getTranField016() != null && dto.getTranField016().isBlank()) {
            errors.add("tranField016 must not be blank if provided");
        }
        return errors;
    }
}
