package com.pnb.stop;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * StopValidator020 — Business rule validation.
 */
@ApplicationScoped
public class StopValidator020 {

    public List<String> validate(StopDto020 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("stop DTO must not be null");
            return errors;
        }
        if (dto.getStopField001() != null && dto.getStopField001().isBlank()) {
            errors.add("stopField001 must not be blank if provided");
        }
        if (dto.getStopField002() != null && dto.getStopField002() < 0) {
            errors.add("stopField002 must not be negative");
        }
        if (dto.getStopField008() != null && dto.getStopField008() < 0) {
            errors.add("stopField008 must not be negative");
        }
        if (dto.getStopField009() != null && dto.getStopField009() < 0) {
            errors.add("stopField009 must not be negative");
        }
        if (dto.getStopField010() != null && dto.getStopField010() < 0) {
            errors.add("stopField010 must not be negative");
        }
        if (dto.getStopField011() != null && dto.getStopField011() < 0) {
            errors.add("stopField011 must not be negative");
        }
        return errors;
    }
}
