package com.pnb.ach;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * AchValidator031 — Business rule validation.
 */
@ApplicationScoped
public class AchValidator031 {

    public List<String> validate(AchDto031 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("ach DTO must not be null");
            return errors;
        }
        if (dto.getAchField000() != null && dto.getAchField000().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("achField000 must not be negative");
        }
        if (dto.getAchField002() != null && dto.getAchField002().isBlank()) {
            errors.add("achField002 must not be blank if provided");
        }
        if (dto.getAchField006() != null && dto.getAchField006().isBlank()) {
            errors.add("achField006 must not be blank if provided");
        }
        if (dto.getAchField007() != null && dto.getAchField007().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("achField007 must not be negative");
        }
        if (dto.getAchField008() != null && dto.getAchField008().isBlank()) {
            errors.add("achField008 must not be blank if provided");
        }
        if (dto.getAchField009() != null && dto.getAchField009() < 0) {
            errors.add("achField009 must not be negative");
        }
        if (dto.getAchField010() != null && dto.getAchField010().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("achField010 must not be negative");
        }
        if (dto.getAchField012() != null && dto.getAchField012().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("achField012 must not be negative");
        }
        if (dto.getAchField013() != null && dto.getAchField013() < 0) {
            errors.add("achField013 must not be negative");
        }
        return errors;
    }
}
