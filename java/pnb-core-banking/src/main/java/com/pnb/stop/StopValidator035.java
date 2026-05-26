package com.pnb.stop;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * StopValidator035 — Business rule validation.
 */
@ApplicationScoped
public class StopValidator035 {

    public List<String> validate(StopDto035 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("stop DTO must not be null");
            return errors;
        }
        if (dto.getStopField000() != null && dto.getStopField000() < 0) {
            errors.add("stopField000 must not be negative");
        }
        if (dto.getStopField002() != null && dto.getStopField002() < 0) {
            errors.add("stopField002 must not be negative");
        }
        if (dto.getStopField007() != null && dto.getStopField007().isBlank()) {
            errors.add("stopField007 must not be blank if provided");
        }
        if (dto.getStopField009() != null && dto.getStopField009().isBlank()) {
            errors.add("stopField009 must not be blank if provided");
        }
        if (dto.getStopField010() != null && dto.getStopField010().isBlank()) {
            errors.add("stopField010 must not be blank if provided");
        }
        if (dto.getStopField012() != null && dto.getStopField012().isBlank()) {
            errors.add("stopField012 must not be blank if provided");
        }
        if (dto.getStopField013() != null && dto.getStopField013() < 0) {
            errors.add("stopField013 must not be negative");
        }
        if (dto.getStopField015() != null && dto.getStopField015() < 0) {
            errors.add("stopField015 must not be negative");
        }
        if (dto.getStopField017() != null && dto.getStopField017() < 0) {
            errors.add("stopField017 must not be negative");
        }
        if (dto.getStopField018() != null && dto.getStopField018().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("stopField018 must not be negative");
        }
        return errors;
    }
}
