package com.pnb.risk;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * RiskValidator028 — Business rule validation.
 */
@ApplicationScoped
public class RiskValidator028 {

    public List<String> validate(RiskDto028 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("risk DTO must not be null");
            return errors;
        }
        if (dto.getRiskField006() != null && dto.getRiskField006() < 0) {
            errors.add("riskField006 must not be negative");
        }
        if (dto.getRiskField007() != null && dto.getRiskField007().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("riskField007 must not be negative");
        }
        if (dto.getRiskField009() != null && dto.getRiskField009().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("riskField009 must not be negative");
        }
        return errors;
    }
}
