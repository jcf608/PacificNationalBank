package com.pnb.risk;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * RiskValidator059 — Business rule validation.
 */
@ApplicationScoped
public class RiskValidator059 {

    public List<String> validate(RiskDto059 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("risk DTO must not be null");
            return errors;
        }
        if (dto.getRiskField000() != null && dto.getRiskField000().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("riskField000 must not be negative");
        }
        if (dto.getRiskField003() != null && dto.getRiskField003().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("riskField003 must not be negative");
        }
        if (dto.getRiskField010() != null && dto.getRiskField010() < 0) {
            errors.add("riskField010 must not be negative");
        }
        if (dto.getRiskField012() != null && dto.getRiskField012().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("riskField012 must not be negative");
        }
        if (dto.getRiskField014() != null && dto.getRiskField014().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("riskField014 must not be negative");
        }
        if (dto.getRiskField015() != null && dto.getRiskField015().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("riskField015 must not be negative");
        }
        if (dto.getRiskField016() != null && dto.getRiskField016().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("riskField016 must not be negative");
        }
        if (dto.getRiskField018() != null && dto.getRiskField018().isBlank()) {
            errors.add("riskField018 must not be blank if provided");
        }
        return errors;
    }
}
