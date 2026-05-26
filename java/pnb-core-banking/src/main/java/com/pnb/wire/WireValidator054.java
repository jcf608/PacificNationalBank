package com.pnb.wire;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * WireValidator054 — Business rule validation.
 */
@ApplicationScoped
public class WireValidator054 {

    public List<String> validate(WireDto054 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("wire DTO must not be null");
            return errors;
        }
        if (dto.getWireField000() != null && dto.getWireField000() < 0) {
            errors.add("wireField000 must not be negative");
        }
        if (dto.getWireField002() != null && dto.getWireField002() < 0) {
            errors.add("wireField002 must not be negative");
        }
        if (dto.getWireField003() != null && dto.getWireField003().isBlank()) {
            errors.add("wireField003 must not be blank if provided");
        }
        if (dto.getWireField004() != null && dto.getWireField004().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("wireField004 must not be negative");
        }
        if (dto.getWireField005() != null && dto.getWireField005() < 0) {
            errors.add("wireField005 must not be negative");
        }
        if (dto.getWireField007() != null && dto.getWireField007() < 0) {
            errors.add("wireField007 must not be negative");
        }
        if (dto.getWireField012() != null && dto.getWireField012() < 0) {
            errors.add("wireField012 must not be negative");
        }
        return errors;
    }
}
