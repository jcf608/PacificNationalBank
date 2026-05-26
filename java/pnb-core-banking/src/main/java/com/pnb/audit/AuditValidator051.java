package com.pnb.audit;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * AuditValidator051 — Business rule validation.
 */
@ApplicationScoped
public class AuditValidator051 {

    public List<String> validate(AuditDto051 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("audit DTO must not be null");
            return errors;
        }
        if (dto.getAudiField001() != null && dto.getAudiField001().isBlank()) {
            errors.add("audiField001 must not be blank if provided");
        }
        if (dto.getAudiField002() != null && dto.getAudiField002().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("audiField002 must not be negative");
        }
        if (dto.getAudiField004() != null && dto.getAudiField004().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("audiField004 must not be negative");
        }
        if (dto.getAudiField007() != null && dto.getAudiField007().isBlank()) {
            errors.add("audiField007 must not be blank if provided");
        }
        return errors;
    }
}
