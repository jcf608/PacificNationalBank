package com.pnb.transaction;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * TransactionValidator049 — Business rule validation.
 */
@ApplicationScoped
public class TransactionValidator049 {

    public List<String> validate(TransactionDto049 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("transaction DTO must not be null");
            return errors;
        }
        if (dto.getTranField003() != null && dto.getTranField003() < 0) {
            errors.add("tranField003 must not be negative");
        }
        if (dto.getTranField004() != null && dto.getTranField004() < 0) {
            errors.add("tranField004 must not be negative");
        }
        if (dto.getTranField008() != null && dto.getTranField008().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("tranField008 must not be negative");
        }
        return errors;
    }
}
