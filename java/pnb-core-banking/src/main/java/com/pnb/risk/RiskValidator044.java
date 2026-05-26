package com.pnb.risk;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * RiskValidator044 — Business rule validation.
 */
@ApplicationScoped
public class RiskValidator044 {

    public List<String> validate(RiskDto044 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("risk DTO must not be null");
            return errors;
        }
        if (dto.getRiskField000() != null && dto.getRiskField000().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("riskField000 must not be negative");
        }
        if (dto.getRiskField001() != null && dto.getRiskField001().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("riskField001 must not be negative");
        }
        if (dto.getRiskField002() != null && dto.getRiskField002() < 0) {
            errors.add("riskField002 must not be negative");
        }
        if (dto.getRiskField004() != null && dto.getRiskField004() < 0) {
            errors.add("riskField004 must not be negative");
        }
        if (dto.getRiskField005() != null && dto.getRiskField005() < 0) {
            errors.add("riskField005 must not be negative");
        }
        if (dto.getRiskField006() != null && dto.getRiskField006().isBlank()) {
            errors.add("riskField006 must not be blank if provided");
        }
        if (dto.getRiskField010() != null && dto.getRiskField010().isBlank()) {
            errors.add("riskField010 must not be blank if provided");
        }
        if (dto.getRiskField014() != null && dto.getRiskField014().isBlank()) {
            errors.add("riskField014 must not be blank if provided");
        }
        if (dto.getRiskField015() != null && dto.getRiskField015().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("riskField015 must not be negative");
        }
        return errors;
    }
}
