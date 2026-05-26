package com.pnb.hold;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * HoldValidator037 — Business rule validation.
 */
@ApplicationScoped
public class HoldValidator037 {

    public List<String> validate(HoldDto037 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("hold DTO must not be null");
            return errors;
        }
        if (dto.getHoldField004() != null && dto.getHoldField004() < 0) {
            errors.add("holdField004 must not be negative");
        }
        if (dto.getHoldField006() != null && dto.getHoldField006() < 0) {
            errors.add("holdField006 must not be negative");
        }
        if (dto.getHoldField007() != null && dto.getHoldField007().isBlank()) {
            errors.add("holdField007 must not be blank if provided");
        }
        return errors;
    }
}
