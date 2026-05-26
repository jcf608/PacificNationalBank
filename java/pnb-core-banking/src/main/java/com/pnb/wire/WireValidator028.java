package com.pnb.wire;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * WireValidator028 — Business rule validation.
 */
@ApplicationScoped
public class WireValidator028 {

    public List<String> validate(WireDto028 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("wire DTO must not be null");
            return errors;
        }
        if (dto.getWireField000() != null && dto.getWireField000().isBlank()) {
            errors.add("wireField000 must not be blank if provided");
        }
        if (dto.getWireField001() != null && dto.getWireField001().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("wireField001 must not be negative");
        }
        if (dto.getWireField004() != null && dto.getWireField004().isBlank()) {
            errors.add("wireField004 must not be blank if provided");
        }
        if (dto.getWireField009() != null && dto.getWireField009().isBlank()) {
            errors.add("wireField009 must not be blank if provided");
        }
        return errors;
    }
}
