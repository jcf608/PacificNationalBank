package com.pnb.risk;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * RiskValidator058 — Business rule validation.
 */
@ApplicationScoped
public class RiskValidator058 {

    public List<String> validate(RiskDto058 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("risk DTO must not be null");
            return errors;
        }
        if (dto.getRiskField003() != null && dto.getRiskField003() < 0) {
            errors.add("riskField003 must not be negative");
        }
        if (dto.getRiskField004() != null && dto.getRiskField004().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("riskField004 must not be negative");
        }
        if (dto.getRiskField006() != null && dto.getRiskField006() < 0) {
            errors.add("riskField006 must not be negative");
        }
        if (dto.getRiskField008() != null && dto.getRiskField008().isBlank()) {
            errors.add("riskField008 must not be blank if provided");
        }
        if (dto.getRiskField013() != null && dto.getRiskField013().isBlank()) {
            errors.add("riskField013 must not be blank if provided");
        }
        if (dto.getRiskField017() != null && dto.getRiskField017().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("riskField017 must not be negative");
        }
        return errors;
    }
}
