package com.pnb.product;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * ProductValidator045 — Business rule validation.
 */
@ApplicationScoped
public class ProductValidator045 {

    public List<String> validate(ProductDto045 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("product DTO must not be null");
            return errors;
        }
        if (dto.getProdField003() != null && dto.getProdField003().isBlank()) {
            errors.add("prodField003 must not be blank if provided");
        }
        if (dto.getProdField006() != null && dto.getProdField006().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("prodField006 must not be negative");
        }
        if (dto.getProdField007() != null && dto.getProdField007().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("prodField007 must not be negative");
        }
        if (dto.getProdField008() != null && dto.getProdField008().isBlank()) {
            errors.add("prodField008 must not be blank if provided");
        }
        if (dto.getProdField012() != null && dto.getProdField012().isBlank()) {
            errors.add("prodField012 must not be blank if provided");
        }
        return errors;
    }
}
