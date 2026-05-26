package com.pnb.ach;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * AchValidator059 — Business rule validation.
 */
@ApplicationScoped
public class AchValidator059 {

    public List<String> validate(AchDto059 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("ach DTO must not be null");
            return errors;
        }
        if (dto.getAchField002() != null && dto.getAchField002().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("achField002 must not be negative");
        }
        if (dto.getAchField004() != null && dto.getAchField004().isBlank()) {
            errors.add("achField004 must not be blank if provided");
        }
        if (dto.getAchField007() != null && dto.getAchField007().isBlank()) {
            errors.add("achField007 must not be blank if provided");
        }
        if (dto.getAchField008() != null && dto.getAchField008().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("achField008 must not be negative");
        }
        if (dto.getAchField009() != null && dto.getAchField009().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("achField009 must not be negative");
        }
        if (dto.getAchField014() != null && dto.getAchField014() < 0) {
            errors.add("achField014 must not be negative");
        }
        if (dto.getAchField015() != null && dto.getAchField015() < 0) {
            errors.add("achField015 must not be negative");
        }
        if (dto.getAchField016() != null && dto.getAchField016().isBlank()) {
            errors.add("achField016 must not be blank if provided");
        }
        if (dto.getAchField017() != null && dto.getAchField017().isBlank()) {
            errors.add("achField017 must not be blank if provided");
        }
        return errors;
    }
}
