package com.pnb.ach;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * AchValidator054 — Business rule validation.
 */
@ApplicationScoped
public class AchValidator054 {

    public List<String> validate(AchDto054 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("ach DTO must not be null");
            return errors;
        }
        if (dto.getAchField003() != null && dto.getAchField003() < 0) {
            errors.add("achField003 must not be negative");
        }
        if (dto.getAchField005() != null && dto.getAchField005().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("achField005 must not be negative");
        }
        if (dto.getAchField006() != null && dto.getAchField006().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("achField006 must not be negative");
        }
        if (dto.getAchField008() != null && dto.getAchField008().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("achField008 must not be negative");
        }
        if (dto.getAchField009() != null && dto.getAchField009().isBlank()) {
            errors.add("achField009 must not be blank if provided");
        }
        if (dto.getAchField011() != null && dto.getAchField011().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("achField011 must not be negative");
        }
        if (dto.getAchField012() != null && dto.getAchField012().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("achField012 must not be negative");
        }
        if (dto.getAchField013() != null && dto.getAchField013().isBlank()) {
            errors.add("achField013 must not be blank if provided");
        }
        return errors;
    }
}
