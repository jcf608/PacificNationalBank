package com.pnb.wire;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * WireValidator046 — Business rule validation.
 */
@ApplicationScoped
public class WireValidator046 {

    public List<String> validate(WireDto046 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("wire DTO must not be null");
            return errors;
        }
        if (dto.getWireField002() != null && dto.getWireField002().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("wireField002 must not be negative");
        }
        if (dto.getWireField006() != null && dto.getWireField006().isBlank()) {
            errors.add("wireField006 must not be blank if provided");
        }
        if (dto.getWireField007() != null && dto.getWireField007() < 0) {
            errors.add("wireField007 must not be negative");
        }
        if (dto.getWireField009() != null && dto.getWireField009().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("wireField009 must not be negative");
        }
        if (dto.getWireField010() != null && dto.getWireField010().isBlank()) {
            errors.add("wireField010 must not be blank if provided");
        }
        if (dto.getWireField012() != null && dto.getWireField012() < 0) {
            errors.add("wireField012 must not be negative");
        }
        if (dto.getWireField013() != null && dto.getWireField013().isBlank()) {
            errors.add("wireField013 must not be blank if provided");
        }
        if (dto.getWireField015() != null && dto.getWireField015() < 0) {
            errors.add("wireField015 must not be negative");
        }
        return errors;
    }
}
