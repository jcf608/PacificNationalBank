package com.pnb.stop;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * StopValidator031 — Business rule validation.
 */
@ApplicationScoped
public class StopValidator031 {

    public List<String> validate(StopDto031 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("stop DTO must not be null");
            return errors;
        }
        if (dto.getStopField000() != null && dto.getStopField000().isBlank()) {
            errors.add("stopField000 must not be blank if provided");
        }
        if (dto.getStopField007() != null && dto.getStopField007().isBlank()) {
            errors.add("stopField007 must not be blank if provided");
        }
        if (dto.getStopField011() != null && dto.getStopField011() < 0) {
            errors.add("stopField011 must not be negative");
        }
        if (dto.getStopField014() != null && dto.getStopField014().isBlank()) {
            errors.add("stopField014 must not be blank if provided");
        }
        return errors;
    }
}
