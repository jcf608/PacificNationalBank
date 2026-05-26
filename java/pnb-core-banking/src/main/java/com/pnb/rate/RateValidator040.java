package com.pnb.rate;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * RateValidator040 — Business rule validation.
 */
@ApplicationScoped
public class RateValidator040 {

    public List<String> validate(RateDto040 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("rate DTO must not be null");
            return errors;
        }
        if (dto.getRateField000() != null && dto.getRateField000() < 0) {
            errors.add("rateField000 must not be negative");
        }
        if (dto.getRateField001() != null && dto.getRateField001().isBlank()) {
            errors.add("rateField001 must not be blank if provided");
        }
        if (dto.getRateField002() != null && dto.getRateField002() < 0) {
            errors.add("rateField002 must not be negative");
        }
        if (dto.getRateField003() != null && dto.getRateField003() < 0) {
            errors.add("rateField003 must not be negative");
        }
        if (dto.getRateField005() != null && dto.getRateField005() < 0) {
            errors.add("rateField005 must not be negative");
        }
        if (dto.getRateField006() != null && dto.getRateField006().isBlank()) {
            errors.add("rateField006 must not be blank if provided");
        }
        return errors;
    }
}
