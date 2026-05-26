package com.pnb.fraud;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * FraudValidator035 — Business rule validation.
 */
@ApplicationScoped
public class FraudValidator035 {

    public List<String> validate(FraudDto035 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("fraud DTO must not be null");
            return errors;
        }
        if (dto.getFrauField003() != null && dto.getFrauField003().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("frauField003 must not be negative");
        }
        if (dto.getFrauField005() != null && dto.getFrauField005().isBlank()) {
            errors.add("frauField005 must not be blank if provided");
        }
        if (dto.getFrauField007() != null && dto.getFrauField007().isBlank()) {
            errors.add("frauField007 must not be blank if provided");
        }
        if (dto.getFrauField010() != null && dto.getFrauField010() < 0) {
            errors.add("frauField010 must not be negative");
        }
        if (dto.getFrauField014() != null && dto.getFrauField014() < 0) {
            errors.add("frauField014 must not be negative");
        }
        return errors;
    }
}
