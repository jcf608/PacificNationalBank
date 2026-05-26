package com.pnb.audit;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * AuditValidator036 — Business rule validation.
 */
@ApplicationScoped
public class AuditValidator036 {

    public List<String> validate(AuditDto036 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("audit DTO must not be null");
            return errors;
        }
        if (dto.getAudiField005() != null && dto.getAudiField005().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("audiField005 must not be negative");
        }
        if (dto.getAudiField006() != null && dto.getAudiField006().isBlank()) {
            errors.add("audiField006 must not be blank if provided");
        }
        if (dto.getAudiField007() != null && dto.getAudiField007().isBlank()) {
            errors.add("audiField007 must not be blank if provided");
        }
        return errors;
    }
}
