package com.pnb.rate;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * RateValidator025 — Business rule validation.
 */
@ApplicationScoped
public class RateValidator025 {

    public List<String> validate(RateDto025 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("rate DTO must not be null");
            return errors;
        }
        if (dto.getRateField000() != null && dto.getRateField000() < 0) {
            errors.add("rateField000 must not be negative");
        }
        if (dto.getRateField001() != null && dto.getRateField001().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("rateField001 must not be negative");
        }
        if (dto.getRateField003() != null && dto.getRateField003() < 0) {
            errors.add("rateField003 must not be negative");
        }
        if (dto.getRateField004() != null && dto.getRateField004() < 0) {
            errors.add("rateField004 must not be negative");
        }
        return errors;
    }
}
