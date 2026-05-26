package com.pnb.product;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * ProductValidator027 — Business rule validation.
 */
@ApplicationScoped
public class ProductValidator027 {

    public List<String> validate(ProductDto027 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("product DTO must not be null");
            return errors;
        }
        if (dto.getProdField000() != null && dto.getProdField000() < 0) {
            errors.add("prodField000 must not be negative");
        }
        if (dto.getProdField001() != null && dto.getProdField001() < 0) {
            errors.add("prodField001 must not be negative");
        }
        if (dto.getProdField002() != null && dto.getProdField002() < 0) {
            errors.add("prodField002 must not be negative");
        }
        if (dto.getProdField003() != null && dto.getProdField003().isBlank()) {
            errors.add("prodField003 must not be blank if provided");
        }
        if (dto.getProdField005() != null && dto.getProdField005().isBlank()) {
            errors.add("prodField005 must not be blank if provided");
        }
        if (dto.getProdField006() != null && dto.getProdField006() < 0) {
            errors.add("prodField006 must not be negative");
        }
        if (dto.getProdField008() != null && dto.getProdField008().isBlank()) {
            errors.add("prodField008 must not be blank if provided");
        }
        if (dto.getProdField010() != null && dto.getProdField010().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("prodField010 must not be negative");
        }
        return errors;
    }
}
