package com.pnb.customer;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * CustomerValidator053 — Business rule validation.
 */
@ApplicationScoped
public class CustomerValidator053 {

    public List<String> validate(CustomerDto053 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("customer DTO must not be null");
            return errors;
        }
        if (dto.getCustField005() != null && dto.getCustField005().isBlank()) {
            errors.add("custField005 must not be blank if provided");
        }
        if (dto.getCustField007() != null && dto.getCustField007().isBlank()) {
            errors.add("custField007 must not be blank if provided");
        }
        if (dto.getCustField010() != null && dto.getCustField010().isBlank()) {
            errors.add("custField010 must not be blank if provided");
        }
        return errors;
    }
}
