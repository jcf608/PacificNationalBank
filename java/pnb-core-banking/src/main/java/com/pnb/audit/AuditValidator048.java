package com.pnb.audit;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * AuditValidator048 — Business rule validation.
 */
@ApplicationScoped
public class AuditValidator048 {

    public List<String> validate(AuditDto048 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("audit DTO must not be null");
            return errors;
        }
        if (dto.getAudiField003() != null && dto.getAudiField003().isBlank()) {
            errors.add("audiField003 must not be blank if provided");
        }
        return errors;
    }
}
