package com.pnb.wire;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * WireValidator034 — Business rule validation.
 */
@ApplicationScoped
public class WireValidator034 {

    public List<String> validate(WireDto034 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("wire DTO must not be null");
            return errors;
        }
        if (dto.getWireField002() != null && dto.getWireField002().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("wireField002 must not be negative");
        }
        if (dto.getWireField003() != null && dto.getWireField003() < 0) {
            errors.add("wireField003 must not be negative");
        }
        if (dto.getWireField007() != null && dto.getWireField007() < 0) {
            errors.add("wireField007 must not be negative");
        }
        if (dto.getWireField012() != null && dto.getWireField012() < 0) {
            errors.add("wireField012 must not be negative");
        }
        if (dto.getWireField013() != null && dto.getWireField013().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("wireField013 must not be negative");
        }
        if (dto.getWireField016() != null && dto.getWireField016().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("wireField016 must not be negative");
        }
        if (dto.getWireField017() != null && dto.getWireField017().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("wireField017 must not be negative");
        }
        return errors;
    }
}
