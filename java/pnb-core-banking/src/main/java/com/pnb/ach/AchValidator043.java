package com.pnb.ach;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * AchValidator043 — Business rule validation.
 */
@ApplicationScoped
public class AchValidator043 {

    public List<String> validate(AchDto043 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("ach DTO must not be null");
            return errors;
        }
        if (dto.getAchField000() != null && dto.getAchField000().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("achField000 must not be negative");
        }
        if (dto.getAchField003() != null && dto.getAchField003().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("achField003 must not be negative");
        }
        if (dto.getAchField004() != null && dto.getAchField004().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("achField004 must not be negative");
        }
        if (dto.getAchField007() != null && dto.getAchField007().isBlank()) {
            errors.add("achField007 must not be blank if provided");
        }
        if (dto.getAchField012() != null && dto.getAchField012().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("achField012 must not be negative");
        }
        if (dto.getAchField014() != null && dto.getAchField014().isBlank()) {
            errors.add("achField014 must not be blank if provided");
        }
        return errors;
    }
}
