package com.pnb.customer;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * CustomerValidator032 — Business rule validation.
 */
@ApplicationScoped
public class CustomerValidator032 {

    public List<String> validate(CustomerDto032 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("customer DTO must not be null");
            return errors;
        }
        if (dto.getCustField001() != null && dto.getCustField001().isBlank()) {
            errors.add("custField001 must not be blank if provided");
        }
        if (dto.getCustField003() != null && dto.getCustField003().isBlank()) {
            errors.add("custField003 must not be blank if provided");
        }
        if (dto.getCustField006() != null && dto.getCustField006() < 0) {
            errors.add("custField006 must not be negative");
        }
        if (dto.getCustField007() != null && dto.getCustField007().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("custField007 must not be negative");
        }
        if (dto.getCustField011() != null && dto.getCustField011().isBlank()) {
            errors.add("custField011 must not be blank if provided");
        }
        if (dto.getCustField013() != null && dto.getCustField013().isBlank()) {
            errors.add("custField013 must not be blank if provided");
        }
        return errors;
    }
}
