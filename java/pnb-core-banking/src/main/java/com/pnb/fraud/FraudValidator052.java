package com.pnb.fraud;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * FraudValidator052 — Business rule validation.
 */
@ApplicationScoped
public class FraudValidator052 {

    public List<String> validate(FraudDto052 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("fraud DTO must not be null");
            return errors;
        }
        if (dto.getFrauField001() != null && dto.getFrauField001() < 0) {
            errors.add("frauField001 must not be negative");
        }
        if (dto.getFrauField005() != null && dto.getFrauField005().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("frauField005 must not be negative");
        }
        if (dto.getFrauField007() != null && dto.getFrauField007() < 0) {
            errors.add("frauField007 must not be negative");
        }
        if (dto.getFrauField008() != null && dto.getFrauField008() < 0) {
            errors.add("frauField008 must not be negative");
        }
        if (dto.getFrauField011() != null && dto.getFrauField011().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("frauField011 must not be negative");
        }
        return errors;
    }
}
