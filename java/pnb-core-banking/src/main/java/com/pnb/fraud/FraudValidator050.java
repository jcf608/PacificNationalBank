package com.pnb.fraud;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * FraudValidator050 — Business rule validation.
 */
@ApplicationScoped
public class FraudValidator050 {

    public List<String> validate(FraudDto050 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("fraud DTO must not be null");
            return errors;
        }
        if (dto.getFrauField001() != null && dto.getFrauField001().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("frauField001 must not be negative");
        }
        if (dto.getFrauField003() != null && dto.getFrauField003().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("frauField003 must not be negative");
        }
        if (dto.getFrauField006() != null && dto.getFrauField006().isBlank()) {
            errors.add("frauField006 must not be blank if provided");
        }
        return errors;
    }
}
