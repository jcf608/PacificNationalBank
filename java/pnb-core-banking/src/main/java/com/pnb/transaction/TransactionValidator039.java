package com.pnb.transaction;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * TransactionValidator039 — Business rule validation.
 */
@ApplicationScoped
public class TransactionValidator039 {

    public List<String> validate(TransactionDto039 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("transaction DTO must not be null");
            return errors;
        }
        if (dto.getTranField003() != null && dto.getTranField003().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("tranField003 must not be negative");
        }
        if (dto.getTranField009() != null && dto.getTranField009().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("tranField009 must not be negative");
        }
        if (dto.getTranField010() != null && dto.getTranField010().isBlank()) {
            errors.add("tranField010 must not be blank if provided");
        }
        return errors;
    }
}
