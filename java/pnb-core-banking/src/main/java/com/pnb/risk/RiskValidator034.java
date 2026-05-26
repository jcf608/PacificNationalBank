package com.pnb.risk;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * RiskValidator034 — Business rule validation.
 */
@ApplicationScoped
public class RiskValidator034 {

    public List<String> validate(RiskDto034 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("risk DTO must not be null");
            return errors;
        }
        if (dto.getRiskField000() != null && dto.getRiskField000() < 0) {
            errors.add("riskField000 must not be negative");
        }
        if (dto.getRiskField006() != null && dto.getRiskField006().isBlank()) {
            errors.add("riskField006 must not be blank if provided");
        }
        if (dto.getRiskField008() != null && dto.getRiskField008().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("riskField008 must not be negative");
        }
        if (dto.getRiskField009() != null && dto.getRiskField009().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("riskField009 must not be negative");
        }
        if (dto.getRiskField010() != null && dto.getRiskField010().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("riskField010 must not be negative");
        }
        if (dto.getRiskField016() != null && dto.getRiskField016().isBlank()) {
            errors.add("riskField016 must not be blank if provided");
        }
        return errors;
    }
}
