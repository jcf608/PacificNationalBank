package com.pnb.customer;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * CustomerValidator037 — Business rule validation.
 */
@ApplicationScoped
public class CustomerValidator037 {

    public List<String> validate(CustomerDto037 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("customer DTO must not be null");
            return errors;
        }
        if (dto.getCustField000() != null && dto.getCustField000().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("custField000 must not be negative");
        }
        if (dto.getCustField002() != null && dto.getCustField002().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("custField002 must not be negative");
        }
        if (dto.getCustField006() != null && dto.getCustField006().isBlank()) {
            errors.add("custField006 must not be blank if provided");
        }
        if (dto.getCustField007() != null && dto.getCustField007() < 0) {
            errors.add("custField007 must not be negative");
        }
        return errors;
    }
}
