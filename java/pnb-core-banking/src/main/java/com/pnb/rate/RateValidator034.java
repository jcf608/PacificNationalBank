package com.pnb.rate;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * RateValidator034 — Business rule validation.
 */
@ApplicationScoped
public class RateValidator034 {

    public List<String> validate(RateDto034 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("rate DTO must not be null");
            return errors;
        }
        if (dto.getRateField000() != null && dto.getRateField000() < 0) {
            errors.add("rateField000 must not be negative");
        }
        if (dto.getRateField002() != null && dto.getRateField002().isBlank()) {
            errors.add("rateField002 must not be blank if provided");
        }
        if (dto.getRateField003() != null && dto.getRateField003().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("rateField003 must not be negative");
        }
        if (dto.getRateField008() != null && dto.getRateField008().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("rateField008 must not be negative");
        }
        if (dto.getRateField012() != null && dto.getRateField012().isBlank()) {
            errors.add("rateField012 must not be blank if provided");
        }
        if (dto.getRateField017() != null && dto.getRateField017().isBlank()) {
            errors.add("rateField017 must not be blank if provided");
        }
        return errors;
    }
}
