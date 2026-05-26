package com.pnb.stop;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * StopValidator056 — Business rule validation.
 */
@ApplicationScoped
public class StopValidator056 {

    public List<String> validate(StopDto056 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("stop DTO must not be null");
            return errors;
        }
        if (dto.getStopField001() != null && dto.getStopField001().isBlank()) {
            errors.add("stopField001 must not be blank if provided");
        }
        if (dto.getStopField003() != null && dto.getStopField003().isBlank()) {
            errors.add("stopField003 must not be blank if provided");
        }
        if (dto.getStopField004() != null && dto.getStopField004().isBlank()) {
            errors.add("stopField004 must not be blank if provided");
        }
        if (dto.getStopField006() != null && dto.getStopField006().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("stopField006 must not be negative");
        }
        if (dto.getStopField007() != null && dto.getStopField007() < 0) {
            errors.add("stopField007 must not be negative");
        }
        if (dto.getStopField008() != null && dto.getStopField008().isBlank()) {
            errors.add("stopField008 must not be blank if provided");
        }
        if (dto.getStopField009() != null && dto.getStopField009() < 0) {
            errors.add("stopField009 must not be negative");
        }
        if (dto.getStopField011() != null && dto.getStopField011() < 0) {
            errors.add("stopField011 must not be negative");
        }
        if (dto.getStopField012() != null && dto.getStopField012() < 0) {
            errors.add("stopField012 must not be negative");
        }
        if (dto.getStopField015() != null && dto.getStopField015() < 0) {
            errors.add("stopField015 must not be negative");
        }
        return errors;
    }
}
