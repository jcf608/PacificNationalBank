package com.pnb.customer;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * CustomerValidator035 — Business rule validation.
 */
@ApplicationScoped
public class CustomerValidator035 {

    public List<String> validate(CustomerDto035 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("customer DTO must not be null");
            return errors;
        }
        if (dto.getCustField002() != null && dto.getCustField002().isBlank()) {
            errors.add("custField002 must not be blank if provided");
        }
        if (dto.getCustField004() != null && dto.getCustField004().isBlank()) {
            errors.add("custField004 must not be blank if provided");
        }
        if (dto.getCustField005() != null && dto.getCustField005().isBlank()) {
            errors.add("custField005 must not be blank if provided");
        }
        if (dto.getCustField008() != null && dto.getCustField008().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("custField008 must not be negative");
        }
        if (dto.getCustField013() != null && dto.getCustField013().isBlank()) {
            errors.add("custField013 must not be blank if provided");
        }
        return errors;
    }
}
