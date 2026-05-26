package com.pnb.audit;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * AuditValidator059 — Business rule validation.
 */
@ApplicationScoped
public class AuditValidator059 {

    public List<String> validate(AuditDto059 dto) {
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
        if (dto.getAudiField005() != null && dto.getAudiField005() < 0) {
            errors.add("audiField005 must not be negative");
        }
        if (dto.getAudiField006() != null && dto.getAudiField006().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("audiField006 must not be negative");
        }
        if (dto.getAudiField008() != null && dto.getAudiField008().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("audiField008 must not be negative");
        }
        if (dto.getAudiField009() != null && dto.getAudiField009().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("audiField009 must not be negative");
        }
        if (dto.getAudiField014() != null && dto.getAudiField014().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("audiField014 must not be negative");
        }
        if (dto.getAudiField015() != null && dto.getAudiField015().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("audiField015 must not be negative");
        }
        if (dto.getAudiField016() != null && dto.getAudiField016().isBlank()) {
            errors.add("audiField016 must not be blank if provided");
        }
        return errors;
    }
}
