package com.pnb.ach;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * AchValidator051 — Business rule validation.
 */
@ApplicationScoped
public class AchValidator051 {

    public List<String> validate(AchDto051 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("ach DTO must not be null");
            return errors;
        }
        if (dto.getAchField001() != null && dto.getAchField001().isBlank()) {
            errors.add("achField001 must not be blank if provided");
        }
        if (dto.getAchField007() != null && dto.getAchField007().isBlank()) {
            errors.add("achField007 must not be blank if provided");
        }
        if (dto.getAchField008() != null && dto.getAchField008() < 0) {
            errors.add("achField008 must not be negative");
        }
        return errors;
    }
}
