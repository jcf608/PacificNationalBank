package com.pnb.hold;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * HoldValidator032 — Business rule validation.
 */
@ApplicationScoped
public class HoldValidator032 {

    public List<String> validate(HoldDto032 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("hold DTO must not be null");
            return errors;
        }
        if (dto.getHoldField002() != null && dto.getHoldField002() < 0) {
            errors.add("holdField002 must not be negative");
        }
        if (dto.getHoldField006() != null && dto.getHoldField006().isBlank()) {
            errors.add("holdField006 must not be blank if provided");
        }
        if (dto.getHoldField007() != null && dto.getHoldField007() < 0) {
            errors.add("holdField007 must not be negative");
        }
        if (dto.getHoldField009() != null && dto.getHoldField009() < 0) {
            errors.add("holdField009 must not be negative");
        }
        if (dto.getHoldField010() != null && dto.getHoldField010() < 0) {
            errors.add("holdField010 must not be negative");
        }
        if (dto.getHoldField014() != null && dto.getHoldField014().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("holdField014 must not be negative");
        }
        if (dto.getHoldField015() != null && dto.getHoldField015().isBlank()) {
            errors.add("holdField015 must not be blank if provided");
        }
        return errors;
    }
}
