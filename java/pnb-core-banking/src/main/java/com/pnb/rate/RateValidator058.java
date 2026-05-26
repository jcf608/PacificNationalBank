package com.pnb.rate;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * RateValidator058 — Business rule validation.
 */
@ApplicationScoped
public class RateValidator058 {

    public List<String> validate(RateDto058 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("rate DTO must not be null");
            return errors;
        }
        if (dto.getRateField000() != null && dto.getRateField000().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("rateField000 must not be negative");
        }
        if (dto.getRateField001() != null && dto.getRateField001().isBlank()) {
            errors.add("rateField001 must not be blank if provided");
        }
        if (dto.getRateField003() != null && dto.getRateField003().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("rateField003 must not be negative");
        }
        if (dto.getRateField004() != null && dto.getRateField004().isBlank()) {
            errors.add("rateField004 must not be blank if provided");
        }
        if (dto.getRateField005() != null && dto.getRateField005() < 0) {
            errors.add("rateField005 must not be negative");
        }
        if (dto.getRateField007() != null && dto.getRateField007().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("rateField007 must not be negative");
        }
        if (dto.getRateField008() != null && dto.getRateField008() < 0) {
            errors.add("rateField008 must not be negative");
        }
        if (dto.getRateField009() != null && dto.getRateField009().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("rateField009 must not be negative");
        }
        if (dto.getRateField010() != null && dto.getRateField010().isBlank()) {
            errors.add("rateField010 must not be blank if provided");
        }
        if (dto.getRateField011() != null && dto.getRateField011().isBlank()) {
            errors.add("rateField011 must not be blank if provided");
        }
        if (dto.getRateField013() != null && dto.getRateField013().isBlank()) {
            errors.add("rateField013 must not be blank if provided");
        }
        if (dto.getRateField015() != null && dto.getRateField015().isBlank()) {
            errors.add("rateField015 must not be blank if provided");
        }
        if (dto.getRateField017() != null && dto.getRateField017() < 0) {
            errors.add("rateField017 must not be negative");
        }
        return errors;
    }
}
