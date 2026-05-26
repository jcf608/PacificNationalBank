package com.pnb.customer;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * CustomerValidator040 — Business rule validation.
 */
@ApplicationScoped
public class CustomerValidator040 {

    public List<String> validate(CustomerDto040 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("customer DTO must not be null");
            return errors;
        }
        if (dto.getCustField000() != null && dto.getCustField000() < 0) {
            errors.add("custField000 must not be negative");
        }
        if (dto.getCustField004() != null && dto.getCustField004() < 0) {
            errors.add("custField004 must not be negative");
        }
        if (dto.getCustField008() != null && dto.getCustField008() < 0) {
            errors.add("custField008 must not be negative");
        }
        if (dto.getCustField009() != null && dto.getCustField009() < 0) {
            errors.add("custField009 must not be negative");
        }
        if (dto.getCustField011() != null && dto.getCustField011() < 0) {
            errors.add("custField011 must not be negative");
        }
        return errors;
    }
}
