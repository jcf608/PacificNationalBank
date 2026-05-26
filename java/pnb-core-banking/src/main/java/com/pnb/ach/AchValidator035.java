package com.pnb.ach;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * AchValidator035 — Business rule validation.
 */
@ApplicationScoped
public class AchValidator035 {

    public List<String> validate(AchDto035 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("ach DTO must not be null");
            return errors;
        }
        if (dto.getAchField000() != null && dto.getAchField000().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("achField000 must not be negative");
        }
        if (dto.getAchField001() != null && dto.getAchField001().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("achField001 must not be negative");
        }
        if (dto.getAchField002() != null && dto.getAchField002().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("achField002 must not be negative");
        }
        if (dto.getAchField003() != null && dto.getAchField003().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("achField003 must not be negative");
        }
        if (dto.getAchField004() != null && dto.getAchField004() < 0) {
            errors.add("achField004 must not be negative");
        }
        if (dto.getAchField006() != null && dto.getAchField006().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("achField006 must not be negative");
        }
        if (dto.getAchField009() != null && dto.getAchField009().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("achField009 must not be negative");
        }
        if (dto.getAchField011() != null && dto.getAchField011() < 0) {
            errors.add("achField011 must not be negative");
        }
        if (dto.getAchField013() != null && dto.getAchField013().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("achField013 must not be negative");
        }
        if (dto.getAchField015() != null && dto.getAchField015().isBlank()) {
            errors.add("achField015 must not be blank if provided");
        }
        if (dto.getAchField017() != null && dto.getAchField017() < 0) {
            errors.add("achField017 must not be negative");
        }
        return errors;
    }
}
