package com.pnb.stop;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * StopValidator034 — Business rule validation.
 */
@ApplicationScoped
public class StopValidator034 {

    public List<String> validate(StopDto034 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("stop DTO must not be null");
            return errors;
        }
        if (dto.getStopField000() != null && dto.getStopField000().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("stopField000 must not be negative");
        }
        if (dto.getStopField005() != null && dto.getStopField005().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("stopField005 must not be negative");
        }
        if (dto.getStopField010() != null && dto.getStopField010().isBlank()) {
            errors.add("stopField010 must not be blank if provided");
        }
        if (dto.getStopField011() != null && dto.getStopField011() < 0) {
            errors.add("stopField011 must not be negative");
        }
        if (dto.getStopField013() != null && dto.getStopField013().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("stopField013 must not be negative");
        }
        if (dto.getStopField014() != null && dto.getStopField014().isBlank()) {
            errors.add("stopField014 must not be blank if provided");
        }
        if (dto.getStopField015() != null && dto.getStopField015().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("stopField015 must not be negative");
        }
        return errors;
    }
}
