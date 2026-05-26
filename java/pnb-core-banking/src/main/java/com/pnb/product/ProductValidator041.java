package com.pnb.product;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * ProductValidator041 — Business rule validation.
 */
@ApplicationScoped
public class ProductValidator041 {

    public List<String> validate(ProductDto041 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("product DTO must not be null");
            return errors;
        }
        if (dto.getProdField000() != null && dto.getProdField000() < 0) {
            errors.add("prodField000 must not be negative");
        }
        if (dto.getProdField006() != null && dto.getProdField006() < 0) {
            errors.add("prodField006 must not be negative");
        }
        if (dto.getProdField008() != null && dto.getProdField008() < 0) {
            errors.add("prodField008 must not be negative");
        }
        if (dto.getProdField009() != null && dto.getProdField009().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("prodField009 must not be negative");
        }
        if (dto.getProdField012() != null && dto.getProdField012() < 0) {
            errors.add("prodField012 must not be negative");
        }
        return errors;
    }
}
