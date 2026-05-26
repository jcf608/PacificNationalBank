package com.pnb.risk;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * RiskValidator022 — Business rule validation.
 */
@ApplicationScoped
public class RiskValidator022 {

    public List<String> validate(RiskDto022 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("risk DTO must not be null");
            return errors;
        }
        if (dto.getRiskField000() != null && dto.getRiskField000() < 0) {
            errors.add("riskField000 must not be negative");
        }
        if (dto.getRiskField003() != null && dto.getRiskField003().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("riskField003 must not be negative");
        }
        if (dto.getRiskField007() != null && dto.getRiskField007() < 0) {
            errors.add("riskField007 must not be negative");
        }
        if (dto.getRiskField008() != null && dto.getRiskField008().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("riskField008 must not be negative");
        }
        if (dto.getRiskField009() != null && dto.getRiskField009() < 0) {
            errors.add("riskField009 must not be negative");
        }
        if (dto.getRiskField014() != null && dto.getRiskField014() < 0) {
            errors.add("riskField014 must not be negative");
        }
        if (dto.getRiskField017() != null && dto.getRiskField017() < 0) {
            errors.add("riskField017 must not be negative");
        }
        return errors;
    }
}
