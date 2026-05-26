package com.pnb.stop;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * StopValidator058 — Business rule validation.
 */
@ApplicationScoped
public class StopValidator058 {

    public List<String> validate(StopDto058 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("stop DTO must not be null");
            return errors;
        }
        if (dto.getStopField000() != null && dto.getStopField000().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("stopField000 must not be negative");
        }
        if (dto.getStopField004() != null && dto.getStopField004() < 0) {
            errors.add("stopField004 must not be negative");
        }
        if (dto.getStopField005() != null && dto.getStopField005().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("stopField005 must not be negative");
        }
        if (dto.getStopField006() != null && dto.getStopField006() < 0) {
            errors.add("stopField006 must not be negative");
        }
        if (dto.getStopField007() != null && dto.getStopField007().isBlank()) {
            errors.add("stopField007 must not be blank if provided");
        }
        if (dto.getStopField010() != null && dto.getStopField010() < 0) {
            errors.add("stopField010 must not be negative");
        }
        if (dto.getStopField012() != null && dto.getStopField012().isBlank()) {
            errors.add("stopField012 must not be blank if provided");
        }
        if (dto.getStopField017() != null && dto.getStopField017().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("stopField017 must not be negative");
        }
        return errors;
    }
}
