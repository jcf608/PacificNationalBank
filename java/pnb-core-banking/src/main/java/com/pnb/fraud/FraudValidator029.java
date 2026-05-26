package com.pnb.fraud;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * FraudValidator029 — Business rule validation.
 */
@ApplicationScoped
public class FraudValidator029 {

    public List<String> validate(FraudDto029 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("fraud DTO must not be null");
            return errors;
        }
        if (dto.getFrauField000() != null && dto.getFrauField000() < 0) {
            errors.add("frauField000 must not be negative");
        }
        if (dto.getFrauField001() != null && dto.getFrauField001().isBlank()) {
            errors.add("frauField001 must not be blank if provided");
        }
        if (dto.getFrauField006() != null && dto.getFrauField006() < 0) {
            errors.add("frauField006 must not be negative");
        }
        if (dto.getFrauField009() != null && dto.getFrauField009() < 0) {
            errors.add("frauField009 must not be negative");
        }
        if (dto.getFrauField010() != null && dto.getFrauField010().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("frauField010 must not be negative");
        }
        if (dto.getFrauField012() != null && dto.getFrauField012().isBlank()) {
            errors.add("frauField012 must not be blank if provided");
        }
        return errors;
    }
}
