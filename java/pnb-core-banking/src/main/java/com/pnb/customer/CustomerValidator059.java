package com.pnb.customer;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * CustomerValidator059 — Business rule validation.
 */
@ApplicationScoped
public class CustomerValidator059 {

    public List<String> validate(CustomerDto059 dto) {
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
        if (dto.getCustField004() != null && dto.getCustField004() < 0) {
            errors.add("custField004 must not be negative");
        }
        if (dto.getCustField005() != null && dto.getCustField005().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("custField005 must not be negative");
        }
        if (dto.getCustField011() != null && dto.getCustField011() < 0) {
            errors.add("custField011 must not be negative");
        }
        if (dto.getCustField012() != null && dto.getCustField012().isBlank()) {
            errors.add("custField012 must not be blank if provided");
        }
        if (dto.getCustField013() != null && dto.getCustField013() < 0) {
            errors.add("custField013 must not be negative");
        }
        if (dto.getCustField015() != null && dto.getCustField015() < 0) {
            errors.add("custField015 must not be negative");
        }
        if (dto.getCustField018() != null && dto.getCustField018().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("custField018 must not be negative");
        }
        return errors;
    }
}
