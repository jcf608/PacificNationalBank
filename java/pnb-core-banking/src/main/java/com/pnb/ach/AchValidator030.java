package com.pnb.ach;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * AchValidator030 — Business rule validation.
 */
@ApplicationScoped
public class AchValidator030 {

    public List<String> validate(AchDto030 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("ach DTO must not be null");
            return errors;
        }
        if (dto.getAchField000() != null && dto.getAchField000() < 0) {
            errors.add("achField000 must not be negative");
        }
        if (dto.getAchField004() != null && dto.getAchField004().isBlank()) {
            errors.add("achField004 must not be blank if provided");
        }
        if (dto.getAchField005() != null && dto.getAchField005().isBlank()) {
            errors.add("achField005 must not be blank if provided");
        }
        if (dto.getAchField009() != null && dto.getAchField009() < 0) {
            errors.add("achField009 must not be negative");
        }
        if (dto.getAchField010() != null && dto.getAchField010().isBlank()) {
            errors.add("achField010 must not be blank if provided");
        }
        if (dto.getAchField011() != null && dto.getAchField011().isBlank()) {
            errors.add("achField011 must not be blank if provided");
        }
        return errors;
    }
}
