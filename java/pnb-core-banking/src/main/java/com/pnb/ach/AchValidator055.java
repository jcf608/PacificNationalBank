package com.pnb.ach;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * AchValidator055 — Business rule validation.
 */
@ApplicationScoped
public class AchValidator055 {

    public List<String> validate(AchDto055 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("ach DTO must not be null");
            return errors;
        }
        if (dto.getAchField005() != null && dto.getAchField005() < 0) {
            errors.add("achField005 must not be negative");
        }
        if (dto.getAchField006() != null && dto.getAchField006().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("achField006 must not be negative");
        }
        if (dto.getAchField008() != null && dto.getAchField008().isBlank()) {
            errors.add("achField008 must not be blank if provided");
        }
        if (dto.getAchField010() != null && dto.getAchField010() < 0) {
            errors.add("achField010 must not be negative");
        }
        return errors;
    }
}
