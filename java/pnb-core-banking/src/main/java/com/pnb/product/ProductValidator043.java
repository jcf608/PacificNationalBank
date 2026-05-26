package com.pnb.product;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * ProductValidator043 — Business rule validation.
 */
@ApplicationScoped
public class ProductValidator043 {

    public List<String> validate(ProductDto043 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("product DTO must not be null");
            return errors;
        }
        if (dto.getProdField002() != null && dto.getProdField002().isBlank()) {
            errors.add("prodField002 must not be blank if provided");
        }
        if (dto.getProdField004() != null && dto.getProdField004() < 0) {
            errors.add("prodField004 must not be negative");
        }
        if (dto.getProdField005() != null && dto.getProdField005() < 0) {
            errors.add("prodField005 must not be negative");
        }
        if (dto.getProdField006() != null && dto.getProdField006().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("prodField006 must not be negative");
        }
        if (dto.getProdField009() != null && dto.getProdField009().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("prodField009 must not be negative");
        }
        if (dto.getProdField012() != null && dto.getProdField012().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("prodField012 must not be negative");
        }
        if (dto.getProdField013() != null && dto.getProdField013() < 0) {
            errors.add("prodField013 must not be negative");
        }
        return errors;
    }
}
