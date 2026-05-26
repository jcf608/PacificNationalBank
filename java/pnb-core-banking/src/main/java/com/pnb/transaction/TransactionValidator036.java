package com.pnb.transaction;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * TransactionValidator036 — Business rule validation.
 */
@ApplicationScoped
public class TransactionValidator036 {

    public List<String> validate(TransactionDto036 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("transaction DTO must not be null");
            return errors;
        }
        if (dto.getTranField000() != null && dto.getTranField000().isBlank()) {
            errors.add("tranField000 must not be blank if provided");
        }
        if (dto.getTranField002() != null && dto.getTranField002().isBlank()) {
            errors.add("tranField002 must not be blank if provided");
        }
        if (dto.getTranField003() != null && dto.getTranField003() < 0) {
            errors.add("tranField003 must not be negative");
        }
        if (dto.getTranField006() != null && dto.getTranField006().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("tranField006 must not be negative");
        }
        return errors;
    }
}
