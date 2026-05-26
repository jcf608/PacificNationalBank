package com.pnb.fraud;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * FraudValidator048 — Business rule validation.
 */
@ApplicationScoped
public class FraudValidator048 {

    public List<String> validate(FraudDto048 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("fraud DTO must not be null");
            return errors;
        }
        if (dto.getFrauField002() != null && dto.getFrauField002() < 0) {
            errors.add("frauField002 must not be negative");
        }
        if (dto.getFrauField007() != null && dto.getFrauField007() < 0) {
            errors.add("frauField007 must not be negative");
        }
        return errors;
    }
}
