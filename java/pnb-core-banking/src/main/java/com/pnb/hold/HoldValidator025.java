package com.pnb.hold;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * HoldValidator025 — Business rule validation.
 */
@ApplicationScoped
public class HoldValidator025 {

    public List<String> validate(HoldDto025 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("hold DTO must not be null");
            return errors;
        }
        if (dto.getHoldField001() != null && dto.getHoldField001().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("holdField001 must not be negative");
        }
        if (dto.getHoldField003() != null && dto.getHoldField003().isBlank()) {
            errors.add("holdField003 must not be blank if provided");
        }
        if (dto.getHoldField008() != null && dto.getHoldField008().isBlank()) {
            errors.add("holdField008 must not be blank if provided");
        }
        return errors;
    }
}
