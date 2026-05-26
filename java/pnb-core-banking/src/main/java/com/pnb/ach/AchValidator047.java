package com.pnb.ach;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * AchValidator047 — Business rule validation.
 */
@ApplicationScoped
public class AchValidator047 {

    public List<String> validate(AchDto047 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("ach DTO must not be null");
            return errors;
        }
        if (dto.getAchField003() != null && dto.getAchField003() < 0) {
            errors.add("achField003 must not be negative");
        }
        if (dto.getAchField005() != null && dto.getAchField005() < 0) {
            errors.add("achField005 must not be negative");
        }
        if (dto.getAchField006() != null && dto.getAchField006().isBlank()) {
            errors.add("achField006 must not be blank if provided");
        }
        if (dto.getAchField007() != null && dto.getAchField007() < 0) {
            errors.add("achField007 must not be negative");
        }
        if (dto.getAchField008() != null && dto.getAchField008().isBlank()) {
            errors.add("achField008 must not be blank if provided");
        }
        if (dto.getAchField009() != null && dto.getAchField009().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("achField009 must not be negative");
        }
        if (dto.getAchField010() != null && dto.getAchField010().isBlank()) {
            errors.add("achField010 must not be blank if provided");
        }
        if (dto.getAchField012() != null && dto.getAchField012().isBlank()) {
            errors.add("achField012 must not be blank if provided");
        }
        if (dto.getAchField014() != null && dto.getAchField014().isBlank()) {
            errors.add("achField014 must not be blank if provided");
        }
        if (dto.getAchField015() != null && dto.getAchField015().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("achField015 must not be negative");
        }
        return errors;
    }
}
