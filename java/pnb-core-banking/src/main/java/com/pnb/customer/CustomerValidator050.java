package com.pnb.customer;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * CustomerValidator050 — Business rule validation.
 */
@ApplicationScoped
public class CustomerValidator050 {

    public List<String> validate(CustomerDto050 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("customer DTO must not be null");
            return errors;
        }
        if (dto.getCustField000() != null && dto.getCustField000() < 0) {
            errors.add("custField000 must not be negative");
        }
        return errors;
    }
}
