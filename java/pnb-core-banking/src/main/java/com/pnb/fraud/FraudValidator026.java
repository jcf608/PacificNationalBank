package com.pnb.fraud;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * FraudValidator026 — Business rule validation.
 */
@ApplicationScoped
public class FraudValidator026 {

    public List<String> validate(FraudDto026 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("fraud DTO must not be null");
            return errors;
        }
        if (dto.getFrauField003() != null && dto.getFrauField003() < 0) {
            errors.add("frauField003 must not be negative");
        }
        if (dto.getFrauField005() != null && dto.getFrauField005().isBlank()) {
            errors.add("frauField005 must not be blank if provided");
        }
        if (dto.getFrauField007() != null && dto.getFrauField007().isBlank()) {
            errors.add("frauField007 must not be blank if provided");
        }
        if (dto.getFrauField008() != null && dto.getFrauField008() < 0) {
            errors.add("frauField008 must not be negative");
        }
        return errors;
    }
}
