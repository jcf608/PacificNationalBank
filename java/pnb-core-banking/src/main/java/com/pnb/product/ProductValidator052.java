package com.pnb.product;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * ProductValidator052 — Business rule validation.
 */
@ApplicationScoped
public class ProductValidator052 {

    public List<String> validate(ProductDto052 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("product DTO must not be null");
            return errors;
        }
        if (dto.getProdField002() != null && dto.getProdField002().isBlank()) {
            errors.add("prodField002 must not be blank if provided");
        }
        if (dto.getProdField003() != null && dto.getProdField003() < 0) {
            errors.add("prodField003 must not be negative");
        }
        if (dto.getProdField005() != null && dto.getProdField005().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("prodField005 must not be negative");
        }
        if (dto.getProdField009() != null && dto.getProdField009().isBlank()) {
            errors.add("prodField009 must not be blank if provided");
        }
        if (dto.getProdField011() != null && dto.getProdField011().isBlank()) {
            errors.add("prodField011 must not be blank if provided");
        }
        return errors;
    }
}
