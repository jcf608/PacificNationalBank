package com.pnb.product;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * ProductValidator032 — Business rule validation.
 */
@ApplicationScoped
public class ProductValidator032 {

    public List<String> validate(ProductDto032 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("product DTO must not be null");
            return errors;
        }
        if (dto.getProdField000() != null && dto.getProdField000() < 0) {
            errors.add("prodField000 must not be negative");
        }
        if (dto.getProdField001() != null && dto.getProdField001().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("prodField001 must not be negative");
        }
        if (dto.getProdField002() != null && dto.getProdField002().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("prodField002 must not be negative");
        }
        if (dto.getProdField005() != null && dto.getProdField005().isBlank()) {
            errors.add("prodField005 must not be blank if provided");
        }
        if (dto.getProdField008() != null && dto.getProdField008().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("prodField008 must not be negative");
        }
        if (dto.getProdField011() != null && dto.getProdField011().isBlank()) {
            errors.add("prodField011 must not be blank if provided");
        }
        if (dto.getProdField012() != null && dto.getProdField012() < 0) {
            errors.add("prodField012 must not be negative");
        }
        if (dto.getProdField013() != null && dto.getProdField013() < 0) {
            errors.add("prodField013 must not be negative");
        }
        if (dto.getProdField014() != null && dto.getProdField014() < 0) {
            errors.add("prodField014 must not be negative");
        }
        return errors;
    }
}
