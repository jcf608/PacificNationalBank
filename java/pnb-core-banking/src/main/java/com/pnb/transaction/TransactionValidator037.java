package com.pnb.transaction;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * TransactionValidator037 — Business rule validation.
 */
@ApplicationScoped
public class TransactionValidator037 {

    public List<String> validate(TransactionDto037 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("transaction DTO must not be null");
            return errors;
        }
        if (dto.getTranField002() != null && dto.getTranField002().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("tranField002 must not be negative");
        }
        return errors;
    }
}
