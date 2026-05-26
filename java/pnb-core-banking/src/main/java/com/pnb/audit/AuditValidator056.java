package com.pnb.audit;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * AuditValidator056 — Business rule validation.
 */
@ApplicationScoped
public class AuditValidator056 {

    public List<String> validate(AuditDto056 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("audit DTO must not be null");
            return errors;
        }
        if (dto.getAudiField004() != null && dto.getAudiField004() < 0) {
            errors.add("audiField004 must not be negative");
        }
        if (dto.getAudiField008() != null && dto.getAudiField008().isBlank()) {
            errors.add("audiField008 must not be blank if provided");
        }
        if (dto.getAudiField010() != null && dto.getAudiField010() < 0) {
            errors.add("audiField010 must not be negative");
        }
        if (dto.getAudiField011() != null && dto.getAudiField011().isBlank()) {
            errors.add("audiField011 must not be blank if provided");
        }
        if (dto.getAudiField015() != null && dto.getAudiField015().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("audiField015 must not be negative");
        }
        return errors;
    }
}
