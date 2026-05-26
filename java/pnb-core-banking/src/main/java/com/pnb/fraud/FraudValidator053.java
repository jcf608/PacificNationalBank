package com.pnb.fraud;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * FraudValidator053 — Business rule validation.
 */
@ApplicationScoped
public class FraudValidator053 {

    public List<String> validate(FraudDto053 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("fraud DTO must not be null");
            return errors;
        }
        if (dto.getFrauField000() != null && dto.getFrauField000().isBlank()) {
            errors.add("frauField000 must not be blank if provided");
        }
        if (dto.getFrauField001() != null && dto.getFrauField001().isBlank()) {
            errors.add("frauField001 must not be blank if provided");
        }
        if (dto.getFrauField003() != null && dto.getFrauField003().isBlank()) {
            errors.add("frauField003 must not be blank if provided");
        }
        if (dto.getFrauField006() != null && dto.getFrauField006() < 0) {
            errors.add("frauField006 must not be negative");
        }
        if (dto.getFrauField008() != null && dto.getFrauField008().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("frauField008 must not be negative");
        }
        if (dto.getFrauField009() != null && dto.getFrauField009().isBlank()) {
            errors.add("frauField009 must not be blank if provided");
        }
        if (dto.getFrauField012() != null && dto.getFrauField012().isBlank()) {
            errors.add("frauField012 must not be blank if provided");
        }
        return errors;
    }
}
