package com.pnb.audit;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * AuditValidator041 — Business rule validation.
 */
@ApplicationScoped
public class AuditValidator041 {

    public List<String> validate(AuditDto041 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("audit DTO must not be null");
            return errors;
        }
        if (dto.getAudiField000() != null && dto.getAudiField000() < 0) {
            errors.add("audiField000 must not be negative");
        }
        if (dto.getAudiField001() != null && dto.getAudiField001() < 0) {
            errors.add("audiField001 must not be negative");
        }
        if (dto.getAudiField002() != null && dto.getAudiField002() < 0) {
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
        if (dto.getAudiField008() != null && dto.getAudiField008().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("audiField008 must not be negative");
        }
        if (dto.getAudiField010() != null && dto.getAudiField010().isBlank()) {
            errors.add("audiField010 must not be blank if provided");
        }
        return errors;
    }
}
