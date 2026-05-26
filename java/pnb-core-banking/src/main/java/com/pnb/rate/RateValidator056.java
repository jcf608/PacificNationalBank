package com.pnb.rate;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * RateValidator056 — Business rule validation.
 */
@ApplicationScoped
public class RateValidator056 {

    public List<String> validate(RateDto056 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("rate DTO must not be null");
            return errors;
        }
        if (dto.getRateField002() != null && dto.getRateField002().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("rateField002 must not be negative");
        }
        if (dto.getRateField011() != null && dto.getRateField011() < 0) {
            errors.add("rateField011 must not be negative");
        }
        if (dto.getRateField012() != null && dto.getRateField012().isBlank()) {
            errors.add("rateField012 must not be blank if provided");
        }
        if (dto.getRateField015() != null && dto.getRateField015() < 0) {
            errors.add("rateField015 must not be negative");
        }
        return errors;
    }
}
