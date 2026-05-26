package com.pnb.transaction;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * TransactionValidator029 — Business rule validation.
 */
@ApplicationScoped
public class TransactionValidator029 {

    public List<String> validate(TransactionDto029 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("transaction DTO must not be null");
            return errors;
        }
        if (dto.getTranField005() != null && dto.getTranField005().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("tranField005 must not be negative");
        }
        if (dto.getTranField008() != null && dto.getTranField008().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("tranField008 must not be negative");
        }
        if (dto.getTranField010() != null && dto.getTranField010() < 0) {
            errors.add("tranField010 must not be negative");
        }
        return errors;
    }
}
