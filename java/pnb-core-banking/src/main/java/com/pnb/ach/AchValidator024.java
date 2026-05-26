package com.pnb.ach;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * AchValidator024 — Business rule validation.
 */
@ApplicationScoped
public class AchValidator024 {

    public List<String> validate(AchDto024 dto) {
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
        if (dto.getAchField007() != null && dto.getAchField007() < 0) {
            errors.add("achField007 must not be negative");
        }
        return errors;
    }
}
