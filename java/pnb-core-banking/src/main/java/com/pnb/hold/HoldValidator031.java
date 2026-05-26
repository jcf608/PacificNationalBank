package com.pnb.hold;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * HoldValidator031 — Business rule validation.
 */
@ApplicationScoped
public class HoldValidator031 {

    public List<String> validate(HoldDto031 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("hold DTO must not be null");
            return errors;
        }
        if (dto.getHoldField000() != null && dto.getHoldField000().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("holdField000 must not be negative");
        }
        if (dto.getHoldField003() != null && dto.getHoldField003().isBlank()) {
            errors.add("holdField003 must not be blank if provided");
        }
        if (dto.getHoldField007() != null && dto.getHoldField007().isBlank()) {
            errors.add("holdField007 must not be blank if provided");
        }
        if (dto.getHoldField011() != null && dto.getHoldField011().isBlank()) {
            errors.add("holdField011 must not be blank if provided");
        }
        if (dto.getHoldField012() != null && dto.getHoldField012().isBlank()) {
            errors.add("holdField012 must not be blank if provided");
        }
        return errors;
    }
}
