package com.pnb.risk;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * RiskValidator042 — Business rule validation.
 */
@ApplicationScoped
public class RiskValidator042 {

    public List<String> validate(RiskDto042 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("risk DTO must not be null");
            return errors;
        }
        if (dto.getRiskField005() != null && dto.getRiskField005().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("riskField005 must not be negative");
        }
        if (dto.getRiskField006() != null && dto.getRiskField006().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("riskField006 must not be negative");
        }
        if (dto.getRiskField010() != null && dto.getRiskField010().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("riskField010 must not be negative");
        }
        if (dto.getRiskField011() != null && dto.getRiskField011().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("riskField011 must not be negative");
        }
        if (dto.getRiskField013() != null && dto.getRiskField013() < 0) {
            errors.add("riskField013 must not be negative");
        }
        return errors;
    }
}
