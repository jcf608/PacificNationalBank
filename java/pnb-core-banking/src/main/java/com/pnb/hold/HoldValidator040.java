package com.pnb.hold;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * HoldValidator040 — Business rule validation.
 */
@ApplicationScoped
public class HoldValidator040 {

    public List<String> validate(HoldDto040 dto) {
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
        if (dto.getHoldField003() != null && dto.getHoldField003().isBlank()) {
            errors.add("holdField003 must not be blank if provided");
        }
        if (dto.getHoldField006() != null && dto.getHoldField006().isBlank()) {
            errors.add("holdField006 must not be blank if provided");
        }
        return errors;
    }
}
