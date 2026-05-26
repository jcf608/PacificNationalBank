package com.pnb.ach;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * AchValidator026 — Business rule validation.
 */
@ApplicationScoped
public class AchValidator026 {

    public List<String> validate(AchDto026 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("ach DTO must not be null");
            return errors;
        }
        if (dto.getAchField001() != null && dto.getAchField001() < 0) {
            errors.add("achField001 must not be negative");
        }
        if (dto.getAchField004() != null && dto.getAchField004().isBlank()) {
            errors.add("achField004 must not be blank if provided");
        }
        if (dto.getAchField006() != null && dto.getAchField006().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("achField006 must not be negative");
        }
        return errors;
    }
}
