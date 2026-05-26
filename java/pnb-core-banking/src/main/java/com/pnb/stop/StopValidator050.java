package com.pnb.stop;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * StopValidator050 — Business rule validation.
 */
@ApplicationScoped
public class StopValidator050 {

    public List<String> validate(StopDto050 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("stop DTO must not be null");
            return errors;
        }
        if (dto.getStopField000() != null && dto.getStopField000() < 0) {
            errors.add("stopField000 must not be negative");
        }
        if (dto.getStopField001() != null && dto.getStopField001() < 0) {
            errors.add("stopField001 must not be negative");
        }
        if (dto.getStopField003() != null && dto.getStopField003().isBlank()) {
            errors.add("stopField003 must not be blank if provided");
        }
        if (dto.getStopField005() != null && dto.getStopField005() < 0) {
            errors.add("stopField005 must not be negative");
        }
        if (dto.getStopField007() != null && dto.getStopField007().isBlank()) {
            errors.add("stopField007 must not be blank if provided");
        }
        if (dto.getStopField008() != null && dto.getStopField008().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("stopField008 must not be negative");
        }
        if (dto.getStopField009() != null && dto.getStopField009().isBlank()) {
            errors.add("stopField009 must not be blank if provided");
        }
        return errors;
    }
}
