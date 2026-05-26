package com.pnb.risk;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * RiskValidator024 — Business rule validation.
 */
@ApplicationScoped
public class RiskValidator024 {

    public List<String> validate(RiskDto024 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("risk DTO must not be null");
            return errors;
        }
        if (dto.getRiskField000() != null && dto.getRiskField000().isBlank()) {
            errors.add("riskField000 must not be blank if provided");
        }
        if (dto.getRiskField002() != null && dto.getRiskField002().isBlank()) {
            errors.add("riskField002 must not be blank if provided");
        }
        if (dto.getRiskField003() != null && dto.getRiskField003().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("riskField003 must not be negative");
        }
        if (dto.getRiskField004() != null && dto.getRiskField004() < 0) {
            errors.add("riskField004 must not be negative");
        }
        if (dto.getRiskField005() != null && dto.getRiskField005() < 0) {
            errors.add("riskField005 must not be negative");
        }
        if (dto.getRiskField006() != null && dto.getRiskField006().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("riskField006 must not be negative");
        }
        if (dto.getRiskField007() != null && dto.getRiskField007().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("riskField007 must not be negative");
        }
        return errors;
    }
}
