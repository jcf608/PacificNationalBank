package com.pnb.stop;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * StopValidator045 — Business rule validation.
 */
@ApplicationScoped
public class StopValidator045 {

    public List<String> validate(StopDto045 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("stop DTO must not be null");
            return errors;
        }
        if (dto.getStopField001() != null && dto.getStopField001().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("stopField001 must not be negative");
        }
        if (dto.getStopField002() != null && dto.getStopField002() < 0) {
            errors.add("stopField002 must not be negative");
        }
        if (dto.getStopField003() != null && dto.getStopField003().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("stopField003 must not be negative");
        }
        if (dto.getStopField014() != null && dto.getStopField014().isBlank()) {
            errors.add("stopField014 must not be blank if provided");
        }
        return errors;
    }
}
