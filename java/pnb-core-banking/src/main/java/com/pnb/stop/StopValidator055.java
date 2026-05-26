package com.pnb.stop;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * StopValidator055 — Business rule validation.
 */
@ApplicationScoped
public class StopValidator055 {

    public List<String> validate(StopDto055 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("stop DTO must not be null");
            return errors;
        }
        if (dto.getStopField007() != null && dto.getStopField007() < 0) {
            errors.add("stopField007 must not be negative");
        }
        return errors;
    }
}
