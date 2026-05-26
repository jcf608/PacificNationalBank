package com.pnb.risk;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * RiskValidator030 — Business rule validation.
 */
@ApplicationScoped
public class RiskValidator030 {

    public List<String> validate(RiskDto030 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("risk DTO must not be null");
            return errors;
        }
        if (dto.getRiskField008() != null && dto.getRiskField008().isBlank()) {
            errors.add("riskField008 must not be blank if provided");
        }
        if (dto.getRiskField009() != null && dto.getRiskField009().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("riskField009 must not be negative");
        }
        if (dto.getRiskField011() != null && dto.getRiskField011().isBlank()) {
            errors.add("riskField011 must not be blank if provided");
        }
        return errors;
    }
}
