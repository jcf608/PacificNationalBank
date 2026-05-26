package com.pnb.stop;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * StopValidator028 — Business rule validation.
 */
@ApplicationScoped
public class StopValidator028 {

    public List<String> validate(StopDto028 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("stop DTO must not be null");
            return errors;
        }
        if (dto.getStopField001() != null && dto.getStopField001() < 0) {
            errors.add("stopField001 must not be negative");
        }
        if (dto.getStopField002() != null && dto.getStopField002().isBlank()) {
            errors.add("stopField002 must not be blank if provided");
        }
        if (dto.getStopField009() != null && dto.getStopField009().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("stopField009 must not be negative");
        }
        return errors;
    }
}
