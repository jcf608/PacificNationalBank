package com.pnb.wire;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * WireValidator020 — Business rule validation.
 */
@ApplicationScoped
public class WireValidator020 {

    public List<String> validate(WireDto020 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("wire DTO must not be null");
            return errors;
        }
        if (dto.getWireField000() != null && dto.getWireField000().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("wireField000 must not be negative");
        }
        if (dto.getWireField001() != null && dto.getWireField001().isBlank()) {
            errors.add("wireField001 must not be blank if provided");
        }
        if (dto.getWireField002() != null && dto.getWireField002().isBlank()) {
            errors.add("wireField002 must not be blank if provided");
        }
        if (dto.getWireField003() != null && dto.getWireField003().isBlank()) {
            errors.add("wireField003 must not be blank if provided");
        }
        if (dto.getWireField004() != null && dto.getWireField004().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("wireField004 must not be negative");
        }
        if (dto.getWireField007() != null && dto.getWireField007().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("wireField007 must not be negative");
        }
        if (dto.getWireField009() != null && dto.getWireField009() < 0) {
            errors.add("wireField009 must not be negative");
        }
        if (dto.getWireField011() != null && dto.getWireField011() < 0) {
            errors.add("wireField011 must not be negative");
        }
        if (dto.getWireField012() != null && dto.getWireField012().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("wireField012 must not be negative");
        }
        if (dto.getWireField014() != null && dto.getWireField014().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("wireField014 must not be negative");
        }
        return errors;
    }
}
