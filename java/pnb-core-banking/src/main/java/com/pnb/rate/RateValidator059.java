package com.pnb.rate;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * RateValidator059 — Business rule validation.
 */
@ApplicationScoped
public class RateValidator059 {

    public List<String> validate(RateDto059 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("rate DTO must not be null");
            return errors;
        }
        if (dto.getRateField000() != null && dto.getRateField000() < 0) {
            errors.add("rateField000 must not be negative");
        }
        if (dto.getRateField006() != null && dto.getRateField006().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("rateField006 must not be negative");
        }
        if (dto.getRateField008() != null && dto.getRateField008().isBlank()) {
            errors.add("rateField008 must not be blank if provided");
        }
        if (dto.getRateField010() != null && dto.getRateField010() < 0) {
            errors.add("rateField010 must not be negative");
        }
        if (dto.getRateField013() != null && dto.getRateField013().isBlank()) {
            errors.add("rateField013 must not be blank if provided");
        }
        if (dto.getRateField018() != null && dto.getRateField018().isBlank()) {
            errors.add("rateField018 must not be blank if provided");
        }
        return errors;
    }
}
