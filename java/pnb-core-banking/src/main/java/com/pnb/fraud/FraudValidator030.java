package com.pnb.fraud;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * FraudValidator030 — Business rule validation.
 */
@ApplicationScoped
public class FraudValidator030 {

    public List<String> validate(FraudDto030 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("fraud DTO must not be null");
            return errors;
        }
        if (dto.getFrauField007() != null && dto.getFrauField007().isBlank()) {
            errors.add("frauField007 must not be blank if provided");
        }
        if (dto.getFrauField009() != null && dto.getFrauField009() < 0) {
            errors.add("frauField009 must not be negative");
        }
        if (dto.getFrauField010() != null && dto.getFrauField010().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("frauField010 must not be negative");
        }
        if (dto.getFrauField011() != null && dto.getFrauField011().isBlank()) {
            errors.add("frauField011 must not be blank if provided");
        }
        if (dto.getFrauField012() != null && dto.getFrauField012().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("frauField012 must not be negative");
        }
        if (dto.getFrauField013() != null && dto.getFrauField013().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("frauField013 must not be negative");
        }
        return errors;
    }
}
