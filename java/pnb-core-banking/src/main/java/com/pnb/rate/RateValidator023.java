package com.pnb.rate;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * RateValidator023 — Business rule validation.
 */
@ApplicationScoped
public class RateValidator023 {

    public List<String> validate(RateDto023 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("rate DTO must not be null");
            return errors;
        }
        if (dto.getRateField000() != null && dto.getRateField000().isBlank()) {
            errors.add("rateField000 must not be blank if provided");
        }
        if (dto.getRateField005() != null && dto.getRateField005() < 0) {
            errors.add("rateField005 must not be negative");
        }
        if (dto.getRateField007() != null && dto.getRateField007() < 0) {
            errors.add("rateField007 must not be negative");
        }
        if (dto.getRateField011() != null && dto.getRateField011().isBlank()) {
            errors.add("rateField011 must not be blank if provided");
        }
        if (dto.getRateField012() != null && dto.getRateField012().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("rateField012 must not be negative");
        }
        if (dto.getRateField014() != null && dto.getRateField014().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("rateField014 must not be negative");
        }
        if (dto.getRateField018() != null && dto.getRateField018().isBlank()) {
            errors.add("rateField018 must not be blank if provided");
        }
        return errors;
    }
}
