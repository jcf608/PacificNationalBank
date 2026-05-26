package com.pnb.risk;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * RiskValidator020 — Business rule validation.
 */
@ApplicationScoped
public class RiskValidator020 {

    public List<String> validate(RiskDto020 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("risk DTO must not be null");
            return errors;
        }
        if (dto.getRiskField000() != null && dto.getRiskField000().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("riskField000 must not be negative");
        }
        if (dto.getRiskField001() != null && dto.getRiskField001().isBlank()) {
            errors.add("riskField001 must not be blank if provided");
        }
        if (dto.getRiskField003() != null && dto.getRiskField003() < 0) {
            errors.add("riskField003 must not be negative");
        }
        if (dto.getRiskField005() != null && dto.getRiskField005().isBlank()) {
            errors.add("riskField005 must not be blank if provided");
        }
        if (dto.getRiskField007() != null && dto.getRiskField007() < 0) {
            errors.add("riskField007 must not be negative");
        }
        if (dto.getRiskField009() != null && dto.getRiskField009().isBlank()) {
            errors.add("riskField009 must not be blank if provided");
        }
        if (dto.getRiskField010() != null && dto.getRiskField010().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("riskField010 must not be negative");
        }
        if (dto.getRiskField012() != null && dto.getRiskField012().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("riskField012 must not be negative");
        }
        return errors;
    }
}
