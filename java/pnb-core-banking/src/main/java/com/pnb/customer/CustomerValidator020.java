package com.pnb.customer;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * CustomerValidator020 — Business rule validation.
 */
@ApplicationScoped
public class CustomerValidator020 {

    public List<String> validate(CustomerDto020 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("customer DTO must not be null");
            return errors;
        }
        if (dto.getCustField000() != null && dto.getCustField000().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("custField000 must not be negative");
        }
        if (dto.getCustField001() != null && dto.getCustField001().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("custField001 must not be negative");
        }
        if (dto.getCustField003() != null && dto.getCustField003().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("custField003 must not be negative");
        }
        if (dto.getCustField008() != null && dto.getCustField008().isBlank()) {
            errors.add("custField008 must not be blank if provided");
        }
        if (dto.getCustField010() != null && dto.getCustField010().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("custField010 must not be negative");
        }
        if (dto.getCustField011() != null && dto.getCustField011().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("custField011 must not be negative");
        }
        if (dto.getCustField014() != null && dto.getCustField014().isBlank()) {
            errors.add("custField014 must not be blank if provided");
        }
        if (dto.getCustField015() != null && dto.getCustField015().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("custField015 must not be negative");
        }
        return errors;
    }
}
