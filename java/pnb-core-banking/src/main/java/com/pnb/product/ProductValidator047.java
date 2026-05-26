package com.pnb.product;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * ProductValidator047 — Business rule validation.
 */
@ApplicationScoped
public class ProductValidator047 {

    public List<String> validate(ProductDto047 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("product DTO must not be null");
            return errors;
        }
        if (dto.getProdField000() != null && dto.getProdField000().isBlank()) {
            errors.add("prodField000 must not be blank if provided");
        }
        if (dto.getProdField001() != null && dto.getProdField001() < 0) {
            errors.add("prodField001 must not be negative");
        }
        if (dto.getProdField005() != null && dto.getProdField005().isBlank()) {
            errors.add("prodField005 must not be blank if provided");
        }
        if (dto.getProdField006() != null && dto.getProdField006().isBlank()) {
            errors.add("prodField006 must not be blank if provided");
        }
        if (dto.getProdField013() != null && dto.getProdField013().isBlank()) {
            errors.add("prodField013 must not be blank if provided");
        }
        if (dto.getProdField016() != null && dto.getProdField016() < 0) {
            errors.add("prodField016 must not be negative");
        }
        if (dto.getProdField017() != null && dto.getProdField017() < 0) {
            errors.add("prodField017 must not be negative");
        }
        if (dto.getProdField018() != null && dto.getProdField018().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("prodField018 must not be negative");
        }
        return errors;
    }
}
