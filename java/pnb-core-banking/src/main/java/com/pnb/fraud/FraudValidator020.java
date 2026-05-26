package com.pnb.fraud;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * FraudValidator020 — Business rule validation.
 */
@ApplicationScoped
public class FraudValidator020 {

    public List<String> validate(FraudDto020 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("fraud DTO must not be null");
            return errors;
        }
        if (dto.getFrauField001() != null && dto.getFrauField001() < 0) {
            errors.add("frauField001 must not be negative");
        }
        if (dto.getFrauField004() != null && dto.getFrauField004().isBlank()) {
            errors.add("frauField004 must not be blank if provided");
        }
        if (dto.getFrauField006() != null && dto.getFrauField006().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("frauField006 must not be negative");
        }
        if (dto.getFrauField008() != null && dto.getFrauField008().isBlank()) {
            errors.add("frauField008 must not be blank if provided");
        }
        if (dto.getFrauField012() != null && dto.getFrauField012().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("frauField012 must not be negative");
        }
        return errors;
    }
}
