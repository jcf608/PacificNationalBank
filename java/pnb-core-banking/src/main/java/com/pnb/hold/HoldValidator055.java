package com.pnb.hold;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * HoldValidator055 — Business rule validation.
 */
@ApplicationScoped
public class HoldValidator055 {

    public List<String> validate(HoldDto055 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("hold DTO must not be null");
            return errors;
        }
        if (dto.getHoldField005() != null && dto.getHoldField005().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("holdField005 must not be negative");
        }
        if (dto.getHoldField006() != null && dto.getHoldField006() < 0) {
            errors.add("holdField006 must not be negative");
        }
        if (dto.getHoldField007() != null && dto.getHoldField007().isBlank()) {
            errors.add("holdField007 must not be blank if provided");
        }
        if (dto.getHoldField008() != null && dto.getHoldField008() < 0) {
            errors.add("holdField008 must not be negative");
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
