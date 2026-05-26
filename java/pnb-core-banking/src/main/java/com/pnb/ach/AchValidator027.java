package com.pnb.ach;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * AchValidator027 — Business rule validation.
 */
@ApplicationScoped
public class AchValidator027 {

    public List<String> validate(AchDto027 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("ach DTO must not be null");
            return errors;
        }
        if (dto.getAchField001() != null && dto.getAchField001() < 0) {
            errors.add("achField001 must not be negative");
        }
        if (dto.getAchField002() != null && dto.getAchField002().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("achField002 must not be negative");
        }
        if (dto.getAchField005() != null && dto.getAchField005().isBlank()) {
            errors.add("achField005 must not be blank if provided");
        }
        if (dto.getAchField007() != null && dto.getAchField007().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("achField007 must not be negative");
        }
        if (dto.getAchField010() != null && dto.getAchField010().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("achField010 must not be negative");
        }
        return errors;
    }
}
