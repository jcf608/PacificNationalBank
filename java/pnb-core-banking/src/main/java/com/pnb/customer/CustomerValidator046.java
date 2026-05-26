package com.pnb.customer;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * CustomerValidator046 — Business rule validation.
 */
@ApplicationScoped
public class CustomerValidator046 {

    public List<String> validate(CustomerDto046 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("customer DTO must not be null");
            return errors;
        }
        if (dto.getCustField004() != null && dto.getCustField004().isBlank()) {
            errors.add("custField004 must not be blank if provided");
        }
        if (dto.getCustField005() != null && dto.getCustField005() < 0) {
            errors.add("custField005 must not be negative");
        }
        if (dto.getCustField006() != null && dto.getCustField006().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("custField006 must not be negative");
        }
        if (dto.getCustField007() != null && dto.getCustField007().isBlank()) {
            errors.add("custField007 must not be blank if provided");
        }
        if (dto.getCustField014() != null && dto.getCustField014() < 0) {
            errors.add("custField014 must not be negative");
        }
        if (dto.getCustField017() != null && dto.getCustField017().isBlank()) {
            errors.add("custField017 must not be blank if provided");
        }
        return errors;
    }
}
