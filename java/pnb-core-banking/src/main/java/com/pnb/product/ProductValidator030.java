package com.pnb.product;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * ProductValidator030 — Business rule validation.
 */
@ApplicationScoped
public class ProductValidator030 {

    public List<String> validate(ProductDto030 dto) {
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
        if (dto.getProdField004() != null && dto.getProdField004() < 0) {
            errors.add("prodField004 must not be negative");
        }
        if (dto.getProdField006() != null && dto.getProdField006() < 0) {
            errors.add("prodField006 must not be negative");
        }
        if (dto.getProdField007() != null && dto.getProdField007() < 0) {
            errors.add("prodField007 must not be negative");
        }
        if (dto.getProdField010() != null && dto.getProdField010() < 0) {
            errors.add("prodField010 must not be negative");
        }
        return errors;
    }
}
