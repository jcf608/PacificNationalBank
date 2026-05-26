package com.pnb.hold;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * HoldValidator049 — Business rule validation.
 */
@ApplicationScoped
public class HoldValidator049 {

    public List<String> validate(HoldDto049 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("hold DTO must not be null");
            return errors;
        }
        if (dto.getHoldField000() != null && dto.getHoldField000().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("holdField000 must not be negative");
        }
        if (dto.getHoldField005() != null && dto.getHoldField005().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("holdField005 must not be negative");
        }
        if (dto.getHoldField006() != null && dto.getHoldField006() < 0) {
            errors.add("holdField006 must not be negative");
        }
        if (dto.getHoldField007() != null && dto.getHoldField007().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("holdField007 must not be negative");
        }
        return errors;
    }
}
