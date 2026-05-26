package com.pnb.transaction;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * TransactionValidator054 — Business rule validation.
 */
@ApplicationScoped
public class TransactionValidator054 {

    public List<String> validate(TransactionDto054 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("transaction DTO must not be null");
            return errors;
        }
        if (dto.getTranField000() != null && dto.getTranField000().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("tranField000 must not be negative");
        }
        if (dto.getTranField003() != null && dto.getTranField003().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("tranField003 must not be negative");
        }
        if (dto.getTranField006() != null && dto.getTranField006().isBlank()) {
            errors.add("tranField006 must not be blank if provided");
        }
        if (dto.getTranField009() != null && dto.getTranField009().isBlank()) {
            errors.add("tranField009 must not be blank if provided");
        }
        if (dto.getTranField011() != null && dto.getTranField011().isBlank()) {
            errors.add("tranField011 must not be blank if provided");
        }
        if (dto.getTranField013() != null && dto.getTranField013() < 0) {
            errors.add("tranField013 must not be negative");
        }
        return errors;
    }
}
