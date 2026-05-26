package com.pnb.fraud;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * FraudValidator031 — Business rule validation.
 */
@ApplicationScoped
public class FraudValidator031 {

    public List<String> validate(FraudDto031 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("fraud DTO must not be null");
            return errors;
        }
        if (dto.getFrauField003() != null && dto.getFrauField003() < 0) {
            errors.add("frauField003 must not be negative");
        }
        if (dto.getFrauField004() != null && dto.getFrauField004().isBlank()) {
            errors.add("frauField004 must not be blank if provided");
        }
        if (dto.getFrauField006() != null && dto.getFrauField006().isBlank()) {
            errors.add("frauField006 must not be blank if provided");
        }
        if (dto.getFrauField008() != null && dto.getFrauField008().isBlank()) {
            errors.add("frauField008 must not be blank if provided");
        }
        if (dto.getFrauField009() != null && dto.getFrauField009() < 0) {
            errors.add("frauField009 must not be negative");
        }
        if (dto.getFrauField010() != null && dto.getFrauField010() < 0) {
            errors.add("frauField010 must not be negative");
        }
        if (dto.getFrauField011() != null && dto.getFrauField011() < 0) {
            errors.add("frauField011 must not be negative");
        }
        if (dto.getFrauField013() != null && dto.getFrauField013() < 0) {
            errors.add("frauField013 must not be negative");
        }
        return errors;
    }
}
