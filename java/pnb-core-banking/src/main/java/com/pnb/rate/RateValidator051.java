package com.pnb.rate;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * RateValidator051 — Business rule validation.
 */
@ApplicationScoped
public class RateValidator051 {

    public List<String> validate(RateDto051 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("rate DTO must not be null");
            return errors;
        }
        if (dto.getRateField002() != null && dto.getRateField002().isBlank()) {
            errors.add("rateField002 must not be blank if provided");
        }
        if (dto.getRateField003() != null && dto.getRateField003().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("rateField003 must not be negative");
        }
        if (dto.getRateField005() != null && dto.getRateField005().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("rateField005 must not be negative");
        }
        if (dto.getRateField010() != null && dto.getRateField010().isBlank()) {
            errors.add("rateField010 must not be blank if provided");
        }
        return errors;
    }
}
