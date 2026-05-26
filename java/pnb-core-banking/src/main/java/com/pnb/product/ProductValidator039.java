package com.pnb.product;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * ProductValidator039 — Business rule validation.
 */
@ApplicationScoped
public class ProductValidator039 {

    public List<String> validate(ProductDto039 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("product DTO must not be null");
            return errors;
        }
        if (dto.getProdField000() != null && dto.getProdField000() < 0) {
            errors.add("prodField000 must not be negative");
        }
        if (dto.getProdField007() != null && dto.getProdField007().isBlank()) {
            errors.add("prodField007 must not be blank if provided");
        }
        if (dto.getProdField008() != null && dto.getProdField008().isBlank()) {
            errors.add("prodField008 must not be blank if provided");
        }
        return errors;
    }
}
