package com.pnb.stop;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * StopValidator033 — Business rule validation.
 */
@ApplicationScoped
public class StopValidator033 {

    public List<String> validate(StopDto033 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("stop DTO must not be null");
            return errors;
        }
        if (dto.getStopField000() != null && dto.getStopField000().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("stopField000 must not be negative");
        }
        if (dto.getStopField001() != null && dto.getStopField001() < 0) {
            errors.add("stopField001 must not be negative");
        }
        return errors;
    }
}
