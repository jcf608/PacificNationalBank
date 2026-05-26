package com.pnb.wire;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * WireValidator044 — Business rule validation.
 */
@ApplicationScoped
public class WireValidator044 {

    public List<String> validate(WireDto044 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("wire DTO must not be null");
            return errors;
        }
        if (dto.getWireField003() != null && dto.getWireField003().isBlank()) {
            errors.add("wireField003 must not be blank if provided");
        }
        if (dto.getWireField005() != null && dto.getWireField005().isBlank()) {
            errors.add("wireField005 must not be blank if provided");
        }
        if (dto.getWireField009() != null && dto.getWireField009().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("wireField009 must not be negative");
        }
        if (dto.getWireField010() != null && dto.getWireField010().isBlank()) {
            errors.add("wireField010 must not be blank if provided");
        }
        if (dto.getWireField011() != null && dto.getWireField011().isBlank()) {
            errors.add("wireField011 must not be blank if provided");
        }
        if (dto.getWireField012() != null && dto.getWireField012().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("wireField012 must not be negative");
        }
        if (dto.getWireField015() != null && dto.getWireField015().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("wireField015 must not be negative");
        }
        return errors;
    }
}
