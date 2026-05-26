package com.pnb.fraud;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * FraudValidator051 — Business rule validation.
 */
@ApplicationScoped
public class FraudValidator051 {

    public List<String> validate(FraudDto051 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("fraud DTO must not be null");
            return errors;
        }
        if (dto.getFrauField010() != null && dto.getFrauField010().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("frauField010 must not be negative");
        }
        return errors;
    }
}
