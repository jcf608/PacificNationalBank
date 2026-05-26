package com.pnb.risk;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * RiskValidator038 — Business rule validation.
 */
@ApplicationScoped
public class RiskValidator038 {

    public List<String> validate(RiskDto038 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("risk DTO must not be null");
            return errors;
        }
        if (dto.getRiskField001() != null && dto.getRiskField001().isBlank()) {
            errors.add("riskField001 must not be blank if provided");
        }
        if (dto.getRiskField003() != null && dto.getRiskField003().isBlank()) {
            errors.add("riskField003 must not be blank if provided");
        }
        if (dto.getRiskField004() != null && dto.getRiskField004().isBlank()) {
            errors.add("riskField004 must not be blank if provided");
        }
        if (dto.getRiskField005() != null && dto.getRiskField005() < 0) {
            errors.add("riskField005 must not be negative");
        }
        if (dto.getRiskField009() != null && dto.getRiskField009().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("riskField009 must not be negative");
        }
        return errors;
    }
}
