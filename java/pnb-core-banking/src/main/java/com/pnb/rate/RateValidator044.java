package com.pnb.rate;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * RateValidator044 — Business rule validation.
 */
@ApplicationScoped
public class RateValidator044 {

    public List<String> validate(RateDto044 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("rate DTO must not be null");
            return errors;
        }
        if (dto.getRateField001() != null && dto.getRateField001().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("rateField001 must not be negative");
        }
        if (dto.getRateField008() != null && dto.getRateField008().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("rateField008 must not be negative");
        }
        if (dto.getRateField011() != null && dto.getRateField011().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("rateField011 must not be negative");
        }
        if (dto.getRateField013() != null && dto.getRateField013() < 0) {
            errors.add("rateField013 must not be negative");
        }
        return errors;
    }
}
