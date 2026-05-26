package com.pnb.rate;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * RateValidator041 — Business rule validation.
 */
@ApplicationScoped
public class RateValidator041 {

    public List<String> validate(RateDto041 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("rate DTO must not be null");
            return errors;
        }
        if (dto.getRateField000() != null && dto.getRateField000().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("rateField000 must not be negative");
        }
        if (dto.getRateField001() != null && dto.getRateField001().isBlank()) {
            errors.add("rateField001 must not be blank if provided");
        }
        if (dto.getRateField002() != null && dto.getRateField002().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("rateField002 must not be negative");
        }
        if (dto.getRateField004() != null && dto.getRateField004() < 0) {
            errors.add("rateField004 must not be negative");
        }
        if (dto.getRateField008() != null && dto.getRateField008() < 0) {
            errors.add("rateField008 must not be negative");
        }
        if (dto.getRateField010() != null && dto.getRateField010().isBlank()) {
            errors.add("rateField010 must not be blank if provided");
        }
        if (dto.getRateField012() != null && dto.getRateField012().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("rateField012 must not be negative");
        }
        return errors;
    }
}
