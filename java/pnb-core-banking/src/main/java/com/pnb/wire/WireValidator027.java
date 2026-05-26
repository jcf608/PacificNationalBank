package com.pnb.wire;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * WireValidator027 — Business rule validation.
 */
@ApplicationScoped
public class WireValidator027 {

    public List<String> validate(WireDto027 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("wire DTO must not be null");
            return errors;
        }
        if (dto.getWireField002() != null && dto.getWireField002().isBlank()) {
            errors.add("wireField002 must not be blank if provided");
        }
        if (dto.getWireField004() != null && dto.getWireField004() < 0) {
            errors.add("wireField004 must not be negative");
        }
        if (dto.getWireField005() != null && dto.getWireField005().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("wireField005 must not be negative");
        }
        if (dto.getWireField006() != null && dto.getWireField006().isBlank()) {
            errors.add("wireField006 must not be blank if provided");
        }
        if (dto.getWireField007() != null && dto.getWireField007().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("wireField007 must not be negative");
        }
        if (dto.getWireField008() != null && dto.getWireField008().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("wireField008 must not be negative");
        }
        if (dto.getWireField009() != null && dto.getWireField009().isBlank()) {
            errors.add("wireField009 must not be blank if provided");
        }
        if (dto.getWireField010() != null && dto.getWireField010().isBlank()) {
            errors.add("wireField010 must not be blank if provided");
        }
        return errors;
    }
}
