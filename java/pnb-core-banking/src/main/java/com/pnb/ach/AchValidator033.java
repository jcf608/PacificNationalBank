package com.pnb.ach;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * AchValidator033 — Business rule validation.
 */
@ApplicationScoped
public class AchValidator033 {

    public List<String> validate(AchDto033 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("ach DTO must not be null");
            return errors;
        }
        if (dto.getAchField001() != null && dto.getAchField001().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("achField001 must not be negative");
        }
        if (dto.getAchField002() != null && dto.getAchField002().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("achField002 must not be negative");
        }
        if (dto.getAchField003() != null && dto.getAchField003() < 0) {
            errors.add("achField003 must not be negative");
        }
        if (dto.getAchField004() != null && dto.getAchField004().isBlank()) {
            errors.add("achField004 must not be blank if provided");
        }
        if (dto.getAchField006() != null && dto.getAchField006() < 0) {
            errors.add("achField006 must not be negative");
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
        if (dto.getAchField012() != null && dto.getAchField012() < 0) {
            errors.add("achField012 must not be negative");
        }
        if (dto.getAchField013() != null && dto.getAchField013().isBlank()) {
            errors.add("achField013 must not be blank if provided");
        }
        if (dto.getAchField015() != null && dto.getAchField015().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("achField015 must not be negative");
        }
        return errors;
    }
}
