package com.pnb.risk;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * RiskValidator032 — Business rule validation.
 */
@ApplicationScoped
public class RiskValidator032 {

    public List<String> validate(RiskDto032 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("risk DTO must not be null");
            return errors;
        }
        if (dto.getRiskField009() != null && dto.getRiskField009() < 0) {
            errors.add("riskField009 must not be negative");
        }
        if (dto.getRiskField010() != null && dto.getRiskField010().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("riskField010 must not be negative");
        }
        if (dto.getRiskField011() != null && dto.getRiskField011() < 0) {
            errors.add("riskField011 must not be negative");
        }
        if (dto.getRiskField012() != null && dto.getRiskField012().isBlank()) {
            errors.add("riskField012 must not be blank if provided");
        }
        if (dto.getRiskField013() != null && dto.getRiskField013().isBlank()) {
            errors.add("riskField013 must not be blank if provided");
        }
        if (dto.getRiskField015() != null && dto.getRiskField015().isBlank()) {
            errors.add("riskField015 must not be blank if provided");
        }
        return errors;
    }
}
