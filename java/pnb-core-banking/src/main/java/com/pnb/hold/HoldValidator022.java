package com.pnb.hold;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * HoldValidator022 — Business rule validation.
 */
@ApplicationScoped
public class HoldValidator022 {

    public List<String> validate(HoldDto022 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("hold DTO must not be null");
            return errors;
        }
        if (dto.getHoldField000() != null && dto.getHoldField000() < 0) {
            errors.add("holdField000 must not be negative");
        }
        if (dto.getHoldField002() != null && dto.getHoldField002().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("holdField002 must not be negative");
        }
        if (dto.getHoldField004() != null && dto.getHoldField004() < 0) {
            errors.add("holdField004 must not be negative");
        }
        if (dto.getHoldField007() != null && dto.getHoldField007() < 0) {
            errors.add("holdField007 must not be negative");
        }
        if (dto.getHoldField008() != null && dto.getHoldField008() < 0) {
            errors.add("holdField008 must not be negative");
        }
        if (dto.getHoldField012() != null && dto.getHoldField012().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("holdField012 must not be negative");
        }
        if (dto.getHoldField014() != null && dto.getHoldField014().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("holdField014 must not be negative");
        }
        if (dto.getHoldField015() != null && dto.getHoldField015() < 0) {
            errors.add("holdField015 must not be negative");
        }
        if (dto.getHoldField017() != null && dto.getHoldField017() < 0) {
            errors.add("holdField017 must not be negative");
        }
        return errors;
    }
}
