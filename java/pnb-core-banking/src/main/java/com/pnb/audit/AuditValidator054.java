package com.pnb.audit;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * AuditValidator054 — Business rule validation.
 */
@ApplicationScoped
public class AuditValidator054 {

    public List<String> validate(AuditDto054 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("audit DTO must not be null");
            return errors;
        }
        if (dto.getAudiField001() != null && dto.getAudiField001() < 0) {
            errors.add("audiField001 must not be negative");
        }
        if (dto.getAudiField002() != null && dto.getAudiField002() < 0) {
            errors.add("audiField002 must not be negative");
        }
        if (dto.getAudiField006() != null && dto.getAudiField006().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("audiField006 must not be negative");
        }
        if (dto.getAudiField007() != null && dto.getAudiField007().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("audiField007 must not be negative");
        }
        if (dto.getAudiField010() != null && dto.getAudiField010() < 0) {
            errors.add("audiField010 must not be negative");
        }
        return errors;
    }
}
