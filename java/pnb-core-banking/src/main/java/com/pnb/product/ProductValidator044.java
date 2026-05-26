package com.pnb.product;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * ProductValidator044 — Business rule validation.
 */
@ApplicationScoped
public class ProductValidator044 {

    public List<String> validate(ProductDto044 dto) {
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
        if (dto.getProdField003() != null && dto.getProdField003() < 0) {
            errors.add("prodField003 must not be negative");
        }
        if (dto.getProdField013() != null && dto.getProdField013().isBlank()) {
            errors.add("prodField013 must not be blank if provided");
        }
        if (dto.getProdField014() != null && dto.getProdField014().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("prodField014 must not be negative");
        }
        return errors;
    }
}
