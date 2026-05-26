package com.pnb.wire;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * WireValidator050 — Business rule validation.
 */
@ApplicationScoped
public class WireValidator050 {

    public List<String> validate(WireDto050 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("wire DTO must not be null");
            return errors;
        }
        if (dto.getWireField002() != null && dto.getWireField002() < 0) {
            errors.add("wireField002 must not be negative");
        }
        if (dto.getWireField003() != null && dto.getWireField003() < 0) {
            errors.add("wireField003 must not be negative");
        }
        if (dto.getWireField005() != null && dto.getWireField005().isBlank()) {
            errors.add("wireField005 must not be blank if provided");
        }
        if (dto.getWireField009() != null && dto.getWireField009().isBlank()) {
            errors.add("wireField009 must not be blank if provided");
        }
        return errors;
    }
}
