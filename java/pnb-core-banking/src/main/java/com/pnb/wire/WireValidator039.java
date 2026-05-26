package com.pnb.wire;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * WireValidator039 — Business rule validation.
 */
@ApplicationScoped
public class WireValidator039 {

    public List<String> validate(WireDto039 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("wire DTO must not be null");
            return errors;
        }
        if (dto.getWireField001() != null && dto.getWireField001() < 0) {
            errors.add("wireField001 must not be negative");
        }
        if (dto.getWireField003() != null && dto.getWireField003().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("wireField003 must not be negative");
        }
        if (dto.getWireField004() != null && dto.getWireField004().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("wireField004 must not be negative");
        }
        if (dto.getWireField008() != null && dto.getWireField008() < 0) {
            errors.add("wireField008 must not be negative");
        }
        if (dto.getWireField009() != null && dto.getWireField009().isBlank()) {
            errors.add("wireField009 must not be blank if provided");
        }
        return errors;
    }
}
