package com.pnb.rate;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * RateValidator035 — Business rule validation.
 */
@ApplicationScoped
public class RateValidator035 {

    public List<String> validate(RateDto035 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("rate DTO must not be null");
            return errors;
        }
        if (dto.getRateField000() != null && dto.getRateField000().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("rateField000 must not be negative");
        }
        if (dto.getRateField009() != null && dto.getRateField009().isBlank()) {
            errors.add("rateField009 must not be blank if provided");
        }
        if (dto.getRateField012() != null && dto.getRateField012().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("rateField012 must not be negative");
        }
        if (dto.getRateField013() != null && dto.getRateField013() < 0) {
            errors.add("rateField013 must not be negative");
        }
        if (dto.getRateField016() != null && dto.getRateField016() < 0) {
            errors.add("rateField016 must not be negative");
        }
        if (dto.getRateField018() != null && dto.getRateField018().isBlank()) {
            errors.add("rateField018 must not be blank if provided");
        }
        return errors;
    }
}
