package com.pnb.customer;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * CustomerValidator034 — Business rule validation.
 */
@ApplicationScoped
public class CustomerValidator034 {

    public List<String> validate(CustomerDto034 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("customer DTO must not be null");
            return errors;
        }
        if (dto.getCustField003() != null && dto.getCustField003().isBlank()) {
            errors.add("custField003 must not be blank if provided");
        }
        if (dto.getCustField004() != null && dto.getCustField004() < 0) {
            errors.add("custField004 must not be negative");
        }
        if (dto.getCustField011() != null && dto.getCustField011().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("custField011 must not be negative");
        }
        if (dto.getCustField015() != null && dto.getCustField015().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("custField015 must not be negative");
        }
        return errors;
    }
}
