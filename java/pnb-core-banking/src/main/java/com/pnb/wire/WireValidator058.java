package com.pnb.wire;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * WireValidator058 — Business rule validation.
 */
@ApplicationScoped
public class WireValidator058 {

    public List<String> validate(WireDto058 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("wire DTO must not be null");
            return errors;
        }
        if (dto.getWireField000() != null && dto.getWireField000() < 0) {
            errors.add("wireField000 must not be negative");
        }
        if (dto.getWireField001() != null && dto.getWireField001() < 0) {
            errors.add("wireField001 must not be negative");
        }
        if (dto.getWireField002() != null && dto.getWireField002() < 0) {
            errors.add("wireField002 must not be negative");
        }
        if (dto.getWireField004() != null && dto.getWireField004() < 0) {
            errors.add("wireField004 must not be negative");
        }
        if (dto.getWireField013() != null && dto.getWireField013() < 0) {
            errors.add("wireField013 must not be negative");
        }
        if (dto.getWireField015() != null && dto.getWireField015().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("wireField015 must not be negative");
        }
        if (dto.getWireField016() != null && dto.getWireField016().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("wireField016 must not be negative");
        }
        return errors;
    }
}
