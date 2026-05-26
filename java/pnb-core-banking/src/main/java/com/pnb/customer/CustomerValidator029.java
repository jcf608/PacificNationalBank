package com.pnb.customer;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * CustomerValidator029 — Business rule validation.
 */
@ApplicationScoped
public class CustomerValidator029 {

    public List<String> validate(CustomerDto029 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("customer DTO must not be null");
            return errors;
        }
        if (dto.getCustField004() != null && dto.getCustField004() < 0) {
            errors.add("custField004 must not be negative");
        }
        if (dto.getCustField005() != null && dto.getCustField005().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("custField005 must not be negative");
        }
        if (dto.getCustField006() != null && dto.getCustField006().isBlank()) {
            errors.add("custField006 must not be blank if provided");
        }
        if (dto.getCustField007() != null && dto.getCustField007().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("custField007 must not be negative");
        }
        if (dto.getCustField008() != null && dto.getCustField008() < 0) {
            errors.add("custField008 must not be negative");
        }
        if (dto.getCustField012() != null && dto.getCustField012() < 0) {
            errors.add("custField012 must not be negative");
        }
        return errors;
    }
}
