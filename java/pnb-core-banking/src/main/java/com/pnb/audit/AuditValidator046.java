package com.pnb.audit;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * AuditValidator046 — Business rule validation.
 */
@ApplicationScoped
public class AuditValidator046 {

    public List<String> validate(AuditDto046 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("audit DTO must not be null");
            return errors;
        }
        if (dto.getAudiField011() != null && dto.getAudiField011().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("audiField011 must not be negative");
        }
        if (dto.getAudiField012() != null && dto.getAudiField012() < 0) {
            errors.add("audiField012 must not be negative");
        }
        if (dto.getAudiField014() != null && dto.getAudiField014().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("audiField014 must not be negative");
        }
        if (dto.getAudiField016() != null && dto.getAudiField016().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("audiField016 must not be negative");
        }
        if (dto.getAudiField017() != null && dto.getAudiField017().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("audiField017 must not be negative");
        }
        return errors;
    }
}
