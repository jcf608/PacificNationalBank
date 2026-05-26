package com.pnb.wire;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * WireValidator043 — Business rule validation.
 */
@ApplicationScoped
public class WireValidator043 {

    public List<String> validate(WireDto043 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("wire DTO must not be null");
            return errors;
        }
        if (dto.getWireField000() != null && dto.getWireField000().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("wireField000 must not be negative");
        }
        if (dto.getWireField002() != null && dto.getWireField002().isBlank()) {
            errors.add("wireField002 must not be blank if provided");
        }
        if (dto.getWireField005() != null && dto.getWireField005().isBlank()) {
            errors.add("wireField005 must not be blank if provided");
        }
        if (dto.getWireField006() != null && dto.getWireField006().isBlank()) {
            errors.add("wireField006 must not be blank if provided");
        }
        if (dto.getWireField007() != null && dto.getWireField007().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("wireField007 must not be negative");
        }
        if (dto.getWireField009() != null && dto.getWireField009().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("wireField009 must not be negative");
        }
        if (dto.getWireField012() != null && dto.getWireField012().isBlank()) {
            errors.add("wireField012 must not be blank if provided");
        }
        if (dto.getWireField013() != null && dto.getWireField013().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("wireField013 must not be negative");
        }
        return errors;
    }
}
