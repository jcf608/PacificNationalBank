package com.pnb.product;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * ProductValidator023 — Business rule validation.
 */
@ApplicationScoped
public class ProductValidator023 {

    public List<String> validate(ProductDto023 dto) {
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
        if (dto.getProdField005() != null && dto.getProdField005() < 0) {
            errors.add("prodField005 must not be negative");
        }
        if (dto.getProdField006() != null && dto.getProdField006().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("prodField006 must not be negative");
        }
        if (dto.getProdField007() != null && dto.getProdField007() < 0) {
            errors.add("prodField007 must not be negative");
        }
        if (dto.getProdField011() != null && dto.getProdField011() < 0) {
            errors.add("prodField011 must not be negative");
        }
        if (dto.getProdField013() != null && dto.getProdField013().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("prodField013 must not be negative");
        }
        if (dto.getProdField014() != null && dto.getProdField014().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("prodField014 must not be negative");
        }
        if (dto.getProdField016() != null && dto.getProdField016().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("prodField016 must not be negative");
        }
        return errors;
    }
}
