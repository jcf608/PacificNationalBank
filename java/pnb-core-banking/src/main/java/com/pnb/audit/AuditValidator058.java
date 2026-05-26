package com.pnb.audit;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * AuditValidator058 — Business rule validation.
 */
@ApplicationScoped
public class AuditValidator058 {

    public List<String> validate(AuditDto058 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("audit DTO must not be null");
            return errors;
        }
        if (dto.getAudiField006() != null && dto.getAudiField006() < 0) {
            errors.add("audiField006 must not be negative");
        }
        if (dto.getAudiField008() != null && dto.getAudiField008().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("audiField008 must not be negative");
        }
        if (dto.getAudiField011() != null && dto.getAudiField011() < 0) {
            errors.add("audiField011 must not be negative");
        }
        if (dto.getAudiField012() != null && dto.getAudiField012().isBlank()) {
            errors.add("audiField012 must not be blank if provided");
        }
        if (dto.getAudiField013() != null && dto.getAudiField013() < 0) {
            errors.add("audiField013 must not be negative");
        }
        if (dto.getAudiField016() != null && dto.getAudiField016() < 0) {
            errors.add("audiField016 must not be negative");
        }
        if (dto.getAudiField017() != null && dto.getAudiField017() < 0) {
            errors.add("audiField017 must not be negative");
        }
        return errors;
    }
}
