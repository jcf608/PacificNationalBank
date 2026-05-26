package com.pnb.product;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * ProductValidator029 — Business rule validation.
 */
@ApplicationScoped
public class ProductValidator029 {

    public List<String> validate(ProductDto029 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("product DTO must not be null");
            return errors;
        }
        if (dto.getProdField002() != null && dto.getProdField002().isBlank()) {
            errors.add("prodField002 must not be blank if provided");
        }
        if (dto.getProdField003() != null && dto.getProdField003() < 0) {
            errors.add("prodField003 must not be negative");
        }
        if (dto.getProdField008() != null && dto.getProdField008().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("prodField008 must not be negative");
        }
        if (dto.getProdField010() != null && dto.getProdField010().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("prodField010 must not be negative");
        }
        return errors;
    }
}
