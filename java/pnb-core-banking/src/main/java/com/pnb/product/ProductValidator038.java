package com.pnb.product;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * ProductValidator038 — Business rule validation.
 */
@ApplicationScoped
public class ProductValidator038 {

    public List<String> validate(ProductDto038 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("product DTO must not be null");
            return errors;
        }
        if (dto.getProdField001() != null && dto.getProdField001() < 0) {
            errors.add("prodField001 must not be negative");
        }
        if (dto.getProdField007() != null && dto.getProdField007() < 0) {
            errors.add("prodField007 must not be negative");
        }
        return errors;
    }
}
