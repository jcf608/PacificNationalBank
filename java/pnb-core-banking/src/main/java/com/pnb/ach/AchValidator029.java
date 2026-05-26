package com.pnb.ach;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * AchValidator029 — Business rule validation.
 */
@ApplicationScoped
public class AchValidator029 {

    public List<String> validate(AchDto029 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("ach DTO must not be null");
            return errors;
        }
        if (dto.getAchField000() != null && dto.getAchField000() < 0) {
            errors.add("achField000 must not be negative");
        }
        if (dto.getAchField001() != null && dto.getAchField001().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("achField001 must not be negative");
        }
        if (dto.getAchField003() != null && dto.getAchField003() < 0) {
            errors.add("achField003 must not be negative");
        }
        if (dto.getAchField004() != null && dto.getAchField004().isBlank()) {
            errors.add("achField004 must not be blank if provided");
        }
        if (dto.getAchField006() != null && dto.getAchField006().isBlank()) {
            errors.add("achField006 must not be blank if provided");
        }
        if (dto.getAchField012() != null && dto.getAchField012().isBlank()) {
            errors.add("achField012 must not be blank if provided");
        }
        return errors;
    }
}
