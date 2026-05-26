package com.pnb.customer;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * CustomerValidator039 — Business rule validation.
 */
@ApplicationScoped
public class CustomerValidator039 {

    public List<String> validate(CustomerDto039 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("customer DTO must not be null");
            return errors;
        }
        if (dto.getCustField001() != null && dto.getCustField001().isBlank()) {
            errors.add("custField001 must not be blank if provided");
        }
        if (dto.getCustField009() != null && dto.getCustField009() < 0) {
            errors.add("custField009 must not be negative");
        }
        if (dto.getCustField010() != null && dto.getCustField010().isBlank()) {
            errors.add("custField010 must not be blank if provided");
        }
        return errors;
    }
}
