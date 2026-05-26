package com.pnb.customer;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * CustomerValidator056 — Business rule validation.
 */
@ApplicationScoped
public class CustomerValidator056 {

    public List<String> validate(CustomerDto056 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("customer DTO must not be null");
            return errors;
        }
        if (dto.getCustField000() != null && dto.getCustField000().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("custField000 must not be negative");
        }
        if (dto.getCustField001() != null && dto.getCustField001().isBlank()) {
            errors.add("custField001 must not be blank if provided");
        }
        if (dto.getCustField005() != null && dto.getCustField005().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("custField005 must not be negative");
        }
        if (dto.getCustField007() != null && dto.getCustField007() < 0) {
            errors.add("custField007 must not be negative");
        }
        if (dto.getCustField008() != null && dto.getCustField008() < 0) {
            errors.add("custField008 must not be negative");
        }
        if (dto.getCustField011() != null && dto.getCustField011() < 0) {
            errors.add("custField011 must not be negative");
        }
        if (dto.getCustField013() != null && dto.getCustField013().isBlank()) {
            errors.add("custField013 must not be blank if provided");
        }
        return errors;
    }
}
