package com.pnb.audit;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * AuditValidator027 — Business rule validation.
 */
@ApplicationScoped
public class AuditValidator027 {

    public List<String> validate(AuditDto027 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("audit DTO must not be null");
            return errors;
        }
        if (dto.getAudiField002() != null && dto.getAudiField002().isBlank()) {
            errors.add("audiField002 must not be blank if provided");
        }
        if (dto.getAudiField004() != null && dto.getAudiField004().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("audiField004 must not be negative");
        }
        if (dto.getAudiField005() != null && dto.getAudiField005() < 0) {
            errors.add("audiField005 must not be negative");
        }
        if (dto.getAudiField006() != null && dto.getAudiField006() < 0) {
            errors.add("audiField006 must not be negative");
        }
        if (dto.getAudiField007() != null && dto.getAudiField007() < 0) {
            errors.add("audiField007 must not be negative");
        }
        if (dto.getAudiField010() != null && dto.getAudiField010() < 0) {
            errors.add("audiField010 must not be negative");
        }
        return errors;
    }
}
