package com.pnb.risk;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * RiskValidator053 — Business rule validation.
 */
@ApplicationScoped
public class RiskValidator053 {

    public List<String> validate(RiskDto053 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("risk DTO must not be null");
            return errors;
        }
        if (dto.getRiskField003() != null && dto.getRiskField003().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("riskField003 must not be negative");
        }
        if (dto.getRiskField006() != null && dto.getRiskField006().isBlank()) {
            errors.add("riskField006 must not be blank if provided");
        }
        if (dto.getRiskField007() != null && dto.getRiskField007() < 0) {
            errors.add("riskField007 must not be negative");
        }
        if (dto.getRiskField008() != null && dto.getRiskField008().isBlank()) {
            errors.add("riskField008 must not be blank if provided");
        }
        if (dto.getRiskField009() != null && dto.getRiskField009() < 0) {
            errors.add("riskField009 must not be negative");
        }
        if (dto.getRiskField011() != null && dto.getRiskField011() < 0) {
            errors.add("riskField011 must not be negative");
        }
        if (dto.getRiskField012() != null && dto.getRiskField012() < 0) {
            errors.add("riskField012 must not be negative");
        }
        return errors;
    }
}
