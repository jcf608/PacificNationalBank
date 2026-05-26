package com.pnb.risk;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * RiskValidator055 — Business rule validation.
 */
@ApplicationScoped
public class RiskValidator055 {

    public List<String> validate(RiskDto055 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("risk DTO must not be null");
            return errors;
        }
        if (dto.getRiskField000() != null && dto.getRiskField000().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("riskField000 must not be negative");
        }
        if (dto.getRiskField002() != null && dto.getRiskField002() < 0) {
            errors.add("riskField002 must not be negative");
        }
        if (dto.getRiskField005() != null && dto.getRiskField005().isBlank()) {
            errors.add("riskField005 must not be blank if provided");
        }
        if (dto.getRiskField006() != null && dto.getRiskField006() < 0) {
            errors.add("riskField006 must not be negative");
        }
        if (dto.getRiskField007() != null && dto.getRiskField007().isBlank()) {
            errors.add("riskField007 must not be blank if provided");
        }
        if (dto.getRiskField010() != null && dto.getRiskField010() < 0) {
            errors.add("riskField010 must not be negative");
        }
        if (dto.getRiskField012() != null && dto.getRiskField012().isBlank()) {
            errors.add("riskField012 must not be blank if provided");
        }
        if (dto.getRiskField013() != null && dto.getRiskField013().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("riskField013 must not be negative");
        }
        if (dto.getRiskField014() != null && dto.getRiskField014().isBlank()) {
            errors.add("riskField014 must not be blank if provided");
        }
        return errors;
    }
}
