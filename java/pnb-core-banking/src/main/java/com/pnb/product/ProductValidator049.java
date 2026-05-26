package com.pnb.product;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * ProductValidator049 — Business rule validation.
 */
@ApplicationScoped
public class ProductValidator049 {

    public List<String> validate(ProductDto049 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("product DTO must not be null");
            return errors;
        }
        if (dto.getProdField000() != null && dto.getProdField000().isBlank()) {
            errors.add("prodField000 must not be blank if provided");
        }
        if (dto.getProdField001() != null && dto.getProdField001().isBlank()) {
            errors.add("prodField001 must not be blank if provided");
        }
        if (dto.getProdField008() != null && dto.getProdField008() < 0) {
            errors.add("prodField008 must not be negative");
        }
        return errors;
    }
}
