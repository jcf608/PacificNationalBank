package com.pnb.wire;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * WireValidator024 — Business rule validation.
 */
@ApplicationScoped
public class WireValidator024 {

    public List<String> validate(WireDto024 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("wire DTO must not be null");
            return errors;
        }
        if (dto.getWireField001() != null && dto.getWireField001().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("wireField001 must not be negative");
        }
        if (dto.getWireField003() != null && dto.getWireField003() < 0) {
            errors.add("wireField003 must not be negative");
        }
        if (dto.getWireField004() != null && dto.getWireField004().isBlank()) {
            errors.add("wireField004 must not be blank if provided");
        }
        if (dto.getWireField007() != null && dto.getWireField007() < 0) {
            errors.add("wireField007 must not be negative");
        }
        return errors;
    }
}
