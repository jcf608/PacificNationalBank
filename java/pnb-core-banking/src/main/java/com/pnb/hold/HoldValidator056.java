package com.pnb.hold;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * HoldValidator056 — Business rule validation.
 */
@ApplicationScoped
public class HoldValidator056 {

    public List<String> validate(HoldDto056 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("hold DTO must not be null");
            return errors;
        }
        if (dto.getHoldField002() != null && dto.getHoldField002().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("holdField002 must not be negative");
        }
        if (dto.getHoldField004() != null && dto.getHoldField004() < 0) {
            errors.add("holdField004 must not be negative");
        }
        if (dto.getHoldField005() != null && dto.getHoldField005() < 0) {
            errors.add("holdField005 must not be negative");
        }
        if (dto.getHoldField007() != null && dto.getHoldField007().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("holdField007 must not be negative");
        }
        if (dto.getHoldField010() != null && dto.getHoldField010() < 0) {
            errors.add("holdField010 must not be negative");
        }
        if (dto.getHoldField012() != null && dto.getHoldField012() < 0) {
            errors.add("holdField012 must not be negative");
        }
        if (dto.getHoldField013() != null && dto.getHoldField013().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("holdField013 must not be negative");
        }
        if (dto.getHoldField014() != null && dto.getHoldField014().isBlank()) {
            errors.add("holdField014 must not be blank if provided");
        }
        return errors;
    }
}
