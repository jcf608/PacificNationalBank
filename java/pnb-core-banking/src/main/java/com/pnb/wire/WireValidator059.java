package com.pnb.wire;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * WireValidator059 — Business rule validation.
 */
@ApplicationScoped
public class WireValidator059 {

    public List<String> validate(WireDto059 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("wire DTO must not be null");
            return errors;
        }
        if (dto.getWireField001() != null && dto.getWireField001().isBlank()) {
            errors.add("wireField001 must not be blank if provided");
        }
        if (dto.getWireField004() != null && dto.getWireField004().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("wireField004 must not be negative");
        }
        if (dto.getWireField009() != null && dto.getWireField009().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("wireField009 must not be negative");
        }
        if (dto.getWireField012() != null && dto.getWireField012().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("wireField012 must not be negative");
        }
        if (dto.getWireField013() != null && dto.getWireField013() < 0) {
            errors.add("wireField013 must not be negative");
        }
        if (dto.getWireField016() != null && dto.getWireField016().isBlank()) {
            errors.add("wireField016 must not be blank if provided");
        }
        return errors;
    }
}
