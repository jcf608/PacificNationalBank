package com.pnb.stop;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * StopValidator040 — Business rule validation.
 */
@ApplicationScoped
public class StopValidator040 {

    public List<String> validate(StopDto040 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("stop DTO must not be null");
            return errors;
        }
        if (dto.getStopField001() != null && dto.getStopField001() < 0) {
            errors.add("stopField001 must not be negative");
        }
        if (dto.getStopField005() != null && dto.getStopField005().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("stopField005 must not be negative");
        }
        if (dto.getStopField006() != null && dto.getStopField006().isBlank()) {
            errors.add("stopField006 must not be blank if provided");
        }
        if (dto.getStopField010() != null && dto.getStopField010().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("stopField010 must not be negative");
        }
        if (dto.getStopField011() != null && dto.getStopField011().isBlank()) {
            errors.add("stopField011 must not be blank if provided");
        }
        return errors;
    }
}
