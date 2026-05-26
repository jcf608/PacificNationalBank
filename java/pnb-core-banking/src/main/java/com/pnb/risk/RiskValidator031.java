package com.pnb.risk;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * RiskValidator031 — Business rule validation.
 */
@ApplicationScoped
public class RiskValidator031 {

    public List<String> validate(RiskDto031 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("risk DTO must not be null");
            return errors;
        }
        if (dto.getRiskField000() != null && dto.getRiskField000().isBlank()) {
            errors.add("riskField000 must not be blank if provided");
        }
        if (dto.getRiskField002() != null && dto.getRiskField002().isBlank()) {
            errors.add("riskField002 must not be blank if provided");
        }
        if (dto.getRiskField003() != null && dto.getRiskField003().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("riskField003 must not be negative");
        }
        if (dto.getRiskField007() != null && dto.getRiskField007() < 0) {
            errors.add("riskField007 must not be negative");
        }
        if (dto.getRiskField009() != null && dto.getRiskField009() < 0) {
            errors.add("riskField009 must not be negative");
        }
        if (dto.getRiskField010() != null && dto.getRiskField010() < 0) {
            errors.add("riskField010 must not be negative");
        }
        if (dto.getRiskField011() != null && dto.getRiskField011().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("riskField011 must not be negative");
        }
        if (dto.getRiskField012() != null && dto.getRiskField012().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("riskField012 must not be negative");
        }
        if (dto.getRiskField013() != null && dto.getRiskField013() < 0) {
            errors.add("riskField013 must not be negative");
        }
        return errors;
    }
}
