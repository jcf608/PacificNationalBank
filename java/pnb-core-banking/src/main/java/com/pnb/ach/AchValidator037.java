package com.pnb.ach;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * AchValidator037 — Business rule validation.
 */
@ApplicationScoped
public class AchValidator037 {

    public List<String> validate(AchDto037 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("ach DTO must not be null");
            return errors;
        }
        if (dto.getAchField000() != null && dto.getAchField000().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("achField000 must not be negative");
        }
        return errors;
    }
}
