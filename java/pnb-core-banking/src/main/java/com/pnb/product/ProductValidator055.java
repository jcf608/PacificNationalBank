package com.pnb.product;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * ProductValidator055 — Business rule validation.
 */
@ApplicationScoped
public class ProductValidator055 {

    public List<String> validate(ProductDto055 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("product DTO must not be null");
            return errors;
        }
        if (dto.getProdField004() != null && dto.getProdField004().isBlank()) {
            errors.add("prodField004 must not be blank if provided");
        }
        if (dto.getProdField005() != null && dto.getProdField005().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("prodField005 must not be negative");
        }
        if (dto.getProdField007() != null && dto.getProdField007().isBlank()) {
            errors.add("prodField007 must not be blank if provided");
        }
        if (dto.getProdField008() != null && dto.getProdField008().isBlank()) {
            errors.add("prodField008 must not be blank if provided");
        }
        if (dto.getProdField010() != null && dto.getProdField010().isBlank()) {
            errors.add("prodField010 must not be blank if provided");
        }
        if (dto.getProdField011() != null && dto.getProdField011().isBlank()) {
            errors.add("prodField011 must not be blank if provided");
        }
        if (dto.getProdField013() != null && dto.getProdField013().isBlank()) {
            errors.add("prodField013 must not be blank if provided");
        }
        return errors;
    }
}
