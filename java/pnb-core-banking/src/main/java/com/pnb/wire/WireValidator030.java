package com.pnb.wire;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * WireValidator030 — Business rule validation.
 */
@ApplicationScoped
public class WireValidator030 {

    public List<String> validate(WireDto030 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("wire DTO must not be null");
            return errors;
        }
        if (dto.getWireField007() != null && dto.getWireField007() < 0) {
            errors.add("wireField007 must not be negative");
        }
        if (dto.getWireField008() != null && dto.getWireField008().isBlank()) {
            errors.add("wireField008 must not be blank if provided");
        }
        if (dto.getWireField010() != null && dto.getWireField010().isBlank()) {
            errors.add("wireField010 must not be blank if provided");
        }
        if (dto.getWireField011() != null && dto.getWireField011().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("wireField011 must not be negative");
        }
        if (dto.getWireField013() != null && dto.getWireField013() < 0) {
            errors.add("wireField013 must not be negative");
        }
        return errors;
    }
}
