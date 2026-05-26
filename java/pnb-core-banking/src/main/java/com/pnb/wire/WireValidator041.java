package com.pnb.wire;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * WireValidator041 — Business rule validation.
 */
@ApplicationScoped
public class WireValidator041 {

    public List<String> validate(WireDto041 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("wire DTO must not be null");
            return errors;
        }
        if (dto.getWireField002() != null && dto.getWireField002() < 0) {
            errors.add("wireField002 must not be negative");
        }
        if (dto.getWireField003() != null && dto.getWireField003().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("wireField003 must not be negative");
        }
        if (dto.getWireField005() != null && dto.getWireField005().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("wireField005 must not be negative");
        }
        if (dto.getWireField007() != null && dto.getWireField007().isBlank()) {
            errors.add("wireField007 must not be blank if provided");
        }
        if (dto.getWireField008() != null && dto.getWireField008().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("wireField008 must not be negative");
        }
        if (dto.getWireField011() != null && dto.getWireField011().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("wireField011 must not be negative");
        }
        if (dto.getWireField012() != null && dto.getWireField012().isBlank()) {
            errors.add("wireField012 must not be blank if provided");
        }
        return errors;
    }
}
