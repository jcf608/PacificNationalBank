package com.pnb.stop;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * StopValidator023 — Business rule validation.
 */
@ApplicationScoped
public class StopValidator023 {

    public List<String> validate(StopDto023 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("stop DTO must not be null");
            return errors;
        }
        if (dto.getStopField000() != null && dto.getStopField000().isBlank()) {
            errors.add("stopField000 must not be blank if provided");
        }
        if (dto.getStopField002() != null && dto.getStopField002() < 0) {
            errors.add("stopField002 must not be negative");
        }
        if (dto.getStopField003() != null && dto.getStopField003().isBlank()) {
            errors.add("stopField003 must not be blank if provided");
        }
        if (dto.getStopField005() != null && dto.getStopField005() < 0) {
            errors.add("stopField005 must not be negative");
        }
        if (dto.getStopField008() != null && dto.getStopField008().isBlank()) {
            errors.add("stopField008 must not be blank if provided");
        }
        if (dto.getStopField011() != null && dto.getStopField011().isBlank()) {
            errors.add("stopField011 must not be blank if provided");
        }
        if (dto.getStopField015() != null && dto.getStopField015().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("stopField015 must not be negative");
        }
        return errors;
    }
}
