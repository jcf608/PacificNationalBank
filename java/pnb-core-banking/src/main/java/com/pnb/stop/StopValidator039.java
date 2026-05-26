package com.pnb.stop;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * StopValidator039 — Business rule validation.
 */
@ApplicationScoped
public class StopValidator039 {

    public List<String> validate(StopDto039 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("stop DTO must not be null");
            return errors;
        }
        if (dto.getStopField002() != null && dto.getStopField002().isBlank()) {
            errors.add("stopField002 must not be blank if provided");
        }
        if (dto.getStopField005() != null && dto.getStopField005() < 0) {
            errors.add("stopField005 must not be negative");
        }
        if (dto.getStopField008() != null && dto.getStopField008().isBlank()) {
            errors.add("stopField008 must not be blank if provided");
        }
        if (dto.getStopField009() != null && dto.getStopField009().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("stopField009 must not be negative");
        }
        if (dto.getStopField010() != null && dto.getStopField010().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("stopField010 must not be negative");
        }
        return errors;
    }
}
