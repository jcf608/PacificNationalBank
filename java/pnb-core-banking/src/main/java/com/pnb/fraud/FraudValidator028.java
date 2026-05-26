package com.pnb.fraud;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * FraudValidator028 — Business rule validation.
 */
@ApplicationScoped
public class FraudValidator028 {

    public List<String> validate(FraudDto028 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("fraud DTO must not be null");
            return errors;
        }
        if (dto.getFrauField000() != null && dto.getFrauField000().isBlank()) {
            errors.add("frauField000 must not be blank if provided");
        }
        if (dto.getFrauField001() != null && dto.getFrauField001() < 0) {
            errors.add("frauField001 must not be negative");
        }
        if (dto.getFrauField002() != null && dto.getFrauField002().isBlank()) {
            errors.add("frauField002 must not be blank if provided");
        }
        if (dto.getFrauField004() != null && dto.getFrauField004().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("frauField004 must not be negative");
        }
        if (dto.getFrauField006() != null && dto.getFrauField006() < 0) {
            errors.add("frauField006 must not be negative");
        }
        if (dto.getFrauField007() != null && dto.getFrauField007() < 0) {
            errors.add("frauField007 must not be negative");
        }
        if (dto.getFrauField009() != null && dto.getFrauField009().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("frauField009 must not be negative");
        }
        if (dto.getFrauField011() != null && dto.getFrauField011() < 0) {
            errors.add("frauField011 must not be negative");
        }
        return errors;
    }
}
