package com.pnb.rate;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * RateValidator038 — Business rule validation.
 */
@ApplicationScoped
public class RateValidator038 {

    public List<String> validate(RateDto038 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("rate DTO must not be null");
            return errors;
        }
        if (dto.getRateField000() != null && dto.getRateField000().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("rateField000 must not be negative");
        }
        if (dto.getRateField005() != null && dto.getRateField005().isBlank()) {
            errors.add("rateField005 must not be blank if provided");
        }
        return errors;
    }
}
