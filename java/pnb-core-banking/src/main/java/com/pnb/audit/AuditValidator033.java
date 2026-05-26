package com.pnb.audit;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * AuditValidator033 — Business rule validation.
 */
@ApplicationScoped
public class AuditValidator033 {

    public List<String> validate(AuditDto033 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("audit DTO must not be null");
            return errors;
        }
        if (dto.getAudiField001() != null && dto.getAudiField001().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("audiField001 must not be negative");
        }
        if (dto.getAudiField007() != null && dto.getAudiField007() < 0) {
            errors.add("audiField007 must not be negative");
        }
        if (dto.getAudiField008() != null && dto.getAudiField008() < 0) {
            errors.add("audiField008 must not be negative");
        }
        if (dto.getAudiField009() != null && dto.getAudiField009().isBlank()) {
            errors.add("audiField009 must not be blank if provided");
        }
        if (dto.getAudiField015() != null && dto.getAudiField015() < 0) {
            errors.add("audiField015 must not be negative");
        }
        return errors;
    }
}
