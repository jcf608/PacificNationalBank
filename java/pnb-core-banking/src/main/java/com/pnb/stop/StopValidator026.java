package com.pnb.stop;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * StopValidator026 — Business rule validation.
 */
@ApplicationScoped
public class StopValidator026 {

    public List<String> validate(StopDto026 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("stop DTO must not be null");
            return errors;
        }
        if (dto.getStopField003() != null && dto.getStopField003() < 0) {
            errors.add("stopField003 must not be negative");
        }
        if (dto.getStopField004() != null && dto.getStopField004().isBlank()) {
            errors.add("stopField004 must not be blank if provided");
        }
        if (dto.getStopField005() != null && dto.getStopField005() < 0) {
            errors.add("stopField005 must not be negative");
        }
        if (dto.getStopField007() != null && dto.getStopField007().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("stopField007 must not be negative");
        }
        if (dto.getStopField009() != null && dto.getStopField009().isBlank()) {
            errors.add("stopField009 must not be blank if provided");
        }
        return errors;
    }
}
