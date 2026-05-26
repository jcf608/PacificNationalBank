package com.pnb.wire;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * WireValidator022 — Business rule validation.
 */
@ApplicationScoped
public class WireValidator022 {

    public List<String> validate(WireDto022 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("wire DTO must not be null");
            return errors;
        }
        if (dto.getWireField002() != null && dto.getWireField002().isBlank()) {
            errors.add("wireField002 must not be blank if provided");
        }
        if (dto.getWireField006() != null && dto.getWireField006().isBlank()) {
            errors.add("wireField006 must not be blank if provided");
        }
        if (dto.getWireField007() != null && dto.getWireField007() < 0) {
            errors.add("wireField007 must not be negative");
        }
        if (dto.getWireField014() != null && dto.getWireField014().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("wireField014 must not be negative");
        }
        if (dto.getWireField016() != null && dto.getWireField016() < 0) {
            errors.add("wireField016 must not be negative");
        }
        return errors;
    }
}
