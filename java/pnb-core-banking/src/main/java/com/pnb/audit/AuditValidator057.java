package com.pnb.audit;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * AuditValidator057 — Business rule validation.
 */
@ApplicationScoped
public class AuditValidator057 {

    public List<String> validate(AuditDto057 dto) {
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
        if (dto.getAudiField006() != null && dto.getAudiField006() < 0) {
            errors.add("audiField006 must not be negative");
        }
        if (dto.getAudiField009() != null && dto.getAudiField009().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("audiField009 must not be negative");
        }
        if (dto.getAudiField010() != null && dto.getAudiField010().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("audiField010 must not be negative");
        }
        if (dto.getAudiField012() != null && dto.getAudiField012() < 0) {
            errors.add("audiField012 must not be negative");
        }
        if (dto.getAudiField015() != null && dto.getAudiField015().isBlank()) {
            errors.add("audiField015 must not be blank if provided");
        }
        return errors;
    }
}
