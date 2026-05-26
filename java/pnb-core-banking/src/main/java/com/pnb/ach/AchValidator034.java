package com.pnb.ach;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * AchValidator034 — Business rule validation.
 */
@ApplicationScoped
public class AchValidator034 {

    public List<String> validate(AchDto034 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("ach DTO must not be null");
            return errors;
        }
        if (dto.getAchField004() != null && dto.getAchField004() < 0) {
            errors.add("achField004 must not be negative");
        }
        if (dto.getAchField008() != null && dto.getAchField008() < 0) {
            errors.add("achField008 must not be negative");
        }
        if (dto.getAchField009() != null && dto.getAchField009().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("achField009 must not be negative");
        }
        if (dto.getAchField010() != null && dto.getAchField010() < 0) {
            errors.add("achField010 must not be negative");
        }
        if (dto.getAchField011() != null && dto.getAchField011().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("achField011 must not be negative");
        }
        if (dto.getAchField016() != null && dto.getAchField016().isBlank()) {
            errors.add("achField016 must not be blank if provided");
        }
        return errors;
    }
}
