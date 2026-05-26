package com.pnb.ach;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * AchValidator040 — Business rule validation.
 */
@ApplicationScoped
public class AchValidator040 {

    public List<String> validate(AchDto040 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("ach DTO must not be null");
            return errors;
        }
        if (dto.getAchField001() != null && dto.getAchField001() < 0) {
            errors.add("achField001 must not be negative");
        }
        if (dto.getAchField003() != null && dto.getAchField003() < 0) {
            errors.add("achField003 must not be negative");
        }
        if (dto.getAchField004() != null && dto.getAchField004() < 0) {
            errors.add("achField004 must not be negative");
        }
        if (dto.getAchField005() != null && dto.getAchField005() < 0) {
            errors.add("achField005 must not be negative");
        }
        if (dto.getAchField007() != null && dto.getAchField007() < 0) {
            errors.add("achField007 must not be negative");
        }
        if (dto.getAchField009() != null && dto.getAchField009() < 0) {
            errors.add("achField009 must not be negative");
        }
        return errors;
    }
}
