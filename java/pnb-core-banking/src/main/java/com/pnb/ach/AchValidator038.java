package com.pnb.ach;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * AchValidator038 — Business rule validation.
 */
@ApplicationScoped
public class AchValidator038 {

    public List<String> validate(AchDto038 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("ach DTO must not be null");
            return errors;
        }
        if (dto.getAchField001() != null && dto.getAchField001().isBlank()) {
            errors.add("achField001 must not be blank if provided");
        }
        if (dto.getAchField003() != null && dto.getAchField003().isBlank()) {
            errors.add("achField003 must not be blank if provided");
        }
        return errors;
    }
}
