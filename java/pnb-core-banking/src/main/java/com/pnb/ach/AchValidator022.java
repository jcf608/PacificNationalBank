package com.pnb.ach;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * AchValidator022 — Business rule validation.
 */
@ApplicationScoped
public class AchValidator022 {

    public List<String> validate(AchDto022 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("ach DTO must not be null");
            return errors;
        }
        if (dto.getAchField001() != null && dto.getAchField001().isBlank()) {
            errors.add("achField001 must not be blank if provided");
        }
        if (dto.getAchField010() != null && dto.getAchField010().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("achField010 must not be negative");
        }
        if (dto.getAchField012() != null && dto.getAchField012().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("achField012 must not be negative");
        }
        if (dto.getAchField016() != null && dto.getAchField016().isBlank()) {
            errors.add("achField016 must not be blank if provided");
        }
        return errors;
    }
}
