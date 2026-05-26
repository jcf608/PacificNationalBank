package com.pnb.rate;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * RateValidator049 — Business rule validation.
 */
@ApplicationScoped
public class RateValidator049 {

    public List<String> validate(RateDto049 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("rate DTO must not be null");
            return errors;
        }
        if (dto.getRateField007() != null && dto.getRateField007().isBlank()) {
            errors.add("rateField007 must not be blank if provided");
        }
        return errors;
    }
}
