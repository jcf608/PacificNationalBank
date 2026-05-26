package com.pnb.product;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * ProductValidator024 — Business rule validation.
 */
@ApplicationScoped
public class ProductValidator024 {

    public List<String> validate(ProductDto024 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("product DTO must not be null");
            return errors;
        }
        if (dto.getProdField001() != null && dto.getProdField001().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("prodField001 must not be negative");
        }
        if (dto.getProdField002() != null && dto.getProdField002() < 0) {
            errors.add("prodField002 must not be negative");
        }
        if (dto.getProdField004() != null && dto.getProdField004().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("prodField004 must not be negative");
        }
        return errors;
    }
}
