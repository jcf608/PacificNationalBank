package com.pnb.ach;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * AchValidator045 — Business rule validation.
 */
@ApplicationScoped
public class AchValidator045 {

    public List<String> validate(AchDto045 dto) {
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
        if (dto.getAchField006() != null && dto.getAchField006().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("achField006 must not be negative");
        }
        if (dto.getAchField007() != null && dto.getAchField007() < 0) {
            errors.add("achField007 must not be negative");
        }
        if (dto.getAchField008() != null && dto.getAchField008().isBlank()) {
            errors.add("achField008 must not be blank if provided");
        }
        if (dto.getAchField012() != null && dto.getAchField012() < 0) {
            errors.add("achField012 must not be negative");
        }
        if (dto.getAchField014() != null && dto.getAchField014() < 0) {
            errors.add("achField014 must not be negative");
        }
        if (dto.getAchField015() != null && dto.getAchField015().isBlank()) {
            errors.add("achField015 must not be blank if provided");
        }
        return errors;
    }
}
