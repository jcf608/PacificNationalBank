package com.pnb.customer;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * CustomerValidator042 — Business rule validation.
 */
@ApplicationScoped
public class CustomerValidator042 {

    public List<String> validate(CustomerDto042 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("customer DTO must not be null");
            return errors;
        }
        if (dto.getCustField002() != null && dto.getCustField002().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("custField002 must not be negative");
        }
        if (dto.getCustField006() != null && dto.getCustField006().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("custField006 must not be negative");
        }
        if (dto.getCustField010() != null && dto.getCustField010().isBlank()) {
            errors.add("custField010 must not be blank if provided");
        }
        if (dto.getCustField011() != null && dto.getCustField011().isBlank()) {
            errors.add("custField011 must not be blank if provided");
        }
        if (dto.getCustField013() != null && dto.getCustField013().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("custField013 must not be negative");
        }
        return errors;
    }
}
