package com.pnb.ach;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * AchValidator036 — Business rule validation.
 */
@ApplicationScoped
public class AchValidator036 {

    public List<String> validate(AchDto036 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("ach DTO must not be null");
            return errors;
        }
        if (dto.getAchField001() != null && dto.getAchField001().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("achField001 must not be negative");
        }
        if (dto.getAchField002() != null && dto.getAchField002().isBlank()) {
            errors.add("achField002 must not be blank if provided");
        }
        return errors;
    }
}
