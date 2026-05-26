package com.pnb.rate;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * RateValidator030 — Business rule validation.
 */
@ApplicationScoped
public class RateValidator030 {

    public List<String> validate(RateDto030 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("rate DTO must not be null");
            return errors;
        }
        if (dto.getRateField000() != null && dto.getRateField000().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("rateField000 must not be negative");
        }
        if (dto.getRateField007() != null && dto.getRateField007().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("rateField007 must not be negative");
        }
        if (dto.getRateField008() != null && dto.getRateField008().isBlank()) {
            errors.add("rateField008 must not be blank if provided");
        }
        if (dto.getRateField009() != null && dto.getRateField009().isBlank()) {
            errors.add("rateField009 must not be blank if provided");
        }
        if (dto.getRateField012() != null && dto.getRateField012() < 0) {
            errors.add("rateField012 must not be negative");
        }
        return errors;
    }
}
