package com.pnb.customer;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * CustomerValidator045 — Business rule validation.
 */
@ApplicationScoped
public class CustomerValidator045 {

    public List<String> validate(CustomerDto045 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("customer DTO must not be null");
            return errors;
        }
        if (dto.getCustField001() != null && dto.getCustField001() < 0) {
            errors.add("custField001 must not be negative");
        }
        if (dto.getCustField004() != null && dto.getCustField004().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("custField004 must not be negative");
        }
        if (dto.getCustField006() != null && dto.getCustField006().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("custField006 must not be negative");
        }
        if (dto.getCustField008() != null && dto.getCustField008().isBlank()) {
            errors.add("custField008 must not be blank if provided");
        }
        if (dto.getCustField010() != null && dto.getCustField010().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("custField010 must not be negative");
        }
        if (dto.getCustField016() != null && dto.getCustField016() < 0) {
            errors.add("custField016 must not be negative");
        }
        return errors;
    }
}
