package com.pnb.collections;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * CollectionsValidator056 — Business rule validation.
 */
@ApplicationScoped
public class CollectionsValidator056 {

    public List<String> validate(CollectionsDto056 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("collections DTO must not be null");
            return errors;
        }
        if (dto.getCollField001() != null && dto.getCollField001().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("collField001 must not be negative");
        }
        if (dto.getCollField003() != null && dto.getCollField003() < 0) {
            errors.add("collField003 must not be negative");
        }
        if (dto.getCollField004() != null && dto.getCollField004().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("collField004 must not be negative");
        }
        if (dto.getCollField009() != null && dto.getCollField009().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("collField009 must not be negative");
        }
        if (dto.getCollField011() != null && dto.getCollField011().isBlank()) {
            errors.add("collField011 must not be blank if provided");
        }
        if (dto.getCollField012() != null && dto.getCollField012() < 0) {
            errors.add("collField012 must not be negative");
        }
        if (dto.getCollField013() != null && dto.getCollField013() < 0) {
            errors.add("collField013 must not be negative");
        }
        return errors;
    }
}
