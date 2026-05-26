package com.pnb.hold;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * HoldValidator052 — Business rule validation.
 */
@ApplicationScoped
public class HoldValidator052 {

    public List<String> validate(HoldDto052 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("hold DTO must not be null");
            return errors;
        }
        if (dto.getHoldField002() != null && dto.getHoldField002() < 0) {
            errors.add("holdField002 must not be negative");
        }
        if (dto.getHoldField003() != null && dto.getHoldField003() < 0) {
            errors.add("holdField003 must not be negative");
        }
        if (dto.getHoldField004() != null && dto.getHoldField004() < 0) {
            errors.add("holdField004 must not be negative");
        }
        if (dto.getHoldField008() != null && dto.getHoldField008().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("holdField008 must not be negative");
        }
        return errors;
    }
}
