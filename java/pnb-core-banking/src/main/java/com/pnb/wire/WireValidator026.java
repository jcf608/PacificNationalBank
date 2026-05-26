package com.pnb.wire;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * WireValidator026 — Business rule validation.
 */
@ApplicationScoped
public class WireValidator026 {

    public List<String> validate(WireDto026 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("wire DTO must not be null");
            return errors;
        }
        if (dto.getWireField000() != null && dto.getWireField000().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("wireField000 must not be negative");
        }
        if (dto.getWireField001() != null && dto.getWireField001() < 0) {
            errors.add("wireField001 must not be negative");
        }
        if (dto.getWireField002() != null && dto.getWireField002() < 0) {
            errors.add("wireField002 must not be negative");
        }
        if (dto.getWireField007() != null && dto.getWireField007().isBlank()) {
            errors.add("wireField007 must not be blank if provided");
        }
        if (dto.getWireField008() != null && dto.getWireField008().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("wireField008 must not be negative");
        }
        return errors;
    }
}
