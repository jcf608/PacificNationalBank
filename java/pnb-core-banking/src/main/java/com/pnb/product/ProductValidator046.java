package com.pnb.product;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * ProductValidator046 — Business rule validation.
 */
@ApplicationScoped
public class ProductValidator046 {

    public List<String> validate(ProductDto046 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("product DTO must not be null");
            return errors;
        }
        if (dto.getProdField003() != null && dto.getProdField003().isBlank()) {
            errors.add("prodField003 must not be blank if provided");
        }
        if (dto.getProdField010() != null && dto.getProdField010().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("prodField010 must not be negative");
        }
        if (dto.getProdField011() != null && dto.getProdField011().isBlank()) {
            errors.add("prodField011 must not be blank if provided");
        }
        if (dto.getProdField012() != null && dto.getProdField012().isBlank()) {
            errors.add("prodField012 must not be blank if provided");
        }
        if (dto.getProdField017() != null && dto.getProdField017().isBlank()) {
            errors.add("prodField017 must not be blank if provided");
        }
        return errors;
    }
}
