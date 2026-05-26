package com.pnb.audit;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * AuditValidator055 — Business rule validation.
 */
@ApplicationScoped
public class AuditValidator055 {

    public List<String> validate(AuditDto055 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("audit DTO must not be null");
            return errors;
        }
        if (dto.getAudiField000() != null && dto.getAudiField000().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("audiField000 must not be negative");
        }
        if (dto.getAudiField008() != null && dto.getAudiField008() < 0) {
            errors.add("audiField008 must not be negative");
        }
        if (dto.getAudiField012() != null && dto.getAudiField012() < 0) {
            errors.add("audiField012 must not be negative");
        }
        return errors;
    }
}
