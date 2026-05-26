package com.pnb.audit;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * AuditValidator053 — Business rule validation.
 */
@ApplicationScoped
public class AuditValidator053 {

    public List<String> validate(AuditDto053 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("audit DTO must not be null");
            return errors;
        }
        if (dto.getAudiField000() != null && dto.getAudiField000().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("audiField000 must not be negative");
        }
        if (dto.getAudiField001() != null && dto.getAudiField001().isBlank()) {
            errors.add("audiField001 must not be blank if provided");
        }
        if (dto.getAudiField012() != null && dto.getAudiField012().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("audiField012 must not be negative");
        }
        return errors;
    }
}
