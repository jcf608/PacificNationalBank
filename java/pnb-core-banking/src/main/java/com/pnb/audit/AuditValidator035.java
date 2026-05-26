package com.pnb.audit;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * AuditValidator035 — Business rule validation.
 */
@ApplicationScoped
public class AuditValidator035 {

    public List<String> validate(AuditDto035 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("audit DTO must not be null");
            return errors;
        }
        if (dto.getAudiField001() != null && dto.getAudiField001().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("audiField001 must not be negative");
        }
        if (dto.getAudiField003() != null && dto.getAudiField003() < 0) {
            errors.add("audiField003 must not be negative");
        }
        if (dto.getAudiField005() != null && dto.getAudiField005().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("audiField005 must not be negative");
        }
        if (dto.getAudiField006() != null && dto.getAudiField006().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("audiField006 must not be negative");
        }
        if (dto.getAudiField007() != null && dto.getAudiField007().isBlank()) {
            errors.add("audiField007 must not be blank if provided");
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
        if (dto.getAudiField014() != null && dto.getAudiField014().isBlank()) {
            errors.add("audiField014 must not be blank if provided");
        }
        if (dto.getAudiField018() != null && dto.getAudiField018().isBlank()) {
            errors.add("audiField018 must not be blank if provided");
        }
        return errors;
    }
}
