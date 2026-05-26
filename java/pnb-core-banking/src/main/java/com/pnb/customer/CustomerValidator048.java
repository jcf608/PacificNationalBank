package com.pnb.customer;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * CustomerValidator048 — Business rule validation.
 */
@ApplicationScoped
public class CustomerValidator048 {

    public List<String> validate(CustomerDto048 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("customer DTO must not be null");
            return errors;
        }
        if (dto.getCustField002() != null && dto.getCustField002().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("custField002 must not be negative");
        }
        if (dto.getCustField005() != null && dto.getCustField005() < 0) {
            errors.add("custField005 must not be negative");
        }
        return errors;
    }
}
