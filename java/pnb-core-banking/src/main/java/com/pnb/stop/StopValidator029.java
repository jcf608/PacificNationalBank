package com.pnb.stop;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * StopValidator029 — Business rule validation.
 */
@ApplicationScoped
public class StopValidator029 {

    public List<String> validate(StopDto029 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("stop DTO must not be null");
            return errors;
        }
        if (dto.getStopField003() != null && dto.getStopField003().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("stopField003 must not be negative");
        }
        if (dto.getStopField007() != null && dto.getStopField007() < 0) {
            errors.add("stopField007 must not be negative");
        }
        if (dto.getStopField008() != null && dto.getStopField008() < 0) {
            errors.add("stopField008 must not be negative");
        }
        if (dto.getStopField011() != null && dto.getStopField011().isBlank()) {
            errors.add("stopField011 must not be blank if provided");
        }
        if (dto.getStopField012() != null && dto.getStopField012().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("stopField012 must not be negative");
        }
        return errors;
    }
}
