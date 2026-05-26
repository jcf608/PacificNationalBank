package com.pnb.audit;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * AuditValidator052 — Business rule validation.
 */
@ApplicationScoped
public class AuditValidator052 {

    public List<String> validate(AuditDto052 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("audit DTO must not be null");
            return errors;
        }
        if (dto.getAudiField000() != null && dto.getAudiField000().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("audiField000 must not be negative");
        }
        if (dto.getAudiField002() != null && dto.getAudiField002().isBlank()) {
            errors.add("audiField002 must not be blank if provided");
        }
        if (dto.getAudiField004() != null && dto.getAudiField004() < 0) {
            errors.add("audiField004 must not be negative");
        }
        if (dto.getAudiField005() != null && dto.getAudiField005() < 0) {
            errors.add("audiField005 must not be negative");
        }
        return errors;
    }
}
