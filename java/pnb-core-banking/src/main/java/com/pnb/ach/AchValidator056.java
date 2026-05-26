package com.pnb.ach;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * AchValidator056 — Business rule validation.
 */
@ApplicationScoped
public class AchValidator056 {

    public List<String> validate(AchDto056 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("ach DTO must not be null");
            return errors;
        }
        if (dto.getAchField000() != null && dto.getAchField000().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("achField000 must not be negative");
        }
        if (dto.getAchField001() != null && dto.getAchField001() < 0) {
            errors.add("achField001 must not be negative");
        }
        if (dto.getAchField005() != null && dto.getAchField005().isBlank()) {
            errors.add("achField005 must not be blank if provided");
        }
        if (dto.getAchField006() != null && dto.getAchField006().isBlank()) {
            errors.add("achField006 must not be blank if provided");
        }
        if (dto.getAchField012() != null && dto.getAchField012() < 0) {
            errors.add("achField012 must not be negative");
        }
        return errors;
    }
}
