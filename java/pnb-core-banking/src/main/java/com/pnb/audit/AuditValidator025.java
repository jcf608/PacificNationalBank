package com.pnb.audit;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * AuditValidator025 — Business rule validation.
 */
@ApplicationScoped
public class AuditValidator025 {

    public List<String> validate(AuditDto025 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("audit DTO must not be null");
            return errors;
        }
        if (dto.getAudiField000() != null && dto.getAudiField000().isBlank()) {
            errors.add("audiField000 must not be blank if provided");
        }
        if (dto.getAudiField006() != null && dto.getAudiField006() < 0) {
            errors.add("audiField006 must not be negative");
        }
        if (dto.getAudiField007() != null && dto.getAudiField007().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("audiField007 must not be negative");
        }
        if (dto.getAudiField008() != null && dto.getAudiField008().isBlank()) {
            errors.add("audiField008 must not be blank if provided");
        }
        return errors;
    }
}
