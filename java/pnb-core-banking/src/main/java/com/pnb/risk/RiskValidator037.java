package com.pnb.risk;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * RiskValidator037 — Business rule validation.
 */
@ApplicationScoped
public class RiskValidator037 {

    public List<String> validate(RiskDto037 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("risk DTO must not be null");
            return errors;
        }
        if (dto.getRiskField005() != null && dto.getRiskField005().isBlank()) {
            errors.add("riskField005 must not be blank if provided");
        }
        if (dto.getRiskField007() != null && dto.getRiskField007().isBlank()) {
            errors.add("riskField007 must not be blank if provided");
        }
        return errors;
    }
}
