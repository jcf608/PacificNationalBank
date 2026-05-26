package com.pnb.ach;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * AchValidator052 — Business rule validation.
 */
@ApplicationScoped
public class AchValidator052 {

    public List<String> validate(AchDto052 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("ach DTO must not be null");
            return errors;
        }
        if (dto.getAchField002() != null && dto.getAchField002().isBlank()) {
            errors.add("achField002 must not be blank if provided");
        }
        if (dto.getAchField003() != null && dto.getAchField003().isBlank()) {
            errors.add("achField003 must not be blank if provided");
        }
        if (dto.getAchField005() != null && dto.getAchField005() < 0) {
            errors.add("achField005 must not be negative");
        }
        if (dto.getAchField006() != null && dto.getAchField006().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("achField006 must not be negative");
        }
        if (dto.getAchField007() != null && dto.getAchField007().isBlank()) {
            errors.add("achField007 must not be blank if provided");
        }
        if (dto.getAchField009() != null && dto.getAchField009().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("achField009 must not be negative");
        }
        if (dto.getAchField010() != null && dto.getAchField010() < 0) {
            errors.add("achField010 must not be negative");
        }
        return errors;
    }
}
