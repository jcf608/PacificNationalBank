package com.pnb.risk;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * RiskValidator023 — Business rule validation.
 */
@ApplicationScoped
public class RiskValidator023 {

    public List<String> validate(RiskDto023 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("risk DTO must not be null");
            return errors;
        }
        if (dto.getRiskField003() != null && dto.getRiskField003() < 0) {
            errors.add("riskField003 must not be negative");
        }
        if (dto.getRiskField004() != null && dto.getRiskField004() < 0) {
            errors.add("riskField004 must not be negative");
        }
        if (dto.getRiskField005() != null && dto.getRiskField005().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("riskField005 must not be negative");
        }
        if (dto.getRiskField006() != null && dto.getRiskField006() < 0) {
            errors.add("riskField006 must not be negative");
        }
        if (dto.getRiskField007() != null && dto.getRiskField007().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("riskField007 must not be negative");
        }
        if (dto.getRiskField008() != null && dto.getRiskField008().isBlank()) {
            errors.add("riskField008 must not be blank if provided");
        }
        if (dto.getRiskField010() != null && dto.getRiskField010().isBlank()) {
            errors.add("riskField010 must not be blank if provided");
        }
        if (dto.getRiskField012() != null && dto.getRiskField012() < 0) {
            errors.add("riskField012 must not be negative");
        }
        if (dto.getRiskField013() != null && dto.getRiskField013().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("riskField013 must not be negative");
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
