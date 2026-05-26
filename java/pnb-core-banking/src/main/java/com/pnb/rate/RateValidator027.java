package com.pnb.rate;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * RateValidator027 — Business rule validation.
 */
@ApplicationScoped
public class RateValidator027 {

    public List<String> validate(RateDto027 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("rate DTO must not be null");
            return errors;
        }
        if (dto.getRateField000() != null && dto.getRateField000().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("rateField000 must not be negative");
        }
        if (dto.getRateField002() != null && dto.getRateField002().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("rateField002 must not be negative");
        }
        if (dto.getRateField005() != null && dto.getRateField005().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("rateField005 must not be negative");
        }
        if (dto.getRateField006() != null && dto.getRateField006().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("rateField006 must not be negative");
        }
        if (dto.getRateField008() != null && dto.getRateField008() < 0) {
            errors.add("rateField008 must not be negative");
        }
        if (dto.getRateField009() != null && dto.getRateField009() < 0) {
            errors.add("rateField009 must not be negative");
        }
        return errors;
    }
}
