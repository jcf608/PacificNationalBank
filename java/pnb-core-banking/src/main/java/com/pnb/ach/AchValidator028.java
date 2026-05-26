package com.pnb.ach;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * AchValidator028 — Business rule validation.
 */
@ApplicationScoped
public class AchValidator028 {

    public List<String> validate(AchDto028 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("ach DTO must not be null");
            return errors;
        }
        if (dto.getAchField000() != null && dto.getAchField000().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("achField000 must not be negative");
        }
        if (dto.getAchField002() != null && dto.getAchField002() < 0) {
            errors.add("achField002 must not be negative");
        }
        if (dto.getAchField004() != null && dto.getAchField004().isBlank()) {
            errors.add("achField004 must not be blank if provided");
        }
        if (dto.getAchField005() != null && dto.getAchField005().isBlank()) {
            errors.add("achField005 must not be blank if provided");
        }
        if (dto.getAchField006() != null && dto.getAchField006().isBlank()) {
            errors.add("achField006 must not be blank if provided");
        }
        if (dto.getAchField007() != null && dto.getAchField007() < 0) {
            errors.add("achField007 must not be negative");
        }
        if (dto.getAchField008() != null && dto.getAchField008() < 0) {
            errors.add("achField008 must not be negative");
        }
        if (dto.getAchField009() != null && dto.getAchField009().isBlank()) {
            errors.add("achField009 must not be blank if provided");
        }
        if (dto.getAchField011() != null && dto.getAchField011().isBlank()) {
            errors.add("achField011 must not be blank if provided");
        }
        return errors;
    }
}
