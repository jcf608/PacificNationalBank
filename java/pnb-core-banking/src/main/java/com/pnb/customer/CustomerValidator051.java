package com.pnb.customer;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * CustomerValidator051 — Business rule validation.
 */
@ApplicationScoped
public class CustomerValidator051 {

    public List<String> validate(CustomerDto051 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("customer DTO must not be null");
            return errors;
        }
        if (dto.getCustField003() != null && dto.getCustField003().isBlank()) {
            errors.add("custField003 must not be blank if provided");
        }
        if (dto.getCustField004() != null && dto.getCustField004().isBlank()) {
            errors.add("custField004 must not be blank if provided");
        }
        if (dto.getCustField007() != null && dto.getCustField007() < 0) {
            errors.add("custField007 must not be negative");
        }
        if (dto.getCustField010() != null && dto.getCustField010() < 0) {
            errors.add("custField010 must not be negative");
        }
        return errors;
    }
}
