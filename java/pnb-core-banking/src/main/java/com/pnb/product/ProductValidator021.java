package com.pnb.product;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * ProductValidator021 — Business rule validation.
 */
@ApplicationScoped
public class ProductValidator021 {

    public List<String> validate(ProductDto021 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("product DTO must not be null");
            return errors;
        }
        if (dto.getProdField001() != null && dto.getProdField001().isBlank()) {
            errors.add("prodField001 must not be blank if provided");
        }
        if (dto.getProdField005() != null && dto.getProdField005().isBlank()) {
            errors.add("prodField005 must not be blank if provided");
        }
        if (dto.getProdField011() != null && dto.getProdField011() < 0) {
            errors.add("prodField011 must not be negative");
        }
        if (dto.getProdField012() != null && dto.getProdField012().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("prodField012 must not be negative");
        }
        if (dto.getProdField013() != null && dto.getProdField013().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("prodField013 must not be negative");
        }
        return errors;
    }
}
