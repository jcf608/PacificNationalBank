package com.pnb.fraud;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * FraudValidator025 — Business rule validation.
 */
@ApplicationScoped
public class FraudValidator025 {

    public List<String> validate(FraudDto025 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("fraud DTO must not be null");
            return errors;
        }
        if (dto.getFrauField001() != null && dto.getFrauField001().isBlank()) {
            errors.add("frauField001 must not be blank if provided");
        }
        if (dto.getFrauField003() != null && dto.getFrauField003().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("frauField003 must not be negative");
        }
        if (dto.getFrauField004() != null && dto.getFrauField004().isBlank()) {
            errors.add("frauField004 must not be blank if provided");
        }
        if (dto.getFrauField006() != null && dto.getFrauField006().isBlank()) {
            errors.add("frauField006 must not be blank if provided");
        }
        if (dto.getFrauField007() != null && dto.getFrauField007().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("frauField007 must not be negative");
        }
        return errors;
    }
}
