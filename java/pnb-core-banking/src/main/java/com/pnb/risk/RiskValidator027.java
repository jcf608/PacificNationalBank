package com.pnb.risk;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * RiskValidator027 — Business rule validation.
 */
@ApplicationScoped
public class RiskValidator027 {

    public List<String> validate(RiskDto027 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("risk DTO must not be null");
            return errors;
        }
        if (dto.getRiskField000() != null && dto.getRiskField000().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("riskField000 must not be negative");
        }
        if (dto.getRiskField002() != null && dto.getRiskField002().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("riskField002 must not be negative");
        }
        if (dto.getRiskField003() != null && dto.getRiskField003().isBlank()) {
            errors.add("riskField003 must not be blank if provided");
        }
        if (dto.getRiskField006() != null && dto.getRiskField006().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("riskField006 must not be negative");
        }
        if (dto.getRiskField007() != null && dto.getRiskField007() < 0) {
            errors.add("riskField007 must not be negative");
        }
        if (dto.getRiskField008() != null && dto.getRiskField008().isBlank()) {
            errors.add("riskField008 must not be blank if provided");
        }
        if (dto.getRiskField010() != null && dto.getRiskField010() < 0) {
            errors.add("riskField010 must not be negative");
        }
        return errors;
    }
}
