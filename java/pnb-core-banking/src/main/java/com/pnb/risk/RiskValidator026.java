package com.pnb.risk;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * RiskValidator026 — Business rule validation.
 */
@ApplicationScoped
public class RiskValidator026 {

    public List<String> validate(RiskDto026 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("risk DTO must not be null");
            return errors;
        }
        if (dto.getRiskField001() != null && dto.getRiskField001() < 0) {
            errors.add("riskField001 must not be negative");
        }
        if (dto.getRiskField002() != null && dto.getRiskField002() < 0) {
            errors.add("riskField002 must not be negative");
        }
        if (dto.getRiskField004() != null && dto.getRiskField004().isBlank()) {
            errors.add("riskField004 must not be blank if provided");
        }
        if (dto.getRiskField006() != null && dto.getRiskField006().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("riskField006 must not be negative");
        }
        if (dto.getRiskField007() != null && dto.getRiskField007() < 0) {
            errors.add("riskField007 must not be negative");
        }
        if (dto.getRiskField008() != null && dto.getRiskField008() < 0) {
            errors.add("riskField008 must not be negative");
        }
        return errors;
    }
}
