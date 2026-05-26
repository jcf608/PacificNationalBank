package com.pnb.product;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * ProductValidator058 — Business rule validation.
 */
@ApplicationScoped
public class ProductValidator058 {

    public List<String> validate(ProductDto058 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("product DTO must not be null");
            return errors;
        }
        if (dto.getProdField001() != null && dto.getProdField001().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("prodField001 must not be negative");
        }
        if (dto.getProdField002() != null && dto.getProdField002().isBlank()) {
            errors.add("prodField002 must not be blank if provided");
        }
        if (dto.getProdField003() != null && dto.getProdField003().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("prodField003 must not be negative");
        }
        if (dto.getProdField006() != null && dto.getProdField006().isBlank()) {
            errors.add("prodField006 must not be blank if provided");
        }
        if (dto.getProdField007() != null && dto.getProdField007().isBlank()) {
            errors.add("prodField007 must not be blank if provided");
        }
        if (dto.getProdField010() != null && dto.getProdField010().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("prodField010 must not be negative");
        }
        if (dto.getProdField013() != null && dto.getProdField013() < 0) {
            errors.add("prodField013 must not be negative");
        }
        if (dto.getProdField015() != null && dto.getProdField015().isBlank()) {
            errors.add("prodField015 must not be blank if provided");
        }
        if (dto.getProdField016() != null && dto.getProdField016().isBlank()) {
            errors.add("prodField016 must not be blank if provided");
        }
        return errors;
    }
}
