package com.pnb.ach;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * AchValidator041 — Business rule validation.
 */
@ApplicationScoped
public class AchValidator041 {

    public List<String> validate(AchDto041 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("ach DTO must not be null");
            return errors;
        }
        if (dto.getAchField000() != null && dto.getAchField000() < 0) {
            errors.add("achField000 must not be negative");
        }
        if (dto.getAchField001() != null && dto.getAchField001().isBlank()) {
            errors.add("achField001 must not be blank if provided");
        }
        if (dto.getAchField002() != null && dto.getAchField002() < 0) {
            errors.add("achField002 must not be negative");
        }
        if (dto.getAchField008() != null && dto.getAchField008().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("achField008 must not be negative");
        }
        if (dto.getAchField011() != null && dto.getAchField011() < 0) {
            errors.add("achField011 must not be negative");
        }
        if (dto.getAchField012() != null && dto.getAchField012().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("achField012 must not be negative");
        }
        return errors;
    }
}
