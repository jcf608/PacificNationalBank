package com.pnb.customer;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * CustomerValidator031 — Business rule validation.
 */
@ApplicationScoped
public class CustomerValidator031 {

    public List<String> validate(CustomerDto031 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("customer DTO must not be null");
            return errors;
        }
        if (dto.getCustField000() != null && dto.getCustField000().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("custField000 must not be negative");
        }
        if (dto.getCustField001() != null && dto.getCustField001() < 0) {
            errors.add("custField001 must not be negative");
        }
        if (dto.getCustField002() != null && dto.getCustField002().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("custField002 must not be negative");
        }
        if (dto.getCustField007() != null && dto.getCustField007() < 0) {
            errors.add("custField007 must not be negative");
        }
        if (dto.getCustField008() != null && dto.getCustField008().isBlank()) {
            errors.add("custField008 must not be blank if provided");
        }
        if (dto.getCustField009() != null && dto.getCustField009().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("custField009 must not be negative");
        }
        if (dto.getCustField010() != null && dto.getCustField010() < 0) {
            errors.add("custField010 must not be negative");
        }
        if (dto.getCustField012() != null && dto.getCustField012() < 0) {
            errors.add("custField012 must not be negative");
        }
        if (dto.getCustField014() != null && dto.getCustField014().isBlank()) {
            errors.add("custField014 must not be blank if provided");
        }
        return errors;
    }
}
