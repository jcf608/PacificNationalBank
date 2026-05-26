package com.pnb.audit;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * AuditValidator040 — Business rule validation.
 */
@ApplicationScoped
public class AuditValidator040 {

    public List<String> validate(AuditDto040 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("audit DTO must not be null");
            return errors;
        }
        if (dto.getAudiField000() != null && dto.getAudiField000().isBlank()) {
            errors.add("audiField000 must not be blank if provided");
        }
        if (dto.getAudiField002() != null && dto.getAudiField002().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("audiField002 must not be negative");
        }
        if (dto.getAudiField006() != null && dto.getAudiField006().isBlank()) {
            errors.add("audiField006 must not be blank if provided");
        }
        if (dto.getAudiField008() != null && dto.getAudiField008() < 0) {
            errors.add("audiField008 must not be negative");
        }
        if (dto.getAudiField009() != null && dto.getAudiField009() < 0) {
            errors.add("audiField009 must not be negative");
        }
        if (dto.getAudiField011() != null && dto.getAudiField011().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("audiField011 must not be negative");
        }
        return errors;
    }
}
