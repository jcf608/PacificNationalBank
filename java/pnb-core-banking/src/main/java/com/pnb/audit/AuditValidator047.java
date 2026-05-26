package com.pnb.audit;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * AuditValidator047 — Business rule validation.
 */
@ApplicationScoped
public class AuditValidator047 {

    public List<String> validate(AuditDto047 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("audit DTO must not be null");
            return errors;
        }
        if (dto.getAudiField001() != null && dto.getAudiField001() < 0) {
            errors.add("audiField001 must not be negative");
        }
        if (dto.getAudiField002() != null && dto.getAudiField002().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("audiField002 must not be negative");
        }
        if (dto.getAudiField003() != null && dto.getAudiField003().isBlank()) {
            errors.add("audiField003 must not be blank if provided");
        }
        if (dto.getAudiField006() != null && dto.getAudiField006() < 0) {
            errors.add("audiField006 must not be negative");
        }
        if (dto.getAudiField010() != null && dto.getAudiField010().isBlank()) {
            errors.add("audiField010 must not be blank if provided");
        }
        if (dto.getAudiField014() != null && dto.getAudiField014() < 0) {
            errors.add("audiField014 must not be negative");
        }
        if (dto.getAudiField016() != null && dto.getAudiField016() < 0) {
            errors.add("audiField016 must not be negative");
        }
        if (dto.getAudiField018() != null && dto.getAudiField018().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("audiField018 must not be negative");
        }
        return errors;
    }
}
