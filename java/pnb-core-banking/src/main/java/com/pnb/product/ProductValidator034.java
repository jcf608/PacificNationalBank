package com.pnb.product;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * ProductValidator034 — Business rule validation.
 */
@ApplicationScoped
public class ProductValidator034 {

    public List<String> validate(ProductDto034 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("product DTO must not be null");
            return errors;
        }
        if (dto.getProdField014() != null && dto.getProdField014().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("prodField014 must not be negative");
        }
        if (dto.getProdField017() != null && dto.getProdField017().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("prodField017 must not be negative");
        }
        return errors;
    }
}
