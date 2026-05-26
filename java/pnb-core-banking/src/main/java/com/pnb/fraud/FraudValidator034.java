package com.pnb.fraud;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * FraudValidator034 — Business rule validation.
 */
@ApplicationScoped
public class FraudValidator034 {

    public List<String> validate(FraudDto034 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("fraud DTO must not be null");
            return errors;
        }
        if (dto.getFrauField001() != null && dto.getFrauField001().isBlank()) {
            errors.add("frauField001 must not be blank if provided");
        }
        if (dto.getFrauField004() != null && dto.getFrauField004().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("frauField004 must not be negative");
        }
        if (dto.getFrauField006() != null && dto.getFrauField006().isBlank()) {
            errors.add("frauField006 must not be blank if provided");
        }
        if (dto.getFrauField009() != null && dto.getFrauField009().isBlank()) {
            errors.add("frauField009 must not be blank if provided");
        }
        if (dto.getFrauField012() != null && dto.getFrauField012().isBlank()) {
            errors.add("frauField012 must not be blank if provided");
        }
        if (dto.getFrauField013() != null && dto.getFrauField013().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("frauField013 must not be negative");
        }
        if (dto.getFrauField014() != null && dto.getFrauField014() < 0) {
            errors.add("frauField014 must not be negative");
        }
        if (dto.getFrauField015() != null && dto.getFrauField015().isBlank()) {
            errors.add("frauField015 must not be blank if provided");
        }
        if (dto.getFrauField016() != null && dto.getFrauField016().isBlank()) {
            errors.add("frauField016 must not be blank if provided");
        }
        return errors;
    }
}
