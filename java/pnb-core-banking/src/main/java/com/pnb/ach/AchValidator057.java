package com.pnb.ach;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * AchValidator057 — Business rule validation.
 */
@ApplicationScoped
public class AchValidator057 {

    public List<String> validate(AchDto057 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("ach DTO must not be null");
            return errors;
        }
        if (dto.getAchField002() != null && dto.getAchField002() < 0) {
            errors.add("achField002 must not be negative");
        }
        if (dto.getAchField003() != null && dto.getAchField003().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("achField003 must not be negative");
        }
        if (dto.getAchField004() != null && dto.getAchField004() < 0) {
            errors.add("achField004 must not be negative");
        }
        if (dto.getAchField005() != null && dto.getAchField005().isBlank()) {
            errors.add("achField005 must not be blank if provided");
        }
        if (dto.getAchField008() != null && dto.getAchField008().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("achField008 must not be negative");
        }
        if (dto.getAchField013() != null && dto.getAchField013().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("achField013 must not be negative");
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
