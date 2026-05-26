package com.pnb.product;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * ProductValidator059 — Business rule validation.
 */
@ApplicationScoped
public class ProductValidator059 {

    public List<String> validate(ProductDto059 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("product DTO must not be null");
            return errors;
        }
        if (dto.getProdField002() != null && dto.getProdField002().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("prodField002 must not be negative");
        }
        if (dto.getProdField003() != null && dto.getProdField003().isBlank()) {
            errors.add("prodField003 must not be blank if provided");
        }
        if (dto.getProdField004() != null && dto.getProdField004().isBlank()) {
            errors.add("prodField004 must not be blank if provided");
        }
        if (dto.getProdField007() != null && dto.getProdField007() < 0) {
            errors.add("prodField007 must not be negative");
        }
        if (dto.getProdField016() != null && dto.getProdField016().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("prodField016 must not be negative");
        }
        if (dto.getProdField017() != null && dto.getProdField017().isBlank()) {
            errors.add("prodField017 must not be blank if provided");
        }
        return errors;
    }
}
