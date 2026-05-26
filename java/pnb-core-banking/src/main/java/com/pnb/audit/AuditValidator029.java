package com.pnb.audit;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * AuditValidator029 — Business rule validation.
 */
@ApplicationScoped
public class AuditValidator029 {

    public List<String> validate(AuditDto029 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("audit DTO must not be null");
            return errors;
        }
        if (dto.getAudiField003() != null && dto.getAudiField003() < 0) {
            errors.add("audiField003 must not be negative");
        }
        if (dto.getAudiField004() != null && dto.getAudiField004().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("audiField004 must not be negative");
        }
        if (dto.getAudiField008() != null && dto.getAudiField008().isBlank()) {
            errors.add("audiField008 must not be blank if provided");
        }
        if (dto.getAudiField011() != null && dto.getAudiField011().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("audiField011 must not be negative");
        }
        if (dto.getAudiField012() != null && dto.getAudiField012().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("audiField012 must not be negative");
        }
        return errors;
    }
}
