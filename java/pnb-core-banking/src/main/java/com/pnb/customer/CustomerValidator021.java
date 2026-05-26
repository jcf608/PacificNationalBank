package com.pnb.customer;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * CustomerValidator021 — Business rule validation.
 */
@ApplicationScoped
public class CustomerValidator021 {

    public List<String> validate(CustomerDto021 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("customer DTO must not be null");
            return errors;
        }
        if (dto.getCustField003() != null && dto.getCustField003().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("custField003 must not be negative");
        }
        if (dto.getCustField006() != null && dto.getCustField006() < 0) {
            errors.add("custField006 must not be negative");
        }
        if (dto.getCustField007() != null && dto.getCustField007() < 0) {
            errors.add("custField007 must not be negative");
        }
        if (dto.getCustField010() != null && dto.getCustField010().isBlank()) {
            errors.add("custField010 must not be blank if provided");
        }
        if (dto.getCustField011() != null && dto.getCustField011().isBlank()) {
            errors.add("custField011 must not be blank if provided");
        }
        if (dto.getCustField012() != null && dto.getCustField012().isBlank()) {
            errors.add("custField012 must not be blank if provided");
        }
        if (dto.getCustField013() != null && dto.getCustField013() < 0) {
            errors.add("custField013 must not be negative");
        }
        return errors;
    }
}
