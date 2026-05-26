package com.pnb.stop;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * StopValidator037 — Business rule validation.
 */
@ApplicationScoped
public class StopValidator037 {

    public List<String> validate(StopDto037 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("stop DTO must not be null");
            return errors;
        }
        if (dto.getStopField006() != null && dto.getStopField006().isBlank()) {
            errors.add("stopField006 must not be blank if provided");
        }
        return errors;
    }
}
