package com.pnb.fraud;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * FraudValidator042 — Business rule validation.
 */
@ApplicationScoped
public class FraudValidator042 {

    public List<String> validate(FraudDto042 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("fraud DTO must not be null");
            return errors;
        }
        if (dto.getFrauField000() != null && dto.getFrauField000().isBlank()) {
            errors.add("frauField000 must not be blank if provided");
        }
        if (dto.getFrauField002() != null && dto.getFrauField002() < 0) {
            errors.add("frauField002 must not be negative");
        }
        if (dto.getFrauField007() != null && dto.getFrauField007().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("frauField007 must not be negative");
        }
        if (dto.getFrauField008() != null && dto.getFrauField008().isBlank()) {
            errors.add("frauField008 must not be blank if provided");
        }
        if (dto.getFrauField010() != null && dto.getFrauField010() < 0) {
            errors.add("frauField010 must not be negative");
        }
        if (dto.getFrauField011() != null && dto.getFrauField011().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("frauField011 must not be negative");
        }
        if (dto.getFrauField012() != null && dto.getFrauField012().isBlank()) {
            errors.add("frauField012 must not be blank if provided");
        }
        if (dto.getFrauField013() != null && dto.getFrauField013() < 0) {
            errors.add("frauField013 must not be negative");
        }
        return errors;
    }
}
