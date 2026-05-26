package com.pnb.risk;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * RiskValidator035 — Business rule validation.
 */
@ApplicationScoped
public class RiskValidator035 {

    public List<String> validate(RiskDto035 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("risk DTO must not be null");
            return errors;
        }
        if (dto.getRiskField005() != null && dto.getRiskField005().isBlank()) {
            errors.add("riskField005 must not be blank if provided");
        }
        if (dto.getRiskField008() != null && dto.getRiskField008().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("riskField008 must not be negative");
        }
        if (dto.getRiskField009() != null && dto.getRiskField009().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("riskField009 must not be negative");
        }
        if (dto.getRiskField015() != null && dto.getRiskField015() < 0) {
            errors.add("riskField015 must not be negative");
        }
        if (dto.getRiskField016() != null && dto.getRiskField016().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("riskField016 must not be negative");
        }
        return errors;
    }
}
