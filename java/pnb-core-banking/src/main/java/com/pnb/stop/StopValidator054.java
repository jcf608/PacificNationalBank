package com.pnb.stop;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * StopValidator054 — Business rule validation.
 */
@ApplicationScoped
public class StopValidator054 {

    public List<String> validate(StopDto054 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("stop DTO must not be null");
            return errors;
        }
        if (dto.getStopField001() != null && dto.getStopField001().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("stopField001 must not be negative");
        }
        if (dto.getStopField002() != null && dto.getStopField002().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("stopField002 must not be negative");
        }
        if (dto.getStopField003() != null && dto.getStopField003().isBlank()) {
            errors.add("stopField003 must not be blank if provided");
        }
        if (dto.getStopField004() != null && dto.getStopField004().isBlank()) {
            errors.add("stopField004 must not be blank if provided");
        }
        if (dto.getStopField006() != null && dto.getStopField006().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("stopField006 must not be negative");
        }
        if (dto.getStopField009() != null && dto.getStopField009() < 0) {
            errors.add("stopField009 must not be negative");
        }
        if (dto.getStopField010() != null && dto.getStopField010().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("stopField010 must not be negative");
        }
        if (dto.getStopField011() != null && dto.getStopField011().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("stopField011 must not be negative");
        }
        if (dto.getStopField013() != null && dto.getStopField013().isBlank()) {
            errors.add("stopField013 must not be blank if provided");
        }
        return errors;
    }
}
