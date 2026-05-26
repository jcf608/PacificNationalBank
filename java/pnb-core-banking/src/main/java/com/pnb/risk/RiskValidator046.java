package com.pnb.risk;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * RiskValidator046 — Business rule validation.
 */
@ApplicationScoped
public class RiskValidator046 {

    public List<String> validate(RiskDto046 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("risk DTO must not be null");
            return errors;
        }
        if (dto.getRiskField002() != null && dto.getRiskField002().isBlank()) {
            errors.add("riskField002 must not be blank if provided");
        }
        if (dto.getRiskField007() != null && dto.getRiskField007() < 0) {
            errors.add("riskField007 must not be negative");
        }
        if (dto.getRiskField009() != null && dto.getRiskField009() < 0) {
            errors.add("riskField009 must not be negative");
        }
        if (dto.getRiskField010() != null && dto.getRiskField010().isBlank()) {
            errors.add("riskField010 must not be blank if provided");
        }
        if (dto.getRiskField013() != null && dto.getRiskField013().isBlank()) {
            errors.add("riskField013 must not be blank if provided");
        }
        if (dto.getRiskField017() != null && dto.getRiskField017() < 0) {
            errors.add("riskField017 must not be negative");
        }
        return errors;
    }
}
