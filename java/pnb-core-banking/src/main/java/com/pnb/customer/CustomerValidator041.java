package com.pnb.customer;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * CustomerValidator041 — Business rule validation.
 */
@ApplicationScoped
public class CustomerValidator041 {

    public List<String> validate(CustomerDto041 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("customer DTO must not be null");
            return errors;
        }
        if (dto.getCustField000() != null && dto.getCustField000().isBlank()) {
            errors.add("custField000 must not be blank if provided");
        }
        if (dto.getCustField005() != null && dto.getCustField005().isBlank()) {
            errors.add("custField005 must not be blank if provided");
        }
        if (dto.getCustField008() != null && dto.getCustField008() < 0) {
            errors.add("custField008 must not be negative");
        }
        return errors;
    }
}
