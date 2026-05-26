package com.pnb.stop;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * StopValidator042 — Business rule validation.
 */
@ApplicationScoped
public class StopValidator042 {

    public List<String> validate(StopDto042 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("stop DTO must not be null");
            return errors;
        }
        if (dto.getStopField000() != null && dto.getStopField000().isBlank()) {
            errors.add("stopField000 must not be blank if provided");
        }
        if (dto.getStopField001() != null && dto.getStopField001().isBlank()) {
            errors.add("stopField001 must not be blank if provided");
        }
        if (dto.getStopField002() != null && dto.getStopField002().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("stopField002 must not be negative");
        }
        if (dto.getStopField004() != null && dto.getStopField004().isBlank()) {
            errors.add("stopField004 must not be blank if provided");
        }
        if (dto.getStopField008() != null && dto.getStopField008().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("stopField008 must not be negative");
        }
        if (dto.getStopField009() != null && dto.getStopField009() < 0) {
            errors.add("stopField009 must not be negative");
        }
        if (dto.getStopField010() != null && dto.getStopField010().isBlank()) {
            errors.add("stopField010 must not be blank if provided");
        }
        return errors;
    }
}
