package com.pnb.wire;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * WireValidator035 — Business rule validation.
 */
@ApplicationScoped
public class WireValidator035 {

    public List<String> validate(WireDto035 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("wire DTO must not be null");
            return errors;
        }
        if (dto.getWireField006() != null && dto.getWireField006().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("wireField006 must not be negative");
        }
        if (dto.getWireField008() != null && dto.getWireField008().isBlank()) {
            errors.add("wireField008 must not be blank if provided");
        }
        if (dto.getWireField009() != null && dto.getWireField009() < 0) {
            errors.add("wireField009 must not be negative");
        }
        if (dto.getWireField011() != null && dto.getWireField011().isBlank()) {
            errors.add("wireField011 must not be blank if provided");
        }
        if (dto.getWireField014() != null && dto.getWireField014() < 0) {
            errors.add("wireField014 must not be negative");
        }
        if (dto.getWireField017() != null && dto.getWireField017() < 0) {
            errors.add("wireField017 must not be negative");
        }
        return errors;
    }
}
