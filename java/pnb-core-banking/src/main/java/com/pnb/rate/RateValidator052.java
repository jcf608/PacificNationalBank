package com.pnb.rate;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * RateValidator052 — Business rule validation.
 */
@ApplicationScoped
public class RateValidator052 {

    public List<String> validate(RateDto052 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("rate DTO must not be null");
            return errors;
        }
        if (dto.getRateField001() != null && dto.getRateField001().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("rateField001 must not be negative");
        }
        if (dto.getRateField002() != null && dto.getRateField002() < 0) {
            errors.add("rateField002 must not be negative");
        }
        if (dto.getRateField003() != null && dto.getRateField003() < 0) {
            errors.add("rateField003 must not be negative");
        }
        if (dto.getRateField005() != null && dto.getRateField005().isBlank()) {
            errors.add("rateField005 must not be blank if provided");
        }
        if (dto.getRateField009() != null && dto.getRateField009().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("rateField009 must not be negative");
        }
        if (dto.getRateField010() != null && dto.getRateField010().isBlank()) {
            errors.add("rateField010 must not be blank if provided");
        }
        return errors;
    }
}
