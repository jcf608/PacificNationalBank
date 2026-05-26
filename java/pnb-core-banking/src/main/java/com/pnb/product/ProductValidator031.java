package com.pnb.product;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * ProductValidator031 — Business rule validation.
 */
@ApplicationScoped
public class ProductValidator031 {

    public List<String> validate(ProductDto031 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("product DTO must not be null");
            return errors;
        }
        if (dto.getProdField004() != null && dto.getProdField004() < 0) {
            errors.add("prodField004 must not be negative");
        }
        if (dto.getProdField007() != null && dto.getProdField007().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("prodField007 must not be negative");
        }
        if (dto.getProdField009() != null && dto.getProdField009().isBlank()) {
            errors.add("prodField009 must not be blank if provided");
        }
        if (dto.getProdField010() != null && dto.getProdField010() < 0) {
            errors.add("prodField010 must not be negative");
        }
        if (dto.getProdField011() != null && dto.getProdField011().isBlank()) {
            errors.add("prodField011 must not be blank if provided");
        }
        if (dto.getProdField014() != null && dto.getProdField014().isBlank()) {
            errors.add("prodField014 must not be blank if provided");
        }
        return errors;
    }
}
