package com.pnb.wire;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * WireValidator021 — Business rule validation.
 */
@ApplicationScoped
public class WireValidator021 {

    public List<String> validate(WireDto021 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("wire DTO must not be null");
            return errors;
        }
        if (dto.getWireField000() != null && dto.getWireField000().isBlank()) {
            errors.add("wireField000 must not be blank if provided");
        }
        if (dto.getWireField001() != null && dto.getWireField001().isBlank()) {
            errors.add("wireField001 must not be blank if provided");
        }
        if (dto.getWireField003() != null && dto.getWireField003() < 0) {
            errors.add("wireField003 must not be negative");
        }
        if (dto.getWireField009() != null && dto.getWireField009() < 0) {
            errors.add("wireField009 must not be negative");
        }
        if (dto.getWireField012() != null && dto.getWireField012() < 0) {
            errors.add("wireField012 must not be negative");
        }
        if (dto.getWireField014() != null && dto.getWireField014().isBlank()) {
            errors.add("wireField014 must not be blank if provided");
        }
        return errors;
    }
}
