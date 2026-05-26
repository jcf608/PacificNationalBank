package com.pnb.customer;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * CustomerValidator054 — Business rule validation.
 */
@ApplicationScoped
public class CustomerValidator054 {

    public List<String> validate(CustomerDto054 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("customer DTO must not be null");
            return errors;
        }
        if (dto.getCustField001() != null && dto.getCustField001().isBlank()) {
            errors.add("custField001 must not be blank if provided");
        }
        if (dto.getCustField002() != null && dto.getCustField002().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("custField002 must not be negative");
        }
        if (dto.getCustField005() != null && dto.getCustField005().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("custField005 must not be negative");
        }
        if (dto.getCustField011() != null && dto.getCustField011() < 0) {
            errors.add("custField011 must not be negative");
        }
        if (dto.getCustField012() != null && dto.getCustField012() < 0) {
            errors.add("custField012 must not be negative");
        }
        if (dto.getCustField013() != null && dto.getCustField013().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("custField013 must not be negative");
        }
        return errors;
    }
}
