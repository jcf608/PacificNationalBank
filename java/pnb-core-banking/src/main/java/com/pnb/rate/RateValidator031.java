package com.pnb.rate;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * RateValidator031 — Business rule validation.
 */
@ApplicationScoped
public class RateValidator031 {

    public List<String> validate(RateDto031 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("rate DTO must not be null");
            return errors;
        }
        if (dto.getRateField002() != null && dto.getRateField002().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("rateField002 must not be negative");
        }
        if (dto.getRateField004() != null && dto.getRateField004().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("rateField004 must not be negative");
        }
        if (dto.getRateField006() != null && dto.getRateField006().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("rateField006 must not be negative");
        }
        if (dto.getRateField007() != null && dto.getRateField007() < 0) {
            errors.add("rateField007 must not be negative");
        }
        if (dto.getRateField009() != null && dto.getRateField009().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("rateField009 must not be negative");
        }
        if (dto.getRateField010() != null && dto.getRateField010() < 0) {
            errors.add("rateField010 must not be negative");
        }
        if (dto.getRateField013() != null && dto.getRateField013().isBlank()) {
            errors.add("rateField013 must not be blank if provided");
        }
        if (dto.getRateField014() != null && dto.getRateField014().isBlank()) {
            errors.add("rateField014 must not be blank if provided");
        }
        return errors;
    }
}
