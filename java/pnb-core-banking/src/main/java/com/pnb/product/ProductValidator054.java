package com.pnb.product;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * ProductValidator054 — Business rule validation.
 */
@ApplicationScoped
public class ProductValidator054 {

    public List<String> validate(ProductDto054 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("product DTO must not be null");
            return errors;
        }
        if (dto.getProdField000() != null && dto.getProdField000().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("prodField000 must not be negative");
        }
        if (dto.getProdField002() != null && dto.getProdField002().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("prodField002 must not be negative");
        }
        if (dto.getProdField004() != null && dto.getProdField004() < 0) {
            errors.add("prodField004 must not be negative");
        }
        if (dto.getProdField008() != null && dto.getProdField008().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("prodField008 must not be negative");
        }
        if (dto.getProdField012() != null && dto.getProdField012().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("prodField012 must not be negative");
        }
        return errors;
    }
}
