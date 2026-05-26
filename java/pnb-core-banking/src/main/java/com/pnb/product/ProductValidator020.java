package com.pnb.product;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * ProductValidator020 — Business rule validation.
 */
@ApplicationScoped
public class ProductValidator020 {

    public List<String> validate(ProductDto020 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("product DTO must not be null");
            return errors;
        }
        if (dto.getProdField000() != null && dto.getProdField000().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("prodField000 must not be negative");
        }
        if (dto.getProdField002() != null && dto.getProdField002().isBlank()) {
            errors.add("prodField002 must not be blank if provided");
        }
        if (dto.getProdField006() != null && dto.getProdField006().isBlank()) {
            errors.add("prodField006 must not be blank if provided");
        }
        if (dto.getProdField008() != null && dto.getProdField008().isBlank()) {
            errors.add("prodField008 must not be blank if provided");
        }
        if (dto.getProdField010() != null && dto.getProdField010() < 0) {
            errors.add("prodField010 must not be negative");
        }
        if (dto.getProdField011() != null && dto.getProdField011().isBlank()) {
            errors.add("prodField011 must not be blank if provided");
        }
        if (dto.getProdField012() != null && dto.getProdField012().isBlank()) {
            errors.add("prodField012 must not be blank if provided");
        }
        return errors;
    }
}
