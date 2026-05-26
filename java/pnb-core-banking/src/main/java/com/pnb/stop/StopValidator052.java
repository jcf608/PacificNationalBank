package com.pnb.stop;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * StopValidator052 — Business rule validation.
 */
@ApplicationScoped
public class StopValidator052 {

    public List<String> validate(StopDto052 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("stop DTO must not be null");
            return errors;
        }
        if (dto.getStopField002() != null && dto.getStopField002().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("stopField002 must not be negative");
        }
        if (dto.getStopField003() != null && dto.getStopField003() < 0) {
            errors.add("stopField003 must not be negative");
        }
        if (dto.getStopField010() != null && dto.getStopField010().isBlank()) {
            errors.add("stopField010 must not be blank if provided");
        }
        if (dto.getStopField011() != null && dto.getStopField011().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("stopField011 must not be negative");
        }
        return errors;
    }
}
