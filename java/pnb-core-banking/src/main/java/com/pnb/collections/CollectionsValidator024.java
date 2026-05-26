package com.pnb.collections;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * CollectionsValidator024 — Business rule validation.
 */
@ApplicationScoped
public class CollectionsValidator024 {

    public List<String> validate(CollectionsDto024 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("collections DTO must not be null");
            return errors;
        }
        if (dto.getCollField004() != null && dto.getCollField004().isBlank()) {
            errors.add("collField004 must not be blank if provided");
        }
        if (dto.getCollField006() != null && dto.getCollField006().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("collField006 must not be negative");
        }
        if (dto.getCollField007() != null && dto.getCollField007() < 0) {
            errors.add("collField007 must not be negative");
        }
        return errors;
    }
}
