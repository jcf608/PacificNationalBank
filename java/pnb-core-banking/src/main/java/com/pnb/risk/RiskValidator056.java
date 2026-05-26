package com.pnb.risk;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * RiskValidator056 — Business rule validation.
 */
@ApplicationScoped
public class RiskValidator056 {

    public List<String> validate(RiskDto056 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("risk DTO must not be null");
            return errors;
        }
        if (dto.getRiskField000() != null && dto.getRiskField000().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("riskField000 must not be negative");
        }
        if (dto.getRiskField002() != null && dto.getRiskField002().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("riskField002 must not be negative");
        }
        if (dto.getRiskField003() != null && dto.getRiskField003() < 0) {
            errors.add("riskField003 must not be negative");
        }
        if (dto.getRiskField007() != null && dto.getRiskField007().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("riskField007 must not be negative");
        }
        if (dto.getRiskField009() != null && dto.getRiskField009().isBlank()) {
            errors.add("riskField009 must not be blank if provided");
        }
        if (dto.getRiskField015() != null && dto.getRiskField015().isBlank()) {
            errors.add("riskField015 must not be blank if provided");
        }
        return errors;
    }
}
