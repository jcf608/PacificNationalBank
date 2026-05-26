package com.pnb.audit;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * AuditValidator042 — Business rule validation.
 */
@ApplicationScoped
public class AuditValidator042 {

    public List<String> validate(AuditDto042 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("audit DTO must not be null");
            return errors;
        }
        if (dto.getAudiField004() != null && dto.getAudiField004().isBlank()) {
            errors.add("audiField004 must not be blank if provided");
        }
        if (dto.getAudiField005() != null && dto.getAudiField005().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("audiField005 must not be negative");
        }
        if (dto.getAudiField007() != null && dto.getAudiField007().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("audiField007 must not be negative");
        }
        if (dto.getAudiField008() != null && dto.getAudiField008().isBlank()) {
            errors.add("audiField008 must not be blank if provided");
        }
        if (dto.getAudiField009() != null && dto.getAudiField009() < 0) {
            errors.add("audiField009 must not be negative");
        }
        if (dto.getAudiField012() != null && dto.getAudiField012().isBlank()) {
            errors.add("audiField012 must not be blank if provided");
        }
        return errors;
    }
}
