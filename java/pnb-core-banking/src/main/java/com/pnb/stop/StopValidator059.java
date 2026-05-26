package com.pnb.stop;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * StopValidator059 — Business rule validation.
 */
@ApplicationScoped
public class StopValidator059 {

    public List<String> validate(StopDto059 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("stop DTO must not be null");
            return errors;
        }
        if (dto.getStopField001() != null && dto.getStopField001().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("stopField001 must not be negative");
        }
        if (dto.getStopField008() != null && dto.getStopField008() < 0) {
            errors.add("stopField008 must not be negative");
        }
        if (dto.getStopField009() != null && dto.getStopField009().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("stopField009 must not be negative");
        }
        if (dto.getStopField010() != null && dto.getStopField010() < 0) {
            errors.add("stopField010 must not be negative");
        }
        if (dto.getStopField013() != null && dto.getStopField013().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("stopField013 must not be negative");
        }
        if (dto.getStopField014() != null && dto.getStopField014().isBlank()) {
            errors.add("stopField014 must not be blank if provided");
        }
        if (dto.getStopField016() != null && dto.getStopField016().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("stopField016 must not be negative");
        }
        return errors;
    }
}
