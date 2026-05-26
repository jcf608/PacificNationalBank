package com.pnb.product;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * ProductValidator026 — Business rule validation.
 */
@ApplicationScoped
public class ProductValidator026 {

    public List<String> validate(ProductDto026 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("product DTO must not be null");
            return errors;
        }
        if (dto.getProdField002() != null && dto.getProdField002().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("prodField002 must not be negative");
        }
        if (dto.getProdField008() != null && dto.getProdField008() < 0) {
            errors.add("prodField008 must not be negative");
        }
        return errors;
    }
}
