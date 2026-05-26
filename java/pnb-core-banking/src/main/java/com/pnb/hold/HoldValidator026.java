package com.pnb.hold;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * HoldValidator026 — Business rule validation.
 */
@ApplicationScoped
public class HoldValidator026 {

    public List<String> validate(HoldDto026 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("hold DTO must not be null");
            return errors;
        }
        if (dto.getHoldField000() != null && dto.getHoldField000().isBlank()) {
            errors.add("holdField000 must not be blank if provided");
        }
        if (dto.getHoldField002() != null && dto.getHoldField002().isBlank()) {
            errors.add("holdField002 must not be blank if provided");
        }
        if (dto.getHoldField004() != null && dto.getHoldField004() < 0) {
            errors.add("holdField004 must not be negative");
        }
        return errors;
    }
}
