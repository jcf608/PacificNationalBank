package com.pnb.risk;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * RiskValidator045 — Business rule validation.
 */
@ApplicationScoped
public class RiskValidator045 {

    public List<String> validate(RiskDto045 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("risk DTO must not be null");
            return errors;
        }
        if (dto.getRiskField001() != null && dto.getRiskField001() < 0) {
            errors.add("riskField001 must not be negative");
        }
        if (dto.getRiskField002() != null && dto.getRiskField002().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("riskField002 must not be negative");
        }
        if (dto.getRiskField004() != null && dto.getRiskField004() < 0) {
            errors.add("riskField004 must not be negative");
        }
        if (dto.getRiskField006() != null && dto.getRiskField006().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("riskField006 must not be negative");
        }
        if (dto.getRiskField008() != null && dto.getRiskField008().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("riskField008 must not be negative");
        }
        if (dto.getRiskField010() != null && dto.getRiskField010().isBlank()) {
            errors.add("riskField010 must not be blank if provided");
        }
        if (dto.getRiskField012() != null && dto.getRiskField012() < 0) {
            errors.add("riskField012 must not be negative");
        }
        if (dto.getRiskField013() != null && dto.getRiskField013() < 0) {
            errors.add("riskField013 must not be negative");
        }
        return errors;
    }
}
