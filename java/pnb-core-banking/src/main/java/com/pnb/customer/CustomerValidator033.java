package com.pnb.customer;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * CustomerValidator033 — Business rule validation.
 */
@ApplicationScoped
public class CustomerValidator033 {

    public List<String> validate(CustomerDto033 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("customer DTO must not be null");
            return errors;
        }
        if (dto.getCustField002() != null && dto.getCustField002() < 0) {
            errors.add("custField002 must not be negative");
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
        if (dto.getCustField013() != null && dto.getCustField013().isBlank()) {
            errors.add("custField013 must not be blank if provided");
        }
        if (dto.getCustField014() != null && dto.getCustField014() < 0) {
            errors.add("custField014 must not be negative");
        }
        return errors;
    }
}
