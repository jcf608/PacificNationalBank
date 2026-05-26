package com.pnb.audit;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * AuditValidator050 — Business rule validation.
 */
@ApplicationScoped
public class AuditValidator050 {

    public List<String> validate(AuditDto050 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("audit DTO must not be null");
            return errors;
        }
        if (dto.getAudiField002() != null && dto.getAudiField002().isBlank()) {
            errors.add("audiField002 must not be blank if provided");
        }
        if (dto.getAudiField005() != null && dto.getAudiField005() < 0) {
            errors.add("audiField005 must not be negative");
        }
        if (dto.getAudiField008() != null && dto.getAudiField008().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("audiField008 must not be negative");
        }
        return errors;
    }
}
