package com.pnb.ach;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * AchValidator050 — Business rule validation.
 */
@ApplicationScoped
public class AchValidator050 {

    public List<String> validate(AchDto050 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("ach DTO must not be null");
            return errors;
        }
        if (dto.getAchField000() != null && dto.getAchField000().isBlank()) {
            errors.add("achField000 must not be blank if provided");
        }
        if (dto.getAchField001() != null && dto.getAchField001().isBlank()) {
            errors.add("achField001 must not be blank if provided");
        }
        if (dto.getAchField002() != null && dto.getAchField002().isBlank()) {
            errors.add("achField002 must not be blank if provided");
        }
        if (dto.getAchField009() != null && dto.getAchField009().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("achField009 must not be negative");
        }
        return errors;
    }
}
