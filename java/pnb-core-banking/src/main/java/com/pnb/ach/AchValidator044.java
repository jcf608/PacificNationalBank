package com.pnb.ach;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * AchValidator044 — Business rule validation.
 */
@ApplicationScoped
public class AchValidator044 {

    public List<String> validate(AchDto044 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("ach DTO must not be null");
            return errors;
        }
        if (dto.getAchField001() != null && dto.getAchField001().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("achField001 must not be negative");
        }
        if (dto.getAchField005() != null && dto.getAchField005().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("achField005 must not be negative");
        }
        if (dto.getAchField011() != null && dto.getAchField011().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("achField011 must not be negative");
        }
        if (dto.getAchField012() != null && dto.getAchField012().isBlank()) {
            errors.add("achField012 must not be blank if provided");
        }
        if (dto.getAchField013() != null && dto.getAchField013().isBlank()) {
            errors.add("achField013 must not be blank if provided");
        }
        if (dto.getAchField015() != null && dto.getAchField015() < 0) {
            errors.add("achField015 must not be negative");
        }
        return errors;
    }
}
