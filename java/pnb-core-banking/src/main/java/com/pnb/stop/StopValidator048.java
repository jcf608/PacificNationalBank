package com.pnb.stop;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * StopValidator048 — Business rule validation.
 */
@ApplicationScoped
public class StopValidator048 {

    public List<String> validate(StopDto048 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("stop DTO must not be null");
            return errors;
        }
        if (dto.getStopField002() != null && dto.getStopField002() < 0) {
            errors.add("stopField002 must not be negative");
        }
        if (dto.getStopField007() != null && dto.getStopField007().isBlank()) {
            errors.add("stopField007 must not be blank if provided");
        }
        return errors;
    }
}
