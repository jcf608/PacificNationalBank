package com.pnb.fraud;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * FraudValidator022 — Business rule validation.
 */
@ApplicationScoped
public class FraudValidator022 {

    public List<String> validate(FraudDto022 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("fraud DTO must not be null");
            return errors;
        }
        if (dto.getFrauField003() != null && dto.getFrauField003().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("frauField003 must not be negative");
        }
        if (dto.getFrauField004() != null && dto.getFrauField004().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("frauField004 must not be negative");
        }
        if (dto.getFrauField005() != null && dto.getFrauField005().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("frauField005 must not be negative");
        }
        if (dto.getFrauField006() != null && dto.getFrauField006().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("frauField006 must not be negative");
        }
        if (dto.getFrauField009() != null && dto.getFrauField009().isBlank()) {
            errors.add("frauField009 must not be blank if provided");
        }
        if (dto.getFrauField010() != null && dto.getFrauField010().isBlank()) {
            errors.add("frauField010 must not be blank if provided");
        }
        if (dto.getFrauField011() != null && dto.getFrauField011().isBlank()) {
            errors.add("frauField011 must not be blank if provided");
        }
        if (dto.getFrauField012() != null && dto.getFrauField012().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("frauField012 must not be negative");
        }
        if (dto.getFrauField015() != null && dto.getFrauField015().isBlank()) {
            errors.add("frauField015 must not be blank if provided");
        }
        if (dto.getFrauField017() != null && dto.getFrauField017() < 0) {
            errors.add("frauField017 must not be negative");
        }
        return errors;
    }
}
