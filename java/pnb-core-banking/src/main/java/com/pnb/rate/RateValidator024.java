package com.pnb.rate;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * RateValidator024 — Business rule validation.
 */
@ApplicationScoped
public class RateValidator024 {

    public List<String> validate(RateDto024 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("rate DTO must not be null");
            return errors;
        }
        if (dto.getRateField000() != null && dto.getRateField000().isBlank()) {
            errors.add("rateField000 must not be blank if provided");
        }
        if (dto.getRateField001() != null && dto.getRateField001().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("rateField001 must not be negative");
        }
        if (dto.getRateField002() != null && dto.getRateField002() < 0) {
            errors.add("rateField002 must not be negative");
        }
        if (dto.getRateField003() != null && dto.getRateField003().isBlank()) {
            errors.add("rateField003 must not be blank if provided");
        }
        if (dto.getRateField005() != null && dto.getRateField005().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("rateField005 must not be negative");
        }
        if (dto.getRateField007() != null && dto.getRateField007() < 0) {
            errors.add("rateField007 must not be negative");
        }
        return errors;
    }
}
