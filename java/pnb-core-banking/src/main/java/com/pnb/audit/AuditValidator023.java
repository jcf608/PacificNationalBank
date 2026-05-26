package com.pnb.audit;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * AuditValidator023 — Business rule validation.
 */
@ApplicationScoped
public class AuditValidator023 {

    public List<String> validate(AuditDto023 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("audit DTO must not be null");
            return errors;
        }
        if (dto.getAudiField002() != null && dto.getAudiField002().isBlank()) {
            errors.add("audiField002 must not be blank if provided");
        }
        if (dto.getAudiField007() != null && dto.getAudiField007().isBlank()) {
            errors.add("audiField007 must not be blank if provided");
        }
        if (dto.getAudiField016() != null && dto.getAudiField016().isBlank()) {
            errors.add("audiField016 must not be blank if provided");
        }
        if (dto.getAudiField017() != null && dto.getAudiField017().isBlank()) {
            errors.add("audiField017 must not be blank if provided");
        }
        return errors;
    }
}
