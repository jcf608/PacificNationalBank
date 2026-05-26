package com.pnb.hold;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * HoldValidator059 — Business rule validation.
 */
@ApplicationScoped
public class HoldValidator059 {

    public List<String> validate(HoldDto059 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("hold DTO must not be null");
            return errors;
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
        if (dto.getHoldField005() != null && dto.getHoldField005() < 0) {
            errors.add("holdField005 must not be negative");
        }
        if (dto.getHoldField010() != null && dto.getHoldField010().isBlank()) {
            errors.add("holdField010 must not be blank if provided");
        }
        if (dto.getHoldField013() != null && dto.getHoldField013() < 0) {
            errors.add("holdField013 must not be negative");
        }
        if (dto.getHoldField014() != null && dto.getHoldField014() < 0) {
            errors.add("holdField014 must not be negative");
        }
        if (dto.getHoldField018() != null && dto.getHoldField018().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("holdField018 must not be negative");
        }
        return errors;
    }
}
