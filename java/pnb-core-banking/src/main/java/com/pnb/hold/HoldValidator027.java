package com.pnb.hold;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * HoldValidator027 — Business rule validation.
 */
@ApplicationScoped
public class HoldValidator027 {

    public List<String> validate(HoldDto027 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("hold DTO must not be null");
            return errors;
        }
        if (dto.getHoldField000() != null && dto.getHoldField000().isBlank()) {
            errors.add("holdField000 must not be blank if provided");
        }
        if (dto.getHoldField003() != null && dto.getHoldField003().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("holdField003 must not be negative");
        }
        return errors;
    }
}
