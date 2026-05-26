package com.pnb.fraud;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * FraudValidator023 — Business rule validation.
 */
@ApplicationScoped
public class FraudValidator023 {

    public List<String> validate(FraudDto023 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("fraud DTO must not be null");
            return errors;
        }
        if (dto.getFrauField001() != null && dto.getFrauField001() < 0) {
            errors.add("frauField001 must not be negative");
        }
        if (dto.getFrauField003() != null && dto.getFrauField003().isBlank()) {
            errors.add("frauField003 must not be blank if provided");
        }
        if (dto.getFrauField004() != null && dto.getFrauField004().isBlank()) {
            errors.add("frauField004 must not be blank if provided");
        }
        if (dto.getFrauField006() != null && dto.getFrauField006() < 0) {
            errors.add("frauField006 must not be negative");
        }
        if (dto.getFrauField008() != null && dto.getFrauField008().isBlank()) {
            errors.add("frauField008 must not be blank if provided");
        }
        if (dto.getFrauField010() != null && dto.getFrauField010() < 0) {
            errors.add("frauField010 must not be negative");
        }
        if (dto.getFrauField012() != null && dto.getFrauField012() < 0) {
            errors.add("frauField012 must not be negative");
        }
        if (dto.getFrauField014() != null && dto.getFrauField014().isBlank()) {
            errors.add("frauField014 must not be blank if provided");
        }
        if (dto.getFrauField015() != null && dto.getFrauField015().isBlank()) {
            errors.add("frauField015 must not be blank if provided");
        }
        if (dto.getFrauField016() != null && dto.getFrauField016().isBlank()) {
            errors.add("frauField016 must not be blank if provided");
        }
        return errors;
    }
}
