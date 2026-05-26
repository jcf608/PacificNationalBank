package com.pnb.stop;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * StopValidator046 — Business rule validation.
 */
@ApplicationScoped
public class StopValidator046 {

    public List<String> validate(StopDto046 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("stop DTO must not be null");
            return errors;
        }
        if (dto.getStopField000() != null && dto.getStopField000() < 0) {
            errors.add("stopField000 must not be negative");
        }
        if (dto.getStopField005() != null && dto.getStopField005().isBlank()) {
            errors.add("stopField005 must not be blank if provided");
        }
        if (dto.getStopField007() != null && dto.getStopField007().isBlank()) {
            errors.add("stopField007 must not be blank if provided");
        }
        if (dto.getStopField008() != null && dto.getStopField008() < 0) {
            errors.add("stopField008 must not be negative");
        }
        if (dto.getStopField009() != null && dto.getStopField009().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("stopField009 must not be negative");
        }
        if (dto.getStopField010() != null && dto.getStopField010().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("stopField010 must not be negative");
        }
        if (dto.getStopField013() != null && dto.getStopField013().isBlank()) {
            errors.add("stopField013 must not be blank if provided");
        }
        if (dto.getStopField017() != null && dto.getStopField017() < 0) {
            errors.add("stopField017 must not be negative");
        }
        return errors;
    }
}
