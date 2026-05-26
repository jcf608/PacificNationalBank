package com.pnb.fraud;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * FraudValidator032 — Business rule validation.
 */
@ApplicationScoped
public class FraudValidator032 {

    public List<String> validate(FraudDto032 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("fraud DTO must not be null");
            return errors;
        }
        if (dto.getFrauField000() != null && dto.getFrauField000().isBlank()) {
            errors.add("frauField000 must not be blank if provided");
        }
        if (dto.getFrauField002() != null && dto.getFrauField002().isBlank()) {
            errors.add("frauField002 must not be blank if provided");
        }
        if (dto.getFrauField003() != null && dto.getFrauField003().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("frauField003 must not be negative");
        }
        if (dto.getFrauField006() != null && dto.getFrauField006().isBlank()) {
            errors.add("frauField006 must not be blank if provided");
        }
        if (dto.getFrauField008() != null && dto.getFrauField008().isBlank()) {
            errors.add("frauField008 must not be blank if provided");
        }
        if (dto.getFrauField011() != null && dto.getFrauField011() < 0) {
            errors.add("frauField011 must not be negative");
        }
        return errors;
    }
}
