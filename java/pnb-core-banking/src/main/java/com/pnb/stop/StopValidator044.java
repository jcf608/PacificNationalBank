package com.pnb.stop;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * StopValidator044 — Business rule validation.
 */
@ApplicationScoped
public class StopValidator044 {

    public List<String> validate(StopDto044 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("stop DTO must not be null");
            return errors;
        }
        if (dto.getStopField000() != null && dto.getStopField000() < 0) {
            errors.add("stopField000 must not be negative");
        }
        if (dto.getStopField003() != null && dto.getStopField003() < 0) {
            errors.add("stopField003 must not be negative");
        }
        if (dto.getStopField006() != null && dto.getStopField006().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("stopField006 must not be negative");
        }
        if (dto.getStopField007() != null && dto.getStopField007() < 0) {
            errors.add("stopField007 must not be negative");
        }
        if (dto.getStopField008() != null && dto.getStopField008().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("stopField008 must not be negative");
        }
        return errors;
    }
}
