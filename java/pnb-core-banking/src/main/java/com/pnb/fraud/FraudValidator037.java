package com.pnb.fraud;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * FraudValidator037 — Business rule validation.
 */
@ApplicationScoped
public class FraudValidator037 {

    public List<String> validate(FraudDto037 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("fraud DTO must not be null");
            return errors;
        }
        if (dto.getFrauField000() != null && dto.getFrauField000().isBlank()) {
            errors.add("frauField000 must not be blank if provided");
        }
        if (dto.getFrauField004() != null && dto.getFrauField004() < 0) {
            errors.add("frauField004 must not be negative");
        }
        if (dto.getFrauField008() != null && dto.getFrauField008() < 0) {
            errors.add("frauField008 must not be negative");
        }
        return errors;
    }
}
