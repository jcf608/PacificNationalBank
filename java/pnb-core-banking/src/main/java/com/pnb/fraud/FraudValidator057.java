package com.pnb.fraud;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * FraudValidator057 — Business rule validation.
 */
@ApplicationScoped
public class FraudValidator057 {

    public List<String> validate(FraudDto057 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("fraud DTO must not be null");
            return errors;
        }
        if (dto.getFrauField000() != null && dto.getFrauField000().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("frauField000 must not be negative");
        }
        if (dto.getFrauField002() != null && dto.getFrauField002().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("frauField002 must not be negative");
        }
        if (dto.getFrauField004() != null && dto.getFrauField004() < 0) {
            errors.add("frauField004 must not be negative");
        }
        if (dto.getFrauField006() != null && dto.getFrauField006().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("frauField006 must not be negative");
        }
        if (dto.getFrauField007() != null && dto.getFrauField007().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("frauField007 must not be negative");
        }
        if (dto.getFrauField008() != null && dto.getFrauField008().isBlank()) {
            errors.add("frauField008 must not be blank if provided");
        }
        if (dto.getFrauField009() != null && dto.getFrauField009() < 0) {
            errors.add("frauField009 must not be negative");
        }
        if (dto.getFrauField013() != null && dto.getFrauField013().isBlank()) {
            errors.add("frauField013 must not be blank if provided");
        }
        if (dto.getFrauField016() != null && dto.getFrauField016().isBlank()) {
            errors.add("frauField016 must not be blank if provided");
        }
        return errors;
    }
}
