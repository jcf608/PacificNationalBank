package com.pnb.hold;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * HoldValidator057 — Business rule validation.
 */
@ApplicationScoped
public class HoldValidator057 {

    public List<String> validate(HoldDto057 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("hold DTO must not be null");
            return errors;
        }
        if (dto.getHoldField001() != null && dto.getHoldField001() < 0) {
            errors.add("holdField001 must not be negative");
        }
        if (dto.getHoldField002() != null && dto.getHoldField002().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("holdField002 must not be negative");
        }
        if (dto.getHoldField004() != null && dto.getHoldField004().isBlank()) {
            errors.add("holdField004 must not be blank if provided");
        }
        if (dto.getHoldField006() != null && dto.getHoldField006() < 0) {
            errors.add("holdField006 must not be negative");
        }
        if (dto.getHoldField007() != null && dto.getHoldField007() < 0) {
            errors.add("holdField007 must not be negative");
        }
        if (dto.getHoldField010() != null && dto.getHoldField010().isBlank()) {
            errors.add("holdField010 must not be blank if provided");
        }
        if (dto.getHoldField012() != null && dto.getHoldField012().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("holdField012 must not be negative");
        }
        if (dto.getHoldField013() != null && dto.getHoldField013().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("holdField013 must not be negative");
        }
        return errors;
    }
}
