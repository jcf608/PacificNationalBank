package com.pnb.transaction;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * TransactionValidator041 — Business rule validation.
 */
@ApplicationScoped
public class TransactionValidator041 {

    public List<String> validate(TransactionDto041 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("transaction DTO must not be null");
            return errors;
        }
        if (dto.getTranField001() != null && dto.getTranField001().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("tranField001 must not be negative");
        }
        if (dto.getTranField003() != null && dto.getTranField003() < 0) {
            errors.add("tranField003 must not be negative");
        }
        if (dto.getTranField006() != null && dto.getTranField006().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("tranField006 must not be negative");
        }
        if (dto.getTranField008() != null && dto.getTranField008().isBlank()) {
            errors.add("tranField008 must not be blank if provided");
        }
        return errors;
    }
}
