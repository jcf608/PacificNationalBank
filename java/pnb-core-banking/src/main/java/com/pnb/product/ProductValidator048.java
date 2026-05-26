package com.pnb.product;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * ProductValidator048 — Business rule validation.
 */
@ApplicationScoped
public class ProductValidator048 {

    public List<String> validate(ProductDto048 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("product DTO must not be null");
            return errors;
        }
        if (dto.getProdField003() != null && dto.getProdField003().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("prodField003 must not be negative");
        }
        if (dto.getProdField006() != null && dto.getProdField006().isBlank()) {
            errors.add("prodField006 must not be blank if provided");
        }
        return errors;
    }
}
