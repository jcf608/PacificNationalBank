package com.pnb.audit;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * AuditValidator031 — Business rule validation.
 */
@ApplicationScoped
public class AuditValidator031 {

    public List<String> validate(AuditDto031 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("audit DTO must not be null");
            return errors;
        }
        if (dto.getAudiField002() != null && dto.getAudiField002().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("audiField002 must not be negative");
        }
        if (dto.getAudiField004() != null && dto.getAudiField004().isBlank()) {
            errors.add("audiField004 must not be blank if provided");
        }
        if (dto.getAudiField005() != null && dto.getAudiField005().isBlank()) {
            errors.add("audiField005 must not be blank if provided");
        }
        if (dto.getAudiField007() != null && dto.getAudiField007().isBlank()) {
            errors.add("audiField007 must not be blank if provided");
        }
        if (dto.getAudiField009() != null && dto.getAudiField009().isBlank()) {
            errors.add("audiField009 must not be blank if provided");
        }
        if (dto.getAudiField011() != null && dto.getAudiField011() < 0) {
            errors.add("audiField011 must not be negative");
        }
        if (dto.getAudiField012() != null && dto.getAudiField012().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("audiField012 must not be negative");
        }
        if (dto.getAudiField013() != null && dto.getAudiField013().isBlank()) {
            errors.add("audiField013 must not be blank if provided");
        }
        if (dto.getAudiField014() != null && dto.getAudiField014().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("audiField014 must not be negative");
        }
        return errors;
    }
}
