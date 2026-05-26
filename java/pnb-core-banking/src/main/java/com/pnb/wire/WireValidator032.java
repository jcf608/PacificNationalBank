package com.pnb.wire;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * WireValidator032 — Business rule validation.
 */
@ApplicationScoped
public class WireValidator032 {

    public List<String> validate(WireDto032 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("wire DTO must not be null");
            return errors;
        }
        if (dto.getWireField000() != null && dto.getWireField000().isBlank()) {
            errors.add("wireField000 must not be blank if provided");
        }
        if (dto.getWireField003() != null && dto.getWireField003().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("wireField003 must not be negative");
        }
        if (dto.getWireField005() != null && dto.getWireField005() < 0) {
            errors.add("wireField005 must not be negative");
        }
        if (dto.getWireField006() != null && dto.getWireField006().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("wireField006 must not be negative");
        }
        if (dto.getWireField008() != null && dto.getWireField008().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("wireField008 must not be negative");
        }
        if (dto.getWireField009() != null && dto.getWireField009() < 0) {
            errors.add("wireField009 must not be negative");
        }
        if (dto.getWireField012() != null && dto.getWireField012().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("wireField012 must not be negative");
        }
        return errors;
    }
}
