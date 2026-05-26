package com.pnb.risk;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * RiskValidator040 — Business rule validation.
 */
@ApplicationScoped
public class RiskValidator040 {

    public List<String> validate(RiskDto040 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("risk DTO must not be null");
            return errors;
        }
        if (dto.getRiskField000() != null && dto.getRiskField000().isBlank()) {
            errors.add("riskField000 must not be blank if provided");
        }
        if (dto.getRiskField003() != null && dto.getRiskField003() < 0) {
            errors.add("riskField003 must not be negative");
        }
        if (dto.getRiskField004() != null && dto.getRiskField004().isBlank()) {
            errors.add("riskField004 must not be blank if provided");
        }
        if (dto.getRiskField005() != null && dto.getRiskField005().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("riskField005 must not be negative");
        }
        if (dto.getRiskField006() != null && dto.getRiskField006() < 0) {
            errors.add("riskField006 must not be negative");
        }
        if (dto.getRiskField009() != null && dto.getRiskField009().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("riskField009 must not be negative");
        }
        return errors;
    }
}
