package com.pnb.customer;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * CustomerValidator026 — Business rule validation.
 */
@ApplicationScoped
public class CustomerValidator026 {

    public List<String> validate(CustomerDto026 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("customer DTO must not be null");
            return errors;
        }
        if (dto.getCustField000() != null && dto.getCustField000().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("custField000 must not be negative");
        }
        if (dto.getCustField002() != null && dto.getCustField002() < 0) {
            errors.add("custField002 must not be negative");
        }
        if (dto.getCustField003() != null && dto.getCustField003().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("custField003 must not be negative");
        }
        if (dto.getCustField006() != null && dto.getCustField006() < 0) {
            errors.add("custField006 must not be negative");
        }
        if (dto.getCustField008() != null && dto.getCustField008().isBlank()) {
            errors.add("custField008 must not be blank if provided");
        }
        return errors;
    }
}
