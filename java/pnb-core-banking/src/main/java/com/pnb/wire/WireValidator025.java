package com.pnb.wire;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * WireValidator025 — Business rule validation.
 */
@ApplicationScoped
public class WireValidator025 {

    public List<String> validate(WireDto025 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("wire DTO must not be null");
            return errors;
        }
        if (dto.getWireField001() != null && dto.getWireField001().isBlank()) {
            errors.add("wireField001 must not be blank if provided");
        }
        if (dto.getWireField003() != null && dto.getWireField003().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("wireField003 must not be negative");
        }
        if (dto.getWireField005() != null && dto.getWireField005().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("wireField005 must not be negative");
        }
        if (dto.getWireField006() != null && dto.getWireField006().isBlank()) {
            errors.add("wireField006 must not be blank if provided");
        }
        if (dto.getWireField007() != null && dto.getWireField007().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("wireField007 must not be negative");
        }
        if (dto.getWireField008() != null && dto.getWireField008().isBlank()) {
            errors.add("wireField008 must not be blank if provided");
        }
        return errors;
    }
}
