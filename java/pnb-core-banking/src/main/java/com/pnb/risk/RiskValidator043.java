package com.pnb.risk;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * RiskValidator043 — Business rule validation.
 */
@ApplicationScoped
public class RiskValidator043 {

    public List<String> validate(RiskDto043 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("risk DTO must not be null");
            return errors;
        }
        if (dto.getRiskField002() != null && dto.getRiskField002().isBlank()) {
            errors.add("riskField002 must not be blank if provided");
        }
        if (dto.getRiskField003() != null && dto.getRiskField003() < 0) {
            errors.add("riskField003 must not be negative");
        }
        if (dto.getRiskField006() != null && dto.getRiskField006().isBlank()) {
            errors.add("riskField006 must not be blank if provided");
        }
        if (dto.getRiskField009() != null && dto.getRiskField009() < 0) {
            errors.add("riskField009 must not be negative");
        }
        if (dto.getRiskField011() != null && dto.getRiskField011().isBlank()) {
            errors.add("riskField011 must not be blank if provided");
        }
        if (dto.getRiskField012() != null && dto.getRiskField012().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("riskField012 must not be negative");
        }
        if (dto.getRiskField014() != null && dto.getRiskField014().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("riskField014 must not be negative");
        }
        return errors;
    }
}
