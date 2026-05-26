package com.pnb.stop;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * StopValidator047 — Business rule validation.
 */
@ApplicationScoped
public class StopValidator047 {

    public List<String> validate(StopDto047 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("stop DTO must not be null");
            return errors;
        }
        if (dto.getStopField003() != null && dto.getStopField003().isBlank()) {
            errors.add("stopField003 must not be blank if provided");
        }
        if (dto.getStopField004() != null && dto.getStopField004().isBlank()) {
            errors.add("stopField004 must not be blank if provided");
        }
        if (dto.getStopField006() != null && dto.getStopField006().isBlank()) {
            errors.add("stopField006 must not be blank if provided");
        }
        if (dto.getStopField007() != null && dto.getStopField007().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("stopField007 must not be negative");
        }
        if (dto.getStopField008() != null && dto.getStopField008() < 0) {
            errors.add("stopField008 must not be negative");
        }
        if (dto.getStopField009() != null && dto.getStopField009().isBlank()) {
            errors.add("stopField009 must not be blank if provided");
        }
        if (dto.getStopField012() != null && dto.getStopField012() < 0) {
            errors.add("stopField012 must not be negative");
        }
        if (dto.getStopField016() != null && dto.getStopField016().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("stopField016 must not be negative");
        }
        if (dto.getStopField017() != null && dto.getStopField017().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("stopField017 must not be negative");
        }
        if (dto.getStopField018() != null && dto.getStopField018() < 0) {
            errors.add("stopField018 must not be negative");
        }
        return errors;
    }
}
