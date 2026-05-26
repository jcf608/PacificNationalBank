package com.pnb.hold;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * HoldValidator047 — Business rule validation.
 */
@ApplicationScoped
public class HoldValidator047 {

    public List<String> validate(HoldDto047 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("hold DTO must not be null");
            return errors;
        }
        if (dto.getHoldField000() != null && dto.getHoldField000().isBlank()) {
            errors.add("holdField000 must not be blank if provided");
        }
        if (dto.getHoldField001() != null && dto.getHoldField001().isBlank()) {
            errors.add("holdField001 must not be blank if provided");
        }
        if (dto.getHoldField007() != null && dto.getHoldField007().isBlank()) {
            errors.add("holdField007 must not be blank if provided");
        }
        if (dto.getHoldField008() != null && dto.getHoldField008() < 0) {
            errors.add("holdField008 must not be negative");
        }
        if (dto.getHoldField010() != null && dto.getHoldField010().isBlank()) {
            errors.add("holdField010 must not be blank if provided");
        }
        if (dto.getHoldField011() != null && dto.getHoldField011() < 0) {
            errors.add("holdField011 must not be negative");
        }
        if (dto.getHoldField013() != null && dto.getHoldField013().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("holdField013 must not be negative");
        }
        if (dto.getHoldField014() != null && dto.getHoldField014().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("holdField014 must not be negative");
        }
        if (dto.getHoldField016() != null && dto.getHoldField016().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("holdField016 must not be negative");
        }
        if (dto.getHoldField018() != null && dto.getHoldField018().isBlank()) {
            errors.add("holdField018 must not be blank if provided");
        }
        return errors;
    }
}
