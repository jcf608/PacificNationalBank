package com.pnb.ach;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * AchValidator032 — Business rule validation.
 */
@ApplicationScoped
public class AchValidator032 {

    public List<String> validate(AchDto032 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("ach DTO must not be null");
            return errors;
        }
        if (dto.getAchField000() != null && dto.getAchField000().isBlank()) {
            errors.add("achField000 must not be blank if provided");
        }
        if (dto.getAchField004() != null && dto.getAchField004() < 0) {
            errors.add("achField004 must not be negative");
        }
        if (dto.getAchField008() != null && dto.getAchField008() < 0) {
            errors.add("achField008 must not be negative");
        }
        if (dto.getAchField010() != null && dto.getAchField010().isBlank()) {
            errors.add("achField010 must not be blank if provided");
        }
        if (dto.getAchField011() != null && dto.getAchField011() < 0) {
            errors.add("achField011 must not be negative");
        }
        if (dto.getAchField012() != null && dto.getAchField012().isBlank()) {
            errors.add("achField012 must not be blank if provided");
        }
        if (dto.getAchField015() != null && dto.getAchField015() < 0) {
            errors.add("achField015 must not be negative");
        }
        return errors;
    }
}
