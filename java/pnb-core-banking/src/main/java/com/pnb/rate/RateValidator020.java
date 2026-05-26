package com.pnb.rate;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * RateValidator020 — Business rule validation.
 */
@ApplicationScoped
public class RateValidator020 {

    public List<String> validate(RateDto020 dto) {
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
        if (dto.getRateField004() != null && dto.getRateField004().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("rateField004 must not be negative");
        }
        if (dto.getRateField005() != null && dto.getRateField005().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("rateField005 must not be negative");
        }
        if (dto.getRateField006() != null && dto.getRateField006().isBlank()) {
            errors.add("rateField006 must not be blank if provided");
        }
        if (dto.getRateField008() != null && dto.getRateField008().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("rateField008 must not be negative");
        }
        if (dto.getRateField010() != null && dto.getRateField010().isBlank()) {
            errors.add("rateField010 must not be blank if provided");
        }
        if (dto.getRateField013() != null && dto.getRateField013().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("rateField013 must not be negative");
        }
        if (dto.getRateField015() != null && dto.getRateField015().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("rateField015 must not be negative");
        }
        return errors;
    }
}
