package com.pnb.product;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * ProductValidator035 — Business rule validation.
 */
@ApplicationScoped
public class ProductValidator035 {

    public List<String> validate(ProductDto035 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("product DTO must not be null");
            return errors;
        }
        if (dto.getProdField000() != null && dto.getProdField000().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("prodField000 must not be negative");
        }
        if (dto.getProdField007() != null && dto.getProdField007() < 0) {
            errors.add("prodField007 must not be negative");
        }
        if (dto.getProdField010() != null && dto.getProdField010().isBlank()) {
            errors.add("prodField010 must not be blank if provided");
        }
        if (dto.getProdField014() != null && dto.getProdField014().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("prodField014 must not be negative");
        }
        if (dto.getProdField015() != null && dto.getProdField015().isBlank()) {
            errors.add("prodField015 must not be blank if provided");
        }
        if (dto.getProdField017() != null && dto.getProdField017().isBlank()) {
            errors.add("prodField017 must not be blank if provided");
        }
        return errors;
    }
}
