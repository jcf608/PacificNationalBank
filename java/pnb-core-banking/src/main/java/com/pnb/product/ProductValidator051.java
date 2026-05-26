package com.pnb.product;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * ProductValidator051 — Business rule validation.
 */
@ApplicationScoped
public class ProductValidator051 {

    public List<String> validate(ProductDto051 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("product DTO must not be null");
            return errors;
        }
        if (dto.getProdField006() != null && dto.getProdField006().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("prodField006 must not be negative");
        }
        if (dto.getProdField007() != null && dto.getProdField007().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("prodField007 must not be negative");
        }
        if (dto.getProdField009() != null && dto.getProdField009() < 0) {
            errors.add("prodField009 must not be negative");
        }
        return errors;
    }
}
