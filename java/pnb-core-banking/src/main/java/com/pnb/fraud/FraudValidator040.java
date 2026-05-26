package com.pnb.fraud;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * FraudValidator040 — Business rule validation.
 */
@ApplicationScoped
public class FraudValidator040 {

    public List<String> validate(FraudDto040 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("fraud DTO must not be null");
            return errors;
        }
        if (dto.getFrauField000() != null && dto.getFrauField000() < 0) {
            errors.add("frauField000 must not be negative");
        }
        if (dto.getFrauField001() != null && dto.getFrauField001() < 0) {
            errors.add("frauField001 must not be negative");
        }
        if (dto.getFrauField002() != null && dto.getFrauField002() < 0) {
            errors.add("frauField002 must not be negative");
        }
        if (dto.getFrauField005() != null && dto.getFrauField005() < 0) {
            errors.add("frauField005 must not be negative");
        }
        if (dto.getFrauField010() != null && dto.getFrauField010() < 0) {
            errors.add("frauField010 must not be negative");
        }
        return errors;
    }
}
