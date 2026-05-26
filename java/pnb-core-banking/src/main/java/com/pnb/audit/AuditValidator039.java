package com.pnb.audit;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * AuditValidator039 — Business rule validation.
 */
@ApplicationScoped
public class AuditValidator039 {

    public List<String> validate(AuditDto039 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("audit DTO must not be null");
            return errors;
        }
        if (dto.getAudiField000() != null && dto.getAudiField000() < 0) {
            errors.add("audiField000 must not be negative");
        }
        if (dto.getAudiField001() != null && dto.getAudiField001().isBlank()) {
            errors.add("audiField001 must not be blank if provided");
        }
        return errors;
    }
}
