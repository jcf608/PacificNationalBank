package com.pnb.stop;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * StopValidator022 — Business rule validation.
 */
@ApplicationScoped
public class StopValidator022 {

    public List<String> validate(StopDto022 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("stop DTO must not be null");
            return errors;
        }
        if (dto.getStopField000() != null && dto.getStopField000().isBlank()) {
            errors.add("stopField000 must not be blank if provided");
        }
        if (dto.getStopField001() != null && dto.getStopField001().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("stopField001 must not be negative");
        }
        if (dto.getStopField004() != null && dto.getStopField004().isBlank()) {
            errors.add("stopField004 must not be blank if provided");
        }
        if (dto.getStopField005() != null && dto.getStopField005().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("stopField005 must not be negative");
        }
        if (dto.getStopField010() != null && dto.getStopField010().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("stopField010 must not be negative");
        }
        if (dto.getStopField013() != null && dto.getStopField013().isBlank()) {
            errors.add("stopField013 must not be blank if provided");
        }
        if (dto.getStopField015() != null && dto.getStopField015().isBlank()) {
            errors.add("stopField015 must not be blank if provided");
        }
        if (dto.getStopField017() != null && dto.getStopField017().isBlank()) {
            errors.add("stopField017 must not be blank if provided");
        }
        return errors;
    }
}
