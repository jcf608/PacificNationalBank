package com.pnb.hold;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * HoldValidator034 — Business rule validation.
 */
@ApplicationScoped
public class HoldValidator034 {

    public List<String> validate(HoldDto034 dto) {
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
        if (dto.getHoldField004() != null && dto.getHoldField004() < 0) {
            errors.add("holdField004 must not be negative");
        }
        if (dto.getHoldField006() != null && dto.getHoldField006().isBlank()) {
            errors.add("holdField006 must not be blank if provided");
        }
        if (dto.getHoldField007() != null && dto.getHoldField007() < 0) {
            errors.add("holdField007 must not be negative");
        }
        if (dto.getHoldField010() != null && dto.getHoldField010().isBlank()) {
            errors.add("holdField010 must not be blank if provided");
        }
        if (dto.getHoldField013() != null && dto.getHoldField013().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("holdField013 must not be negative");
        }
        if (dto.getHoldField015() != null && dto.getHoldField015().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("holdField015 must not be negative");
        }
        if (dto.getHoldField016() != null && dto.getHoldField016().isBlank()) {
            errors.add("holdField016 must not be blank if provided");
        }
        if (dto.getHoldField017() != null && dto.getHoldField017() < 0) {
            errors.add("holdField017 must not be negative");
        }
        return errors;
    }
}
