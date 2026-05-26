package com.pnb.wire;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * WireValidator037 — Business rule validation.
 */
@ApplicationScoped
public class WireValidator037 {

    public List<String> validate(WireDto037 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("wire DTO must not be null");
            return errors;
        }
        if (dto.getWireField004() != null && dto.getWireField004().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("wireField004 must not be negative");
        }
        if (dto.getWireField008() != null && dto.getWireField008().isBlank()) {
            errors.add("wireField008 must not be blank if provided");
        }
        return errors;
    }
}
