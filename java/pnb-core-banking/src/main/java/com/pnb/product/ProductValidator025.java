package com.pnb.product;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * ProductValidator025 — Business rule validation.
 */
@ApplicationScoped
public class ProductValidator025 {

    public List<String> validate(ProductDto025 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("product DTO must not be null");
            return errors;
        }
        if (dto.getProdField002() != null && dto.getProdField002().isBlank()) {
            errors.add("prodField002 must not be blank if provided");
        }
        if (dto.getProdField003() != null && dto.getProdField003().isBlank()) {
            errors.add("prodField003 must not be blank if provided");
        }
        if (dto.getProdField007() != null && dto.getProdField007().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("prodField007 must not be negative");
        }
        return errors;
    }
}
