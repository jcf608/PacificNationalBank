package com.pnb.transaction;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * TransactionValidator033 — Business rule validation.
 */
@ApplicationScoped
public class TransactionValidator033 {

    public List<String> validate(TransactionDto033 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("transaction DTO must not be null");
            return errors;
        }
        if (dto.getTranField000() != null && dto.getTranField000().isBlank()) {
            errors.add("tranField000 must not be blank if provided");
        }
        if (dto.getTranField005() != null && dto.getTranField005().isBlank()) {
            errors.add("tranField005 must not be blank if provided");
        }
        if (dto.getTranField006() != null && dto.getTranField006().isBlank()) {
            errors.add("tranField006 must not be blank if provided");
        }
        if (dto.getTranField012() != null && dto.getTranField012() < 0) {
            errors.add("tranField012 must not be negative");
        }
        if (dto.getTranField014() != null && dto.getTranField014().isBlank()) {
            errors.add("tranField014 must not be blank if provided");
        }
        if (dto.getTranField016() != null && dto.getTranField016().isBlank()) {
            errors.add("tranField016 must not be blank if provided");
        }
        return errors;
    }
}
