package com.pnb.rate;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * RateValidator045 — Business rule validation.
 */
@ApplicationScoped
public class RateValidator045 {

    public List<String> validate(RateDto045 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("rate DTO must not be null");
            return errors;
        }
        if (dto.getRateField000() != null && dto.getRateField000() < 0) {
            errors.add("rateField000 must not be negative");
        }
        if (dto.getRateField002() != null && dto.getRateField002().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("rateField002 must not be negative");
        }
        if (dto.getRateField004() != null && dto.getRateField004().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("rateField004 must not be negative");
        }
        if (dto.getRateField006() != null && dto.getRateField006() < 0) {
            errors.add("rateField006 must not be negative");
        }
        if (dto.getRateField015() != null && dto.getRateField015().isBlank()) {
            errors.add("rateField015 must not be blank if provided");
        }
        return errors;
    }
}
