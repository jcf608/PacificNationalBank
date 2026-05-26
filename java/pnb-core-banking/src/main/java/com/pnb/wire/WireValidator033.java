package com.pnb.wire;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * WireValidator033 — Business rule validation.
 */
@ApplicationScoped
public class WireValidator033 {

    public List<String> validate(WireDto033 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("wire DTO must not be null");
            return errors;
        }
        if (dto.getWireField000() != null && dto.getWireField000() < 0) {
            errors.add("wireField000 must not be negative");
        }
        if (dto.getWireField001() != null && dto.getWireField001().isBlank()) {
            errors.add("wireField001 must not be blank if provided");
        }
        if (dto.getWireField010() != null && dto.getWireField010() < 0) {
            errors.add("wireField010 must not be negative");
        }
        if (dto.getWireField011() != null && dto.getWireField011() < 0) {
            errors.add("wireField011 must not be negative");
        }
        if (dto.getWireField013() != null && dto.getWireField013() < 0) {
            errors.add("wireField013 must not be negative");
        }
        if (dto.getWireField014() != null && dto.getWireField014().isBlank()) {
            errors.add("wireField014 must not be blank if provided");
        }
        if (dto.getWireField015() != null && dto.getWireField015() < 0) {
            errors.add("wireField015 must not be negative");
        }
        if (dto.getWireField016() != null && dto.getWireField016().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("wireField016 must not be negative");
        }
        return errors;
    }
}
