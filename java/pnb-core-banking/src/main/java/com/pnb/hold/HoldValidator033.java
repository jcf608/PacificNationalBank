package com.pnb.hold;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * HoldValidator033 — Business rule validation.
 */
@ApplicationScoped
public class HoldValidator033 {

    public List<String> validate(HoldDto033 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("hold DTO must not be null");
            return errors;
        }
        if (dto.getHoldField001() != null && dto.getHoldField001() < 0) {
            errors.add("holdField001 must not be negative");
        }
        if (dto.getHoldField002() != null && dto.getHoldField002() < 0) {
            errors.add("holdField002 must not be negative");
        }
        if (dto.getHoldField003() != null && dto.getHoldField003().isBlank()) {
            errors.add("holdField003 must not be blank if provided");
        }
        if (dto.getHoldField004() != null && dto.getHoldField004().isBlank()) {
            errors.add("holdField004 must not be blank if provided");
        }
        if (dto.getHoldField006() != null && dto.getHoldField006() < 0) {
            errors.add("holdField006 must not be negative");
        }
        if (dto.getHoldField007() != null && dto.getHoldField007().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("holdField007 must not be negative");
        }
        if (dto.getHoldField008() != null && dto.getHoldField008().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("holdField008 must not be negative");
        }
        if (dto.getHoldField011() != null && dto.getHoldField011().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("holdField011 must not be negative");
        }
        if (dto.getHoldField012() != null && dto.getHoldField012() < 0) {
            errors.add("holdField012 must not be negative");
        }
        if (dto.getHoldField014() != null && dto.getHoldField014() < 0) {
            errors.add("holdField014 must not be negative");
        }
        if (dto.getHoldField015() != null && dto.getHoldField015().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("holdField015 must not be negative");
        }
        if (dto.getHoldField016() != null && dto.getHoldField016().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("holdField016 must not be negative");
        }
        return errors;
    }
}
