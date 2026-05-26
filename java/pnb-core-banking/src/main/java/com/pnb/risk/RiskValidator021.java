package com.pnb.risk;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * RiskValidator021 — Business rule validation.
 */
@ApplicationScoped
public class RiskValidator021 {

    public List<String> validate(RiskDto021 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("risk DTO must not be null");
            return errors;
        }
        if (dto.getRiskField002() != null && dto.getRiskField002().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("riskField002 must not be negative");
        }
        if (dto.getRiskField003() != null && dto.getRiskField003().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("riskField003 must not be negative");
        }
        if (dto.getRiskField004() != null && dto.getRiskField004().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("riskField004 must not be negative");
        }
        if (dto.getRiskField005() != null && dto.getRiskField005().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("riskField005 must not be negative");
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
        if (dto.getRiskField011() != null && dto.getRiskField011() < 0) {
            errors.add("riskField011 must not be negative");
        }
        if (dto.getRiskField013() != null && dto.getRiskField013().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("riskField013 must not be negative");
        }
        if (dto.getRiskField014() != null && dto.getRiskField014().isBlank()) {
            errors.add("riskField014 must not be blank if provided");
        }
        if (dto.getRiskField015() != null && dto.getRiskField015().isBlank()) {
            errors.add("riskField015 must not be blank if provided");
        }
        return errors;
    }
}
