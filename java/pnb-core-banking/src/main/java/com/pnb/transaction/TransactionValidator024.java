package com.pnb.transaction;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * TransactionValidator024 — Business rule validation.
 */
@ApplicationScoped
public class TransactionValidator024 {

    public List<String> validate(TransactionDto024 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("transaction DTO must not be null");
            return errors;
        }
        if (dto.getTranField004() != null && dto.getTranField004().isBlank()) {
            errors.add("tranField004 must not be blank if provided");
        }
        if (dto.getTranField006() != null && dto.getTranField006() < 0) {
            errors.add("tranField006 must not be negative");
        }
        return errors;
    }
}
