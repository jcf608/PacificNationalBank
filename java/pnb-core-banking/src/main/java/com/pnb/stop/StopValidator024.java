package com.pnb.stop;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * StopValidator024 — Business rule validation.
 */
@ApplicationScoped
public class StopValidator024 {

    public List<String> validate(StopDto024 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("stop DTO must not be null");
            return errors;
        }
        if (dto.getStopField000() != null && dto.getStopField000().isBlank()) {
            errors.add("stopField000 must not be blank if provided");
        }
        if (dto.getStopField001() != null && dto.getStopField001().isBlank()) {
            errors.add("stopField001 must not be blank if provided");
        }
        if (dto.getStopField005() != null && dto.getStopField005().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("stopField005 must not be negative");
        }
        if (dto.getStopField006() != null && dto.getStopField006() < 0) {
            errors.add("stopField006 must not be negative");
        }
        return errors;
    }
}
