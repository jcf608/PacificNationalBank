package com.pnb.wire;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * WireValidator052 — Business rule validation.
 */
@ApplicationScoped
public class WireValidator052 {

    public List<String> validate(WireDto052 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("wire DTO must not be null");
            return errors;
        }
        if (dto.getWireField003() != null && dto.getWireField003() < 0) {
            errors.add("wireField003 must not be negative");
        }
        if (dto.getWireField009() != null && dto.getWireField009() < 0) {
            errors.add("wireField009 must not be negative");
        }
        return errors;
    }
}
