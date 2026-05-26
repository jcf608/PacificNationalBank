package com.pnb.product;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * ProductValidator036 — Business rule validation.
 */
@ApplicationScoped
public class ProductValidator036 {

    public List<String> validate(ProductDto036 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("product DTO must not be null");
            return errors;
        }
        if (dto.getProdField000() != null && dto.getProdField000().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("prodField000 must not be negative");
        }
        if (dto.getProdField003() != null && dto.getProdField003() < 0) {
            errors.add("prodField003 must not be negative");
        }
        if (dto.getProdField007() != null && dto.getProdField007().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("prodField007 must not be negative");
        }
        return errors;
    }
}
