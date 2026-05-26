package com.pnb.hold;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * HoldValidator043 — Business rule validation.
 */
@ApplicationScoped
public class HoldValidator043 {

    public List<String> validate(HoldDto043 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("hold DTO must not be null");
            return errors;
        }
        if (dto.getHoldField005() != null && dto.getHoldField005().isBlank()) {
            errors.add("holdField005 must not be blank if provided");
        }
        if (dto.getHoldField010() != null && dto.getHoldField010().isBlank()) {
            errors.add("holdField010 must not be blank if provided");
        }
        if (dto.getHoldField011() != null && dto.getHoldField011() < 0) {
            errors.add("holdField011 must not be negative");
        }
        if (dto.getHoldField012() != null && dto.getHoldField012() < 0) {
            errors.add("holdField012 must not be negative");
        }
        return errors;
    }
}
