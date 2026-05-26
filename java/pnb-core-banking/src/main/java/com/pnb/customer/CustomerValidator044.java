package com.pnb.customer;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * CustomerValidator044 — Business rule validation.
 */
@ApplicationScoped
public class CustomerValidator044 {

    public List<String> validate(CustomerDto044 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("customer DTO must not be null");
            return errors;
        }
        if (dto.getCustField002() != null && dto.getCustField002().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("custField002 must not be negative");
        }
        if (dto.getCustField003() != null && dto.getCustField003() < 0) {
            errors.add("custField003 must not be negative");
        }
        if (dto.getCustField005() != null && dto.getCustField005().isBlank()) {
            errors.add("custField005 must not be blank if provided");
        }
        if (dto.getCustField006() != null && dto.getCustField006().isBlank()) {
            errors.add("custField006 must not be blank if provided");
        }
        if (dto.getCustField007() != null && dto.getCustField007().isBlank()) {
            errors.add("custField007 must not be blank if provided");
        }
        if (dto.getCustField008() != null && dto.getCustField008().isBlank()) {
            errors.add("custField008 must not be blank if provided");
        }
        if (dto.getCustField010() != null && dto.getCustField010().isBlank()) {
            errors.add("custField010 must not be blank if provided");
        }
        if (dto.getCustField011() != null && dto.getCustField011() < 0) {
            errors.add("custField011 must not be negative");
        }
        if (dto.getCustField015() != null && dto.getCustField015().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("custField015 must not be negative");
        }
        return errors;
    }
}
