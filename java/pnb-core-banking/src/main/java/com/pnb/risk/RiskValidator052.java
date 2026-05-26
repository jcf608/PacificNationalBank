package com.pnb.risk;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * RiskValidator052 — Business rule validation.
 */
@ApplicationScoped
public class RiskValidator052 {

    public List<String> validate(RiskDto052 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("risk DTO must not be null");
            return errors;
        }
        if (dto.getRiskField000() != null && dto.getRiskField000().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("riskField000 must not be negative");
        }
        if (dto.getRiskField005() != null && dto.getRiskField005().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("riskField005 must not be negative");
        }
        if (dto.getRiskField008() != null && dto.getRiskField008().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("riskField008 must not be negative");
        }
        if (dto.getRiskField010() != null && dto.getRiskField010() < 0) {
            errors.add("riskField010 must not be negative");
        }
        if (dto.getRiskField011() != null && dto.getRiskField011().isBlank()) {
            errors.add("riskField011 must not be blank if provided");
        }
        return errors;
    }
}
