package com.pnb.wire;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * WireValidator051 — Business rule validation.
 */
@ApplicationScoped
public class WireValidator051 {

    public List<String> validate(WireDto051 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("wire DTO must not be null");
            return errors;
        }
        if (dto.getWireField000() != null && dto.getWireField000().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("wireField000 must not be negative");
        }
        if (dto.getWireField002() != null && dto.getWireField002().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("wireField002 must not be negative");
        }
        if (dto.getWireField004() != null && dto.getWireField004() < 0) {
            errors.add("wireField004 must not be negative");
        }
        if (dto.getWireField005() != null && dto.getWireField005().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("wireField005 must not be negative");
        }
        if (dto.getWireField006() != null && dto.getWireField006() < 0) {
            errors.add("wireField006 must not be negative");
        }
        if (dto.getWireField007() != null && dto.getWireField007() < 0) {
            errors.add("wireField007 must not be negative");
        }
        if (dto.getWireField010() != null && dto.getWireField010().isBlank()) {
            errors.add("wireField010 must not be blank if provided");
        }
        return errors;
    }
}
