package com.pnb.hold;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * HoldValidator039 — Business rule validation.
 */
@ApplicationScoped
public class HoldValidator039 {

    public List<String> validate(HoldDto039 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("hold DTO must not be null");
            return errors;
        }
        if (dto.getHoldField000() != null && dto.getHoldField000() < 0) {
            errors.add("holdField000 must not be negative");
        }
        if (dto.getHoldField001() != null && dto.getHoldField001().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("holdField001 must not be negative");
        }
        if (dto.getHoldField003() != null && dto.getHoldField003() < 0) {
            errors.add("holdField003 must not be negative");
        }
        if (dto.getHoldField005() != null && dto.getHoldField005().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("holdField005 must not be negative");
        }
        if (dto.getHoldField007() != null && dto.getHoldField007() < 0) {
            errors.add("holdField007 must not be negative");
        }
        if (dto.getHoldField008() != null && dto.getHoldField008().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("holdField008 must not be negative");
        }
        return errors;
    }
}
