package com.pnb.audit;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * AuditValidator044 — Business rule validation.
 */
@ApplicationScoped
public class AuditValidator044 {

    public List<String> validate(AuditDto044 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("audit DTO must not be null");
            return errors;
        }
        if (dto.getAudiField000() != null && dto.getAudiField000().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("audiField000 must not be negative");
        }
        if (dto.getAudiField001() != null && dto.getAudiField001().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("audiField001 must not be negative");
        }
        if (dto.getAudiField008() != null && dto.getAudiField008().isBlank()) {
            errors.add("audiField008 must not be blank if provided");
        }
        if (dto.getAudiField009() != null && dto.getAudiField009() < 0) {
            errors.add("audiField009 must not be negative");
        }
        if (dto.getAudiField010() != null && dto.getAudiField010().isBlank()) {
            errors.add("audiField010 must not be blank if provided");
        }
        if (dto.getAudiField012() != null && dto.getAudiField012().isBlank()) {
            errors.add("audiField012 must not be blank if provided");
        }
        if (dto.getAudiField013() != null && dto.getAudiField013() < 0) {
            errors.add("audiField013 must not be negative");
        }
        if (dto.getAudiField014() != null && dto.getAudiField014() < 0) {
            errors.add("audiField014 must not be negative");
        }
        return errors;
    }
}
