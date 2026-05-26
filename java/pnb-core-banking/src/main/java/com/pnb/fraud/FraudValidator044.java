package com.pnb.fraud;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * FraudValidator044 — Business rule validation.
 */
@ApplicationScoped
public class FraudValidator044 {

    public List<String> validate(FraudDto044 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("fraud DTO must not be null");
            return errors;
        }
        if (dto.getFrauField002() != null && dto.getFrauField002().isBlank()) {
            errors.add("frauField002 must not be blank if provided");
        }
        if (dto.getFrauField006() != null && dto.getFrauField006().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("frauField006 must not be negative");
        }
        if (dto.getFrauField009() != null && dto.getFrauField009().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("frauField009 must not be negative");
        }
        if (dto.getFrauField010() != null && dto.getFrauField010().isBlank()) {
            errors.add("frauField010 must not be blank if provided");
        }
        if (dto.getFrauField011() != null && dto.getFrauField011().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("frauField011 must not be negative");
        }
        if (dto.getFrauField013() != null && dto.getFrauField013().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("frauField013 must not be negative");
        }
        return errors;
    }
}
