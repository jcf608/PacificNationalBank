package com.pnb.audit;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * AuditValidator037 — Business rule validation.
 */
@ApplicationScoped
public class AuditValidator037 {

    public List<String> validate(AuditDto037 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("audit DTO must not be null");
            return errors;
        }
        if (dto.getAudiField006() != null && dto.getAudiField006() < 0) {
            errors.add("audiField006 must not be negative");
        }
        return errors;
    }
}
