package com.pnb.stop;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * StopValidator032 — Business rule validation.
 */
@ApplicationScoped
public class StopValidator032 {

    public List<String> validate(StopDto032 dto) {
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
        if (dto.getStopField005() != null && dto.getStopField005().isBlank()) {
            errors.add("stopField005 must not be blank if provided");
        }
        if (dto.getStopField007() != null && dto.getStopField007().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("stopField007 must not be negative");
        }
        if (dto.getStopField010() != null && dto.getStopField010().isBlank()) {
            errors.add("stopField010 must not be blank if provided");
        }
        if (dto.getStopField012() != null && dto.getStopField012().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("stopField012 must not be negative");
        }
        if (dto.getStopField013() != null && dto.getStopField013().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("stopField013 must not be negative");
        }
        if (dto.getStopField014() != null && dto.getStopField014().isBlank()) {
            errors.add("stopField014 must not be blank if provided");
        }
        return errors;
    }
}
