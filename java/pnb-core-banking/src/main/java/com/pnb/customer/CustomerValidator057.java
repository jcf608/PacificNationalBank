package com.pnb.customer;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * CustomerValidator057 — Business rule validation.
 */
@ApplicationScoped
public class CustomerValidator057 {

    public List<String> validate(CustomerDto057 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("customer DTO must not be null");
            return errors;
        }
        if (dto.getCustField000() != null && dto.getCustField000().isBlank()) {
            errors.add("custField000 must not be blank if provided");
        }
        if (dto.getCustField001() != null && dto.getCustField001() < 0) {
            errors.add("custField001 must not be negative");
        }
        if (dto.getCustField004() != null && dto.getCustField004() < 0) {
            errors.add("custField004 must not be negative");
        }
        if (dto.getCustField007() != null && dto.getCustField007().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("custField007 must not be negative");
        }
        if (dto.getCustField010() != null && dto.getCustField010().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("custField010 must not be negative");
        }
        if (dto.getCustField012() != null && dto.getCustField012() < 0) {
            errors.add("custField012 must not be negative");
        }
        if (dto.getCustField013() != null && dto.getCustField013().isBlank()) {
            errors.add("custField013 must not be blank if provided");
        }
        return errors;
    }
}
