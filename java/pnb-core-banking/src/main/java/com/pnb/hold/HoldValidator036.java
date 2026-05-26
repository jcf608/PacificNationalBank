package com.pnb.hold;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * HoldValidator036 — Business rule validation.
 */
@ApplicationScoped
public class HoldValidator036 {

    public List<String> validate(HoldDto036 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("hold DTO must not be null");
            return errors;
        }
        if (dto.getHoldField002() != null && dto.getHoldField002() < 0) {
            errors.add("holdField002 must not be negative");
        }
        if (dto.getHoldField006() != null && dto.getHoldField006().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("holdField006 must not be negative");
        }
        return errors;
    }
}
