package com.pnb.hold;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * HoldValidator035 — Business rule validation.
 */
@ApplicationScoped
public class HoldValidator035 {

    public List<String> validate(HoldDto035 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("hold DTO must not be null");
            return errors;
        }
        if (dto.getHoldField001() != null && dto.getHoldField001().isBlank()) {
            errors.add("holdField001 must not be blank if provided");
        }
        if (dto.getHoldField003() != null && dto.getHoldField003() < 0) {
            errors.add("holdField003 must not be negative");
        }
        if (dto.getHoldField004() != null && dto.getHoldField004() < 0) {
            errors.add("holdField004 must not be negative");
        }
        if (dto.getHoldField008() != null && dto.getHoldField008() < 0) {
            errors.add("holdField008 must not be negative");
        }
        if (dto.getHoldField009() != null && dto.getHoldField009().isBlank()) {
            errors.add("holdField009 must not be blank if provided");
        }
        if (dto.getHoldField011() != null && dto.getHoldField011().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("holdField011 must not be negative");
        }
        if (dto.getHoldField012() != null && dto.getHoldField012().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("holdField012 must not be negative");
        }
        if (dto.getHoldField013() != null && dto.getHoldField013().isBlank()) {
            errors.add("holdField013 must not be blank if provided");
        }
        if (dto.getHoldField016() != null && dto.getHoldField016().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("holdField016 must not be negative");
        }
        return errors;
    }
}
