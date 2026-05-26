package com.pnb.fraud;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * FraudValidator041 — Business rule validation.
 */
@ApplicationScoped
public class FraudValidator041 {

    public List<String> validate(FraudDto041 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("fraud DTO must not be null");
            return errors;
        }
        if (dto.getFrauField003() != null && dto.getFrauField003().isBlank()) {
            errors.add("frauField003 must not be blank if provided");
        }
        if (dto.getFrauField004() != null && dto.getFrauField004() < 0) {
            errors.add("frauField004 must not be negative");
        }
        if (dto.getFrauField006() != null && dto.getFrauField006().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("frauField006 must not be negative");
        }
        if (dto.getFrauField007() != null && dto.getFrauField007().isBlank()) {
            errors.add("frauField007 must not be blank if provided");
        }
        if (dto.getFrauField009() != null && dto.getFrauField009().isBlank()) {
            errors.add("frauField009 must not be blank if provided");
        }
        return errors;
    }
}
