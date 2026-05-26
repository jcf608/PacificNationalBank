package com.pnb.stop;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * StopValidator036 — Business rule validation.
 */
@ApplicationScoped
public class StopValidator036 {

    public List<String> validate(StopDto036 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("stop DTO must not be null");
            return errors;
        }
        if (dto.getStopField002() != null && dto.getStopField002().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("stopField002 must not be negative");
        }
        if (dto.getStopField004() != null && dto.getStopField004().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("stopField004 must not be negative");
        }
        if (dto.getStopField007() != null && dto.getStopField007().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("stopField007 must not be negative");
        }
        return errors;
    }
}
