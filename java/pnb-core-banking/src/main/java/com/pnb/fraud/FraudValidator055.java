package com.pnb.fraud;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * FraudValidator055 — Business rule validation.
 */
@ApplicationScoped
public class FraudValidator055 {

    public List<String> validate(FraudDto055 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("fraud DTO must not be null");
            return errors;
        }
        if (dto.getFrauField001() != null && dto.getFrauField001().isBlank()) {
            errors.add("frauField001 must not be blank if provided");
        }
        if (dto.getFrauField003() != null && dto.getFrauField003().isBlank()) {
            errors.add("frauField003 must not be blank if provided");
        }
        if (dto.getFrauField004() != null && dto.getFrauField004() < 0) {
            errors.add("frauField004 must not be negative");
        }
        if (dto.getFrauField008() != null && dto.getFrauField008() < 0) {
            errors.add("frauField008 must not be negative");
        }
        if (dto.getFrauField010() != null && dto.getFrauField010().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("frauField010 must not be negative");
        }
        if (dto.getFrauField011() != null && dto.getFrauField011().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("frauField011 must not be negative");
        }
        if (dto.getFrauField013() != null && dto.getFrauField013().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("frauField013 must not be negative");
        }
        if (dto.getFrauField014() != null && dto.getFrauField014() < 0) {
            errors.add("frauField014 must not be negative");
        }
        return errors;
    }
}
