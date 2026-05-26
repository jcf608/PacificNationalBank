package com.pnb.collections;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * CollectionsValidator044 — Business rule validation.
 */
@ApplicationScoped
public class CollectionsValidator044 {

    public List<String> validate(CollectionsDto044 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("collections DTO must not be null");
            return errors;
        }
        if (dto.getCollField001() != null && dto.getCollField001().isBlank()) {
            errors.add("collField001 must not be blank if provided");
        }
        if (dto.getCollField002() != null && dto.getCollField002() < 0) {
            errors.add("collField002 must not be negative");
        }
        if (dto.getCollField003() != null && dto.getCollField003() < 0) {
            errors.add("collField003 must not be negative");
        }
        if (dto.getCollField004() != null && dto.getCollField004() < 0) {
            errors.add("collField004 must not be negative");
        }
        if (dto.getCollField005() != null && dto.getCollField005() < 0) {
            errors.add("collField005 must not be negative");
        }
        if (dto.getCollField006() != null && dto.getCollField006().isBlank()) {
            errors.add("collField006 must not be blank if provided");
        }
        if (dto.getCollField008() != null && dto.getCollField008() < 0) {
            errors.add("collField008 must not be negative");
        }
        if (dto.getCollField009() != null && dto.getCollField009() < 0) {
            errors.add("collField009 must not be negative");
        }
        if (dto.getCollField011() != null && dto.getCollField011().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("collField011 must not be negative");
        }
        if (dto.getCollField012() != null && dto.getCollField012() < 0) {
            errors.add("collField012 must not be negative");
        }
        return errors;
    }
}
