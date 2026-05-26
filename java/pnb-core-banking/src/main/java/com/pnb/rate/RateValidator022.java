package com.pnb.rate;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * RateValidator022 — Business rule validation.
 */
@ApplicationScoped
public class RateValidator022 {

    public List<String> validate(RateDto022 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("rate DTO must not be null");
            return errors;
        }
        if (dto.getRateField002() != null && dto.getRateField002().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("rateField002 must not be negative");
        }
        if (dto.getRateField003() != null && dto.getRateField003().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("rateField003 must not be negative");
        }
        if (dto.getRateField006() != null && dto.getRateField006().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("rateField006 must not be negative");
        }
        if (dto.getRateField011() != null && dto.getRateField011().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("rateField011 must not be negative");
        }
        if (dto.getRateField012() != null && dto.getRateField012().isBlank()) {
            errors.add("rateField012 must not be blank if provided");
        }
        if (dto.getRateField014() != null && dto.getRateField014().isBlank()) {
            errors.add("rateField014 must not be blank if provided");
        }
        if (dto.getRateField016() != null && dto.getRateField016() < 0) {
            errors.add("rateField016 must not be negative");
        }
        if (dto.getRateField017() != null && dto.getRateField017() < 0) {
            errors.add("rateField017 must not be negative");
        }
        return errors;
    }
}
