package com.pnb.customer;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * CustomerValidator023 — Business rule validation.
 */
@ApplicationScoped
public class CustomerValidator023 {

    public List<String> validate(CustomerDto023 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("customer DTO must not be null");
            return errors;
        }
        if (dto.getCustField000() != null && dto.getCustField000() < 0) {
            errors.add("custField000 must not be negative");
        }
        if (dto.getCustField001() != null && dto.getCustField001().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("custField001 must not be negative");
        }
        if (dto.getCustField002() != null && dto.getCustField002().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("custField002 must not be negative");
        }
        if (dto.getCustField005() != null && dto.getCustField005().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("custField005 must not be negative");
        }
        if (dto.getCustField007() != null && dto.getCustField007().isBlank()) {
            errors.add("custField007 must not be blank if provided");
        }
        if (dto.getCustField008() != null && dto.getCustField008() < 0) {
            errors.add("custField008 must not be negative");
        }
        if (dto.getCustField009() != null && dto.getCustField009().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("custField009 must not be negative");
        }
        if (dto.getCustField010() != null && dto.getCustField010().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("custField010 must not be negative");
        }
        if (dto.getCustField015() != null && dto.getCustField015().isBlank()) {
            errors.add("custField015 must not be blank if provided");
        }
        if (dto.getCustField017() != null && dto.getCustField017().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("custField017 must not be negative");
        }
        return errors;
    }
}
