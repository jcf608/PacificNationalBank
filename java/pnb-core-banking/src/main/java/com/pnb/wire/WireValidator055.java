package com.pnb.wire;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * WireValidator055 — Business rule validation.
 */
@ApplicationScoped
public class WireValidator055 {

    public List<String> validate(WireDto055 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("wire DTO must not be null");
            return errors;
        }
        if (dto.getWireField001() != null && dto.getWireField001().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("wireField001 must not be negative");
        }
        if (dto.getWireField003() != null && dto.getWireField003().isBlank()) {
            errors.add("wireField003 must not be blank if provided");
        }
        if (dto.getWireField005() != null && dto.getWireField005().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("wireField005 must not be negative");
        }
        if (dto.getWireField007() != null && dto.getWireField007().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("wireField007 must not be negative");
        }
        if (dto.getWireField009() != null && dto.getWireField009().isBlank()) {
            errors.add("wireField009 must not be blank if provided");
        }
        if (dto.getWireField013() != null && dto.getWireField013().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("wireField013 must not be negative");
        }
        return errors;
    }
}
