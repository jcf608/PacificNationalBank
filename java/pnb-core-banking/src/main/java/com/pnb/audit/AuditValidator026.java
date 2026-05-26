package com.pnb.audit;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * AuditValidator026 — Business rule validation.
 */
@ApplicationScoped
public class AuditValidator026 {

    public List<String> validate(AuditDto026 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("audit DTO must not be null");
            return errors;
        }
        if (dto.getAudiField002() != null && dto.getAudiField002().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("audiField002 must not be negative");
        }
        if (dto.getAudiField003() != null && dto.getAudiField003() < 0) {
            errors.add("audiField003 must not be negative");
        }
        if (dto.getAudiField005() != null && dto.getAudiField005().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("audiField005 must not be negative");
        }
        if (dto.getAudiField006() != null && dto.getAudiField006().isBlank()) {
            errors.add("audiField006 must not be blank if provided");
        }
        if (dto.getAudiField007() != null && dto.getAudiField007() < 0) {
            errors.add("audiField007 must not be negative");
        }
        return errors;
    }
}
