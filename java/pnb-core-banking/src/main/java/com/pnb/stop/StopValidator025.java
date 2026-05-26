package com.pnb.stop;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * StopValidator025 — Business rule validation.
 */
@ApplicationScoped
public class StopValidator025 {

    public List<String> validate(StopDto025 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("stop DTO must not be null");
            return errors;
        }
        if (dto.getStopField000() != null && dto.getStopField000().isBlank()) {
            errors.add("stopField000 must not be blank if provided");
        }
        if (dto.getStopField003() != null && dto.getStopField003().isBlank()) {
            errors.add("stopField003 must not be blank if provided");
        }
        if (dto.getStopField004() != null && dto.getStopField004().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("stopField004 must not be negative");
        }
        if (dto.getStopField005() != null && dto.getStopField005().isBlank()) {
            errors.add("stopField005 must not be blank if provided");
        }
        if (dto.getStopField006() != null && dto.getStopField006() < 0) {
            errors.add("stopField006 must not be negative");
        }
        if (dto.getStopField008() != null && dto.getStopField008().isBlank()) {
            errors.add("stopField008 must not be blank if provided");
        }
        return errors;
    }
}
