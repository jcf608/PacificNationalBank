package com.pnb.wire;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * WireValidator047 — Business rule validation.
 */
@ApplicationScoped
public class WireValidator047 {

    public List<String> validate(WireDto047 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("wire DTO must not be null");
            return errors;
        }
        if (dto.getWireField001() != null && dto.getWireField001().isBlank()) {
            errors.add("wireField001 must not be blank if provided");
        }
        if (dto.getWireField002() != null && dto.getWireField002().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("wireField002 must not be negative");
        }
        if (dto.getWireField003() != null && dto.getWireField003() < 0) {
            errors.add("wireField003 must not be negative");
        }
        if (dto.getWireField005() != null && dto.getWireField005() < 0) {
            errors.add("wireField005 must not be negative");
        }
        if (dto.getWireField010() != null && dto.getWireField010().isBlank()) {
            errors.add("wireField010 must not be blank if provided");
        }
        if (dto.getWireField017() != null && dto.getWireField017().isBlank()) {
            errors.add("wireField017 must not be blank if provided");
        }
        if (dto.getWireField018() != null && dto.getWireField018().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("wireField018 must not be negative");
        }
        return errors;
    }
}
