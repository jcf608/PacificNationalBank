package com.pnb.ach;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * AchValidator046 — Business rule validation.
 */
@ApplicationScoped
public class AchValidator046 {

    public List<String> validate(AchDto046 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("ach DTO must not be null");
            return errors;
        }
        if (dto.getAchField000() != null && dto.getAchField000() < 0) {
            errors.add("achField000 must not be negative");
        }
        if (dto.getAchField001() != null && dto.getAchField001() < 0) {
            errors.add("achField001 must not be negative");
        }
        if (dto.getAchField005() != null && dto.getAchField005() < 0) {
            errors.add("achField005 must not be negative");
        }
        if (dto.getAchField009() != null && dto.getAchField009() < 0) {
            errors.add("achField009 must not be negative");
        }
        if (dto.getAchField013() != null && dto.getAchField013().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("achField013 must not be negative");
        }
        if (dto.getAchField015() != null && dto.getAchField015().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("achField015 must not be negative");
        }
        if (dto.getAchField016() != null && dto.getAchField016().isBlank()) {
            errors.add("achField016 must not be blank if provided");
        }
        return errors;
    }
}
