package com.pnb.stop;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * StopValidator053 — Business rule validation.
 */
@ApplicationScoped
public class StopValidator053 {

    public List<String> validate(StopDto053 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("stop DTO must not be null");
            return errors;
        }
        if (dto.getStopField001() != null && dto.getStopField001().isBlank()) {
            errors.add("stopField001 must not be blank if provided");
        }
        if (dto.getStopField003() != null && dto.getStopField003().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("stopField003 must not be negative");
        }
        if (dto.getStopField006() != null && dto.getStopField006().isBlank()) {
            errors.add("stopField006 must not be blank if provided");
        }
        if (dto.getStopField008() != null && dto.getStopField008() < 0) {
            errors.add("stopField008 must not be negative");
        }
        return errors;
    }
}
