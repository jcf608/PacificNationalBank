package com.pnb.rate;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * RateValidator039 — Business rule validation.
 */
@ApplicationScoped
public class RateValidator039 {

    public List<String> validate(RateDto039 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("rate DTO must not be null");
            return errors;
        }
        if (dto.getRateField001() != null && dto.getRateField001().isBlank()) {
            errors.add("rateField001 must not be blank if provided");
        }
        if (dto.getRateField006() != null && dto.getRateField006() < 0) {
            errors.add("rateField006 must not be negative");
        }
        if (dto.getRateField007() != null && dto.getRateField007().isBlank()) {
            errors.add("rateField007 must not be blank if provided");
        }
        return errors;
    }
}
