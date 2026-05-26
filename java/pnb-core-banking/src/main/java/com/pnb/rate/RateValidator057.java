package com.pnb.rate;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * RateValidator057 — Business rule validation.
 */
@ApplicationScoped
public class RateValidator057 {

    public List<String> validate(RateDto057 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("rate DTO must not be null");
            return errors;
        }
        if (dto.getRateField001() != null && dto.getRateField001() < 0) {
            errors.add("rateField001 must not be negative");
        }
        if (dto.getRateField005() != null && dto.getRateField005().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("rateField005 must not be negative");
        }
        if (dto.getRateField007() != null && dto.getRateField007() < 0) {
            errors.add("rateField007 must not be negative");
        }
        if (dto.getRateField008() != null && dto.getRateField008().isBlank()) {
            errors.add("rateField008 must not be blank if provided");
        }
        if (dto.getRateField011() != null && dto.getRateField011() < 0) {
            errors.add("rateField011 must not be negative");
        }
        if (dto.getRateField012() != null && dto.getRateField012().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("rateField012 must not be negative");
        }
        if (dto.getRateField013() != null && dto.getRateField013().isBlank()) {
            errors.add("rateField013 must not be blank if provided");
        }
        if (dto.getRateField015() != null && dto.getRateField015().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("rateField015 must not be negative");
        }
        return errors;
    }
}
