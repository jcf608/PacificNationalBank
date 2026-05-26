package com.pnb.fraud;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * FraudValidator033 — Business rule validation.
 */
@ApplicationScoped
public class FraudValidator033 {

    public List<String> validate(FraudDto033 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("fraud DTO must not be null");
            return errors;
        }
        if (dto.getFrauField002() != null && dto.getFrauField002().isBlank()) {
            errors.add("frauField002 must not be blank if provided");
        }
        if (dto.getFrauField003() != null && dto.getFrauField003().isBlank()) {
            errors.add("frauField003 must not be blank if provided");
        }
        if (dto.getFrauField006() != null && dto.getFrauField006().isBlank()) {
            errors.add("frauField006 must not be blank if provided");
        }
        if (dto.getFrauField014() != null && dto.getFrauField014().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("frauField014 must not be negative");
        }
        return errors;
    }
}
