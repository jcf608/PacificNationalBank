package com.pnb.product;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * ProductValidator056 — Business rule validation.
 */
@ApplicationScoped
public class ProductValidator056 {

    public List<String> validate(ProductDto056 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("product DTO must not be null");
            return errors;
        }
        if (dto.getProdField000() != null && dto.getProdField000().isBlank()) {
            errors.add("prodField000 must not be blank if provided");
        }
        if (dto.getProdField002() != null && dto.getProdField002() < 0) {
            errors.add("prodField002 must not be negative");
        }
        if (dto.getProdField004() != null && dto.getProdField004() < 0) {
            errors.add("prodField004 must not be negative");
        }
        if (dto.getProdField007() != null && dto.getProdField007() < 0) {
            errors.add("prodField007 must not be negative");
        }
        if (dto.getProdField008() != null && dto.getProdField008().isBlank()) {
            errors.add("prodField008 must not be blank if provided");
        }
        if (dto.getProdField009() != null && dto.getProdField009() < 0) {
            errors.add("prodField009 must not be negative");
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
        if (dto.getProdField015() != null && dto.getProdField015() < 0) {
            errors.add("prodField015 must not be negative");
        }
        return errors;
    }
}
