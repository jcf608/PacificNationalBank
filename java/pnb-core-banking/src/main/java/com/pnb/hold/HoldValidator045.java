package com.pnb.hold;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * HoldValidator045 — Business rule validation.
 */
@ApplicationScoped
public class HoldValidator045 {

    public List<String> validate(HoldDto045 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("hold DTO must not be null");
            return errors;
        }
        if (dto.getHoldField000() != null && dto.getHoldField000().isBlank()) {
            errors.add("holdField000 must not be blank if provided");
        }
        if (dto.getHoldField002() != null && dto.getHoldField002() < 0) {
            errors.add("holdField002 must not be negative");
        }
        if (dto.getHoldField003() != null && dto.getHoldField003().isBlank()) {
            errors.add("holdField003 must not be blank if provided");
        }
        if (dto.getHoldField008() != null && dto.getHoldField008() < 0) {
            errors.add("holdField008 must not be negative");
        }
        if (dto.getHoldField009() != null && dto.getHoldField009().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("holdField009 must not be negative");
        }
        if (dto.getHoldField010() != null && dto.getHoldField010().isBlank()) {
            errors.add("holdField010 must not be blank if provided");
        }
        if (dto.getHoldField011() != null && dto.getHoldField011().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("holdField011 must not be negative");
        }
        if (dto.getHoldField012() != null && dto.getHoldField012() < 0) {
            errors.add("holdField012 must not be negative");
        }
        if (dto.getHoldField013() != null && dto.getHoldField013().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("holdField013 must not be negative");
        }
        if (dto.getHoldField016() != null && dto.getHoldField016().isBlank()) {
            errors.add("holdField016 must not be blank if provided");
        }
        return errors;
    }
}
