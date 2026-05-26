package com.pnb.hold;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * HoldValidator020 — Business rule validation.
 */
@ApplicationScoped
public class HoldValidator020 {

    public List<String> validate(HoldDto020 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("hold DTO must not be null");
            return errors;
        }
        if (dto.getHoldField000() != null && dto.getHoldField000() < 0) {
            errors.add("holdField000 must not be negative");
        }
        if (dto.getHoldField002() != null && dto.getHoldField002() < 0) {
            errors.add("holdField002 must not be negative");
        }
        if (dto.getHoldField004() != null && dto.getHoldField004().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("holdField004 must not be negative");
        }
        if (dto.getHoldField005() != null && dto.getHoldField005().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("holdField005 must not be negative");
        }
        if (dto.getHoldField007() != null && dto.getHoldField007() < 0) {
            errors.add("holdField007 must not be negative");
        }
        if (dto.getHoldField008() != null && dto.getHoldField008().isBlank()) {
            errors.add("holdField008 must not be blank if provided");
        }
        if (dto.getHoldField009() != null && dto.getHoldField009() < 0) {
            errors.add("holdField009 must not be negative");
        }
        if (dto.getHoldField010() != null && dto.getHoldField010().isBlank()) {
            errors.add("holdField010 must not be blank if provided");
        }
        if (dto.getHoldField011() != null && dto.getHoldField011().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("holdField011 must not be negative");
        }
        if (dto.getHoldField013() != null && dto.getHoldField013().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("holdField013 must not be negative");
        }
        if (dto.getHoldField014() != null && dto.getHoldField014() < 0) {
            errors.add("holdField014 must not be negative");
        }
        return errors;
    }
}
