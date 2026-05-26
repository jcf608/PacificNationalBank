package com.pnb.rate;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * RateValidator047 — Business rule validation.
 */
@ApplicationScoped
public class RateValidator047 {

    public List<String> validate(RateDto047 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("rate DTO must not be null");
            return errors;
        }
        if (dto.getRateField004() != null && dto.getRateField004().isBlank()) {
            errors.add("rateField004 must not be blank if provided");
        }
        if (dto.getRateField006() != null && dto.getRateField006().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("rateField006 must not be negative");
        }
        if (dto.getRateField007() != null && dto.getRateField007().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("rateField007 must not be negative");
        }
        if (dto.getRateField011() != null && dto.getRateField011().isBlank()) {
            errors.add("rateField011 must not be blank if provided");
        }
        if (dto.getRateField014() != null && dto.getRateField014().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("rateField014 must not be negative");
        }
        if (dto.getRateField016() != null && dto.getRateField016() < 0) {
            errors.add("rateField016 must not be negative");
        }
        if (dto.getRateField018() != null && dto.getRateField018() < 0) {
            errors.add("rateField018 must not be negative");
        }
        return errors;
    }
}
