package com.pnb.hold;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * HoldValidator046 — Business rule validation.
 */
@ApplicationScoped
public class HoldValidator046 {

    public List<String> validate(HoldDto046 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("hold DTO must not be null");
            return errors;
        }
        if (dto.getHoldField000() != null && dto.getHoldField000() < 0) {
            errors.add("holdField000 must not be negative");
        }
        if (dto.getHoldField001() != null && dto.getHoldField001().isBlank()) {
            errors.add("holdField001 must not be blank if provided");
        }
        if (dto.getHoldField002() != null && dto.getHoldField002() < 0) {
            errors.add("holdField002 must not be negative");
        }
        if (dto.getHoldField003() != null && dto.getHoldField003().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("holdField003 must not be negative");
        }
        if (dto.getHoldField004() != null && dto.getHoldField004().isBlank()) {
            errors.add("holdField004 must not be blank if provided");
        }
        if (dto.getHoldField008() != null && dto.getHoldField008() < 0) {
            errors.add("holdField008 must not be negative");
        }
        if (dto.getHoldField010() != null && dto.getHoldField010() < 0) {
            errors.add("holdField010 must not be negative");
        }
        if (dto.getHoldField011() != null && dto.getHoldField011().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("holdField011 must not be negative");
        }
        if (dto.getHoldField014() != null && dto.getHoldField014() < 0) {
            errors.add("holdField014 must not be negative");
        }
        if (dto.getHoldField015() != null && dto.getHoldField015().isBlank()) {
            errors.add("holdField015 must not be blank if provided");
        }
        if (dto.getHoldField017() != null && dto.getHoldField017().isBlank()) {
            errors.add("holdField017 must not be blank if provided");
        }
        return errors;
    }
}
