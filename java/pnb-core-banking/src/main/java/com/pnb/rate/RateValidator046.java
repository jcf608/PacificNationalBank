package com.pnb.rate;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * RateValidator046 — Business rule validation.
 */
@ApplicationScoped
public class RateValidator046 {

    public List<String> validate(RateDto046 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("rate DTO must not be null");
            return errors;
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
        if (dto.getRateField008() != null && dto.getRateField008().isBlank()) {
            errors.add("rateField008 must not be blank if provided");
        }
        if (dto.getRateField011() != null && dto.getRateField011().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("rateField011 must not be negative");
        }
        if (dto.getRateField014() != null && dto.getRateField014().isBlank()) {
            errors.add("rateField014 must not be blank if provided");
        }
        if (dto.getRateField015() != null && dto.getRateField015().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("rateField015 must not be negative");
        }
        return errors;
    }
}
