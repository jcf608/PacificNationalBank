package com.pnb.product;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * ProductValidator042 — Business rule validation.
 */
@ApplicationScoped
public class ProductValidator042 {

    public List<String> validate(ProductDto042 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("product DTO must not be null");
            return errors;
        }
        if (dto.getProdField002() != null && dto.getProdField002().isBlank()) {
            errors.add("prodField002 must not be blank if provided");
        }
        if (dto.getProdField003() != null && dto.getProdField003().isBlank()) {
            errors.add("prodField003 must not be blank if provided");
        }
        if (dto.getProdField004() != null && dto.getProdField004().isBlank()) {
            errors.add("prodField004 must not be blank if provided");
        }
        if (dto.getProdField006() != null && dto.getProdField006() < 0) {
            errors.add("prodField006 must not be negative");
        }
        if (dto.getProdField007() != null && dto.getProdField007().isBlank()) {
            errors.add("prodField007 must not be blank if provided");
        }
        if (dto.getProdField008() != null && dto.getProdField008().isBlank()) {
            errors.add("prodField008 must not be blank if provided");
        }
        if (dto.getProdField013() != null && dto.getProdField013().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("prodField013 must not be negative");
        }
        return errors;
    }
}
