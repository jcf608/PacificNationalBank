package com.pnb.collections;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * CollectionsValidator043 — Business rule validation.
 */
@ApplicationScoped
public class CollectionsValidator043 {

    public List<String> validate(CollectionsDto043 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("collections DTO must not be null");
            return errors;
        }
        if (dto.getCollField003() != null && dto.getCollField003().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("collField003 must not be negative");
        }
        if (dto.getCollField008() != null && dto.getCollField008().isBlank()) {
            errors.add("collField008 must not be blank if provided");
        }
        if (dto.getCollField009() != null && dto.getCollField009() < 0) {
            errors.add("collField009 must not be negative");
        }
        if (dto.getCollField010() != null && dto.getCollField010() < 0) {
            errors.add("collField010 must not be negative");
        }
        if (dto.getCollField011() != null && dto.getCollField011().isBlank()) {
            errors.add("collField011 must not be blank if provided");
        }
        return errors;
    }
}
