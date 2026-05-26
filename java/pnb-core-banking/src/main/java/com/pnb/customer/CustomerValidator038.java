package com.pnb.customer;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * CustomerValidator038 — Business rule validation.
 */
@ApplicationScoped
public class CustomerValidator038 {

    public List<String> validate(CustomerDto038 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("customer DTO must not be null");
            return errors;
        }
        if (dto.getCustField001() != null && dto.getCustField001().isBlank()) {
            errors.add("custField001 must not be blank if provided");
        }
        if (dto.getCustField002() != null && dto.getCustField002().isBlank()) {
            errors.add("custField002 must not be blank if provided");
        }
        if (dto.getCustField005() != null && dto.getCustField005().isBlank()) {
            errors.add("custField005 must not be blank if provided");
        }
        return errors;
    }
}
