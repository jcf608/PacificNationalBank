package com.pnb.rate;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * RateValidator032 — Business rule validation.
 */
@ApplicationScoped
public class RateValidator032 {

    public List<String> validate(RateDto032 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("rate DTO must not be null");
            return errors;
        }
        if (dto.getRateField001() != null && dto.getRateField001().isBlank()) {
            errors.add("rateField001 must not be blank if provided");
        }
        if (dto.getRateField002() != null && dto.getRateField002().isBlank()) {
            errors.add("rateField002 must not be blank if provided");
        }
        if (dto.getRateField003() != null && dto.getRateField003().isBlank()) {
            errors.add("rateField003 must not be blank if provided");
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
        if (dto.getRateField010() != null && dto.getRateField010().isBlank()) {
            errors.add("rateField010 must not be blank if provided");
        }
        if (dto.getRateField011() != null && dto.getRateField011().isBlank()) {
            errors.add("rateField011 must not be blank if provided");
        }
        if (dto.getRateField014() != null && dto.getRateField014().isBlank()) {
            errors.add("rateField014 must not be blank if provided");
        }
        if (dto.getRateField015() != null && dto.getRateField015().isBlank()) {
            errors.add("rateField015 must not be blank if provided");
        }
        return errors;
    }
}
