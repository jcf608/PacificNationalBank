package com.pnb.rate;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * RateValidator028 — Business rule validation.
 */
@ApplicationScoped
public class RateValidator028 {

    public List<String> validate(RateDto028 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("rate DTO must not be null");
            return errors;
        }
        if (dto.getRateField000() != null && dto.getRateField000().isBlank()) {
            errors.add("rateField000 must not be blank if provided");
        }
        if (dto.getRateField001() != null && dto.getRateField001().isBlank()) {
            errors.add("rateField001 must not be blank if provided");
        }
        if (dto.getRateField002() != null && dto.getRateField002() < 0) {
            errors.add("rateField002 must not be negative");
        }
        if (dto.getRateField007() != null && dto.getRateField007() < 0) {
            errors.add("rateField007 must not be negative");
        }
        if (dto.getRateField009() != null && dto.getRateField009().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("rateField009 must not be negative");
        }
        if (dto.getRateField011() != null && dto.getRateField011().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("rateField011 must not be negative");
        }
        return errors;
    }
}
