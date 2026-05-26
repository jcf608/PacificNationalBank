package com.pnb.hold;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * HoldValidator023 — Business rule validation.
 */
@ApplicationScoped
public class HoldValidator023 {

    public List<String> validate(HoldDto023 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("hold DTO must not be null");
            return errors;
        }
        if (dto.getHoldField000() != null && dto.getHoldField000() < 0) {
            errors.add("holdField000 must not be negative");
        }
        if (dto.getHoldField002() != null && dto.getHoldField002().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("holdField002 must not be negative");
        }
        if (dto.getHoldField008() != null && dto.getHoldField008().isBlank()) {
            errors.add("holdField008 must not be blank if provided");
        }
        if (dto.getHoldField010() != null && dto.getHoldField010().isBlank()) {
            errors.add("holdField010 must not be blank if provided");
        }
        if (dto.getHoldField011() != null && dto.getHoldField011().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("holdField011 must not be negative");
        }
        if (dto.getHoldField016() != null && dto.getHoldField016().isBlank()) {
            errors.add("holdField016 must not be blank if provided");
        }
        if (dto.getHoldField018() != null && dto.getHoldField018().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("holdField018 must not be negative");
        }
        return errors;
    }
}
