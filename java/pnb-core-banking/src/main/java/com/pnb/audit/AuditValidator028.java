package com.pnb.audit;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * AuditValidator028 — Business rule validation.
 */
@ApplicationScoped
public class AuditValidator028 {

    public List<String> validate(AuditDto028 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("audit DTO must not be null");
            return errors;
        }
        if (dto.getAudiField010() != null && dto.getAudiField010().isBlank()) {
            errors.add("audiField010 must not be blank if provided");
        }
        if (dto.getAudiField011() != null && dto.getAudiField011().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("audiField011 must not be negative");
        }
        return errors;
    }
}
