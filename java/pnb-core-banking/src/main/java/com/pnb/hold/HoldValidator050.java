package com.pnb.hold;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * HoldValidator050 — Business rule validation.
 */
@ApplicationScoped
public class HoldValidator050 {

    public List<String> validate(HoldDto050 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("hold DTO must not be null");
            return errors;
        }
        if (dto.getHoldField002() != null && dto.getHoldField002().isBlank()) {
            errors.add("holdField002 must not be blank if provided");
        }
        if (dto.getHoldField004() != null && dto.getHoldField004().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("holdField004 must not be negative");
        }
        if (dto.getHoldField005() != null && dto.getHoldField005() < 0) {
            errors.add("holdField005 must not be negative");
        }
        if (dto.getHoldField007() != null && dto.getHoldField007() < 0) {
            errors.add("holdField007 must not be negative");
        }
        return errors;
    }
}
