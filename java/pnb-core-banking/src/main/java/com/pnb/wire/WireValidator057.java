package com.pnb.wire;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * WireValidator057 — Business rule validation.
 */
@ApplicationScoped
public class WireValidator057 {

    public List<String> validate(WireDto057 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("wire DTO must not be null");
            return errors;
        }
        if (dto.getWireField001() != null && dto.getWireField001() < 0) {
            errors.add("wireField001 must not be negative");
        }
        if (dto.getWireField002() != null && dto.getWireField002().isBlank()) {
            errors.add("wireField002 must not be blank if provided");
        }
        if (dto.getWireField005() != null && dto.getWireField005() < 0) {
            errors.add("wireField005 must not be negative");
        }
        if (dto.getWireField006() != null && dto.getWireField006().isBlank()) {
            errors.add("wireField006 must not be blank if provided");
        }
        if (dto.getWireField011() != null && dto.getWireField011().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("wireField011 must not be negative");
        }
        if (dto.getWireField013() != null && dto.getWireField013() < 0) {
            errors.add("wireField013 must not be negative");
        }
        if (dto.getWireField014() != null && dto.getWireField014().isBlank()) {
            errors.add("wireField014 must not be blank if provided");
        }
        if (dto.getWireField015() != null && dto.getWireField015().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("wireField015 must not be negative");
        }
        return errors;
    }
}
