package com.pnb.ach;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * AchValidator021 — Business rule validation.
 */
@ApplicationScoped
public class AchValidator021 {

    public List<String> validate(AchDto021 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("ach DTO must not be null");
            return errors;
        }
        if (dto.getAchField003() != null && dto.getAchField003().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("achField003 must not be negative");
        }
        if (dto.getAchField004() != null && dto.getAchField004().isBlank()) {
            errors.add("achField004 must not be blank if provided");
        }
        if (dto.getAchField006() != null && dto.getAchField006().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("achField006 must not be negative");
        }
        if (dto.getAchField008() != null && dto.getAchField008().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("achField008 must not be negative");
        }
        if (dto.getAchField010() != null && dto.getAchField010().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("achField010 must not be negative");
        }
        if (dto.getAchField011() != null && dto.getAchField011().isBlank()) {
            errors.add("achField011 must not be blank if provided");
        }
        if (dto.getAchField012() != null && dto.getAchField012().isBlank()) {
            errors.add("achField012 must not be blank if provided");
        }
        if (dto.getAchField014() != null && dto.getAchField014() < 0) {
            errors.add("achField014 must not be negative");
        }
        if (dto.getAchField015() != null && dto.getAchField015().isBlank()) {
            errors.add("achField015 must not be blank if provided");
        }
        if (dto.getAchField016() != null && dto.getAchField016() < 0) {
            errors.add("achField016 must not be negative");
        }
        return errors;
    }
}
