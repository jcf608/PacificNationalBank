package com.pnb.customer;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * CustomerValidator047 — Business rule validation.
 */
@ApplicationScoped
public class CustomerValidator047 {

    public List<String> validate(CustomerDto047 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("customer DTO must not be null");
            return errors;
        }
        if (dto.getCustField000() != null && dto.getCustField000().isBlank()) {
            errors.add("custField000 must not be blank if provided");
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
        if (dto.getCustField009() != null && dto.getCustField009().isBlank()) {
            errors.add("custField009 must not be blank if provided");
        }
        if (dto.getCustField010() != null && dto.getCustField010() < 0) {
            errors.add("custField010 must not be negative");
        }
        if (dto.getCustField014() != null && dto.getCustField014().isBlank()) {
            errors.add("custField014 must not be blank if provided");
        }
        return errors;
    }
}
