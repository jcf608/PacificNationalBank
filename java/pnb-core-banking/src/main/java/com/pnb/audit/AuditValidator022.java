package com.pnb.audit;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * AuditValidator022 — Business rule validation.
 */
@ApplicationScoped
public class AuditValidator022 {

    public List<String> validate(AuditDto022 dto) {
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
        if (dto.getAudiField008() != null && dto.getAudiField008().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("audiField008 must not be negative");
        }
        if (dto.getAudiField010() != null && dto.getAudiField010().isBlank()) {
            errors.add("audiField010 must not be blank if provided");
        }
        if (dto.getAudiField013() != null && dto.getAudiField013() < 0) {
            errors.add("audiField013 must not be negative");
        }
        if (dto.getAudiField015() != null && dto.getAudiField015().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("audiField015 must not be negative");
        }
        return errors;
    }
}
