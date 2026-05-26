package com.pnb.hold;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * HoldValidator041 — Business rule validation.
 */
@ApplicationScoped
public class HoldValidator041 {

    public List<String> validate(HoldDto041 dto) {
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
        if (dto.getHoldField003() != null && dto.getHoldField003().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("holdField003 must not be negative");
        }
        if (dto.getHoldField005() != null && dto.getHoldField005().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("holdField005 must not be negative");
        }
        if (dto.getHoldField010() != null && dto.getHoldField010() < 0) {
            errors.add("holdField010 must not be negative");
        }
        if (dto.getHoldField011() != null && dto.getHoldField011().isBlank()) {
            errors.add("holdField011 must not be blank if provided");
        }
        return errors;
    }
}
