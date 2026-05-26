package com.pnb.wire;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * WireValidator053 — Business rule validation.
 */
@ApplicationScoped
public class WireValidator053 {

    public List<String> validate(WireDto053 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("wire DTO must not be null");
            return errors;
        }
        if (dto.getWireField004() != null && dto.getWireField004().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("wireField004 must not be negative");
        }
        if (dto.getWireField005() != null && dto.getWireField005().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("wireField005 must not be negative");
        }
        if (dto.getWireField007() != null && dto.getWireField007() < 0) {
            errors.add("wireField007 must not be negative");
        }
        if (dto.getWireField008() != null && dto.getWireField008().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("wireField008 must not be negative");
        }
        if (dto.getWireField012() != null && dto.getWireField012().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("wireField012 must not be negative");
        }
        return errors;
    }
}
