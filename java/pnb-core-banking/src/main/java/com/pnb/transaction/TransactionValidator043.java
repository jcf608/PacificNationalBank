package com.pnb.transaction;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * TransactionValidator043 — Business rule validation.
 */
@ApplicationScoped
public class TransactionValidator043 {

    public List<String> validate(TransactionDto043 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("transaction DTO must not be null");
            return errors;
        }
        if (dto.getTranField005() != null && dto.getTranField005() < 0) {
            errors.add("tranField005 must not be negative");
        }
        if (dto.getTranField012() != null && dto.getTranField012().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("tranField012 must not be negative");
        }
        if (dto.getTranField013() != null && dto.getTranField013().isBlank()) {
            errors.add("tranField013 must not be blank if provided");
        }
        return errors;
    }
}
