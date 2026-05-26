package com.pnb.ach;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * AchValidator020 — Business rule validation.
 */
@ApplicationScoped
public class AchValidator020 {

    public List<String> validate(AchDto020 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("ach DTO must not be null");
            return errors;
        }
        if (dto.getAchField004() != null && dto.getAchField004() < 0) {
            errors.add("achField004 must not be negative");
        }
        if (dto.getAchField005() != null && dto.getAchField005().isBlank()) {
            errors.add("achField005 must not be blank if provided");
        }
        if (dto.getAchField007() != null && dto.getAchField007() < 0) {
            errors.add("achField007 must not be negative");
        }
        if (dto.getAchField008() != null && dto.getAchField008() < 0) {
            errors.add("achField008 must not be negative");
        }
        if (dto.getAchField010() != null && dto.getAchField010() < 0) {
            errors.add("achField010 must not be negative");
        }
        if (dto.getAchField012() != null && dto.getAchField012() < 0) {
            errors.add("achField012 must not be negative");
        }
        if (dto.getAchField013() != null && dto.getAchField013().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("achField013 must not be negative");
        }
        if (dto.getAchField014() != null && dto.getAchField014().isBlank()) {
            errors.add("achField014 must not be blank if provided");
        }
        return errors;
    }
}
