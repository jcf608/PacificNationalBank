package com.pnb.product;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * ProductValidator033 — Business rule validation.
 */
@ApplicationScoped
public class ProductValidator033 {

    public List<String> validate(ProductDto033 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("product DTO must not be null");
            return errors;
        }
        if (dto.getProdField001() != null && dto.getProdField001().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("prodField001 must not be negative");
        }
        if (dto.getProdField003() != null && dto.getProdField003().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("prodField003 must not be negative");
        }
        if (dto.getProdField006() != null && dto.getProdField006() < 0) {
            errors.add("prodField006 must not be negative");
        }
        if (dto.getProdField008() != null && dto.getProdField008().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("prodField008 must not be negative");
        }
        if (dto.getProdField009() != null && dto.getProdField009() < 0) {
            errors.add("prodField009 must not be negative");
        }
        if (dto.getProdField012() != null && dto.getProdField012().isBlank()) {
            errors.add("prodField012 must not be blank if provided");
        }
        if (dto.getProdField016() != null && dto.getProdField016().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("prodField016 must not be negative");
        }
        return errors;
    }
}
