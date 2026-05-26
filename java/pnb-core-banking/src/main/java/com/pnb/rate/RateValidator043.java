package com.pnb.rate;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * RateValidator043 — Business rule validation.
 */
@ApplicationScoped
public class RateValidator043 {

    public List<String> validate(RateDto043 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("rate DTO must not be null");
            return errors;
        }
        if (dto.getRateField000() != null && dto.getRateField000() < 0) {
            errors.add("rateField000 must not be negative");
        }
        if (dto.getRateField001() != null && dto.getRateField001() < 0) {
            errors.add("rateField001 must not be negative");
        }
        if (dto.getRateField003() != null && dto.getRateField003() < 0) {
            errors.add("rateField003 must not be negative");
        }
        if (dto.getRateField009() != null && dto.getRateField009().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("rateField009 must not be negative");
        }
        if (dto.getRateField010() != null && dto.getRateField010() < 0) {
            errors.add("rateField010 must not be negative");
        }
        if (dto.getRateField012() != null && dto.getRateField012().isBlank()) {
            errors.add("rateField012 must not be blank if provided");
        }
        if (dto.getRateField013() != null && dto.getRateField013().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("rateField013 must not be negative");
        }
        return errors;
    }
}
