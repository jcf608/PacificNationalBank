package com.pnb.stop;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * StopValidator021 — Business rule validation.
 */
@ApplicationScoped
public class StopValidator021 {

    public List<String> validate(StopDto021 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("stop DTO must not be null");
            return errors;
        }
        if (dto.getStopField007() != null && dto.getStopField007().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("stopField007 must not be negative");
        }
        if (dto.getStopField008() != null && dto.getStopField008().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("stopField008 must not be negative");
        }
        if (dto.getStopField010() != null && dto.getStopField010() < 0) {
            errors.add("stopField010 must not be negative");
        }
        if (dto.getStopField012() != null && dto.getStopField012().isBlank()) {
            errors.add("stopField012 must not be blank if provided");
        }
        if (dto.getStopField014() != null && dto.getStopField014() < 0) {
            errors.add("stopField014 must not be negative");
        }
        if (dto.getStopField016() != null && dto.getStopField016().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("stopField016 must not be negative");
        }
        return errors;
    }
}
