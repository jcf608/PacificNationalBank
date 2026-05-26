package com.pnb.fraud;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * FraudValidator036 — Business rule validation.
 */
@ApplicationScoped
public class FraudValidator036 {

    public List<String> validate(FraudDto036 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("fraud DTO must not be null");
            return errors;
        }
        if (dto.getFrauField000() != null && dto.getFrauField000().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("frauField000 must not be negative");
        }
        if (dto.getFrauField001() != null && dto.getFrauField001().isBlank()) {
            errors.add("frauField001 must not be blank if provided");
        }
        if (dto.getFrauField002() != null && dto.getFrauField002().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("frauField002 must not be negative");
        }
        if (dto.getFrauField004() != null && dto.getFrauField004().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("frauField004 must not be negative");
        }
        if (dto.getFrauField007() != null && dto.getFrauField007().isBlank()) {
            errors.add("frauField007 must not be blank if provided");
        }
        return errors;
    }
}
