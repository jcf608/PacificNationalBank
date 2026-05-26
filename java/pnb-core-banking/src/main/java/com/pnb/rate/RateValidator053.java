package com.pnb.rate;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * RateValidator053 — Business rule validation.
 */
@ApplicationScoped
public class RateValidator053 {

    public List<String> validate(RateDto053 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("rate DTO must not be null");
            return errors;
        }
        if (dto.getRateField001() != null && dto.getRateField001() < 0) {
            errors.add("rateField001 must not be negative");
        }
        if (dto.getRateField002() != null && dto.getRateField002().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("rateField002 must not be negative");
        }
        if (dto.getRateField003() != null && dto.getRateField003().isBlank()) {
            errors.add("rateField003 must not be blank if provided");
        }
        if (dto.getRateField010() != null && dto.getRateField010().isBlank()) {
            errors.add("rateField010 must not be blank if provided");
        }
        if (dto.getRateField011() != null && dto.getRateField011().isBlank()) {
            errors.add("rateField011 must not be blank if provided");
        }
        if (dto.getRateField012() != null && dto.getRateField012() < 0) {
            errors.add("rateField012 must not be negative");
        }
        return errors;
    }
}
