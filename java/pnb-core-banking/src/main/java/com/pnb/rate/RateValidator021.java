package com.pnb.rate;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * RateValidator021 — Business rule validation.
 */
@ApplicationScoped
public class RateValidator021 {

    public List<String> validate(RateDto021 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("rate DTO must not be null");
            return errors;
        }
        if (dto.getRateField004() != null && dto.getRateField004() < 0) {
            errors.add("rateField004 must not be negative");
        }
        if (dto.getRateField006() != null && dto.getRateField006() < 0) {
            errors.add("rateField006 must not be negative");
        }
        if (dto.getRateField008() != null && dto.getRateField008().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("rateField008 must not be negative");
        }
        if (dto.getRateField010() != null && dto.getRateField010() < 0) {
            errors.add("rateField010 must not be negative");
        }
        return errors;
    }
}
