package com.pnb.rate;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * RateValidator033 — Business rule validation.
 */
@ApplicationScoped
public class RateValidator033 {

    public List<String> validate(RateDto033 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("rate DTO must not be null");
            return errors;
        }
        if (dto.getRateField000() != null && dto.getRateField000().isBlank()) {
            errors.add("rateField000 must not be blank if provided");
        }
        if (dto.getRateField001() != null && dto.getRateField001() < 0) {
            errors.add("rateField001 must not be negative");
        }
        if (dto.getRateField002() != null && dto.getRateField002() < 0) {
            errors.add("rateField002 must not be negative");
        }
        if (dto.getRateField006() != null && dto.getRateField006() < 0) {
            errors.add("rateField006 must not be negative");
        }
        if (dto.getRateField009() != null && dto.getRateField009().isBlank()) {
            errors.add("rateField009 must not be blank if provided");
        }
        if (dto.getRateField010() != null && dto.getRateField010().isBlank()) {
            errors.add("rateField010 must not be blank if provided");
        }
        if (dto.getRateField016() != null && dto.getRateField016() < 0) {
            errors.add("rateField016 must not be negative");
        }
        return errors;
    }
}
