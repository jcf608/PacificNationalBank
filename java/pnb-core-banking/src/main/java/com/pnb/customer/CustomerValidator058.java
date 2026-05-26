package com.pnb.customer;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * CustomerValidator058 — Business rule validation.
 */
@ApplicationScoped
public class CustomerValidator058 {

    public List<String> validate(CustomerDto058 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("customer DTO must not be null");
            return errors;
        }
        if (dto.getCustField002() != null && dto.getCustField002().isBlank()) {
            errors.add("custField002 must not be blank if provided");
        }
        if (dto.getCustField003() != null && dto.getCustField003().isBlank()) {
            errors.add("custField003 must not be blank if provided");
        }
        if (dto.getCustField007() != null && dto.getCustField007().isBlank()) {
            errors.add("custField007 must not be blank if provided");
        }
        if (dto.getCustField009() != null && dto.getCustField009().isBlank()) {
            errors.add("custField009 must not be blank if provided");
        }
        if (dto.getCustField011() != null && dto.getCustField011().isBlank()) {
            errors.add("custField011 must not be blank if provided");
        }
        if (dto.getCustField014() != null && dto.getCustField014() < 0) {
            errors.add("custField014 must not be negative");
        }
        if (dto.getCustField015() != null && dto.getCustField015().isBlank()) {
            errors.add("custField015 must not be blank if provided");
        }
        if (dto.getCustField016() != null && dto.getCustField016().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("custField016 must not be negative");
        }
        if (dto.getCustField017() != null && dto.getCustField017().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("custField017 must not be negative");
        }
        return errors;
    }
}
