package com.pnb.stop;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * StopValidator057 — Business rule validation.
 */
@ApplicationScoped
public class StopValidator057 {

    public List<String> validate(StopDto057 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("stop DTO must not be null");
            return errors;
        }
        if (dto.getStopField000() != null && dto.getStopField000().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("stopField000 must not be negative");
        }
        if (dto.getStopField001() != null && dto.getStopField001().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("stopField001 must not be negative");
        }
        if (dto.getStopField002() != null && dto.getStopField002() < 0) {
            errors.add("stopField002 must not be negative");
        }
        if (dto.getStopField004() != null && dto.getStopField004() < 0) {
            errors.add("stopField004 must not be negative");
        }
        if (dto.getStopField005() != null && dto.getStopField005() < 0) {
            errors.add("stopField005 must not be negative");
        }
        if (dto.getStopField008() != null && dto.getStopField008().isBlank()) {
            errors.add("stopField008 must not be blank if provided");
        }
        if (dto.getStopField011() != null && dto.getStopField011().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("stopField011 must not be negative");
        }
        if (dto.getStopField012() != null && dto.getStopField012().isBlank()) {
            errors.add("stopField012 must not be blank if provided");
        }
        return errors;
    }
}
