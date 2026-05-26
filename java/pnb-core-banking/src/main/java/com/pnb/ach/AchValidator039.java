package com.pnb.ach;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * AchValidator039 — Business rule validation.
 */
@ApplicationScoped
public class AchValidator039 {

    public List<String> validate(AchDto039 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("ach DTO must not be null");
            return errors;
        }
        if (dto.getAchField003() != null && dto.getAchField003() < 0) {
            errors.add("achField003 must not be negative");
        }
        if (dto.getAchField004() != null && dto.getAchField004().isBlank()) {
            errors.add("achField004 must not be blank if provided");
        }
        if (dto.getAchField005() != null && dto.getAchField005().isBlank()) {
            errors.add("achField005 must not be blank if provided");
        }
        if (dto.getAchField006() != null && dto.getAchField006() < 0) {
            errors.add("achField006 must not be negative");
        }
        if (dto.getAchField009() != null && dto.getAchField009().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("achField009 must not be negative");
        }
        return errors;
    }
}
