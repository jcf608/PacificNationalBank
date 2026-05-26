package com.pnb.customer;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * CustomerValidator055 — Business rule validation.
 */
@ApplicationScoped
public class CustomerValidator055 {

    public List<String> validate(CustomerDto055 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("customer DTO must not be null");
            return errors;
        }
        if (dto.getCustField003() != null && dto.getCustField003().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("custField003 must not be negative");
        }
        if (dto.getCustField005() != null && dto.getCustField005().isBlank()) {
            errors.add("custField005 must not be blank if provided");
        }
        if (dto.getCustField006() != null && dto.getCustField006().isBlank()) {
            errors.add("custField006 must not be blank if provided");
        }
        if (dto.getCustField008() != null && dto.getCustField008() < 0) {
            errors.add("custField008 must not be negative");
        }
        return errors;
    }
}
