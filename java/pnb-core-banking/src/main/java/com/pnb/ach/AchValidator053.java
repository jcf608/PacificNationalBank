package com.pnb.ach;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * AchValidator053 — Business rule validation.
 */
@ApplicationScoped
public class AchValidator053 {

    public List<String> validate(AchDto053 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("ach DTO must not be null");
            return errors;
        }
        if (dto.getAchField000() != null && dto.getAchField000().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("achField000 must not be negative");
        }
        if (dto.getAchField001() != null && dto.getAchField001() < 0) {
            errors.add("achField001 must not be negative");
        }
        if (dto.getAchField005() != null && dto.getAchField005() < 0) {
            errors.add("achField005 must not be negative");
        }
        if (dto.getAchField009() != null && dto.getAchField009().isBlank()) {
            errors.add("achField009 must not be blank if provided");
        }
        if (dto.getAchField011() != null && dto.getAchField011().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("achField011 must not be negative");
        }
        return errors;
    }
}
