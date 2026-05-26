package com.pnb.stop;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * StopValidator030 — Business rule validation.
 */
@ApplicationScoped
public class StopValidator030 {

    public List<String> validate(StopDto030 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("stop DTO must not be null");
            return errors;
        }
        if (dto.getStopField000() != null && dto.getStopField000().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("stopField000 must not be negative");
        }
        if (dto.getStopField001() != null && dto.getStopField001().isBlank()) {
            errors.add("stopField001 must not be blank if provided");
        }
        if (dto.getStopField002() != null && dto.getStopField002().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("stopField002 must not be negative");
        }
        if (dto.getStopField003() != null && dto.getStopField003() < 0) {
            errors.add("stopField003 must not be negative");
        }
        if (dto.getStopField009() != null && dto.getStopField009() < 0) {
            errors.add("stopField009 must not be negative");
        }
        if (dto.getStopField012() != null && dto.getStopField012().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("stopField012 must not be negative");
        }
        return errors;
    }
}
