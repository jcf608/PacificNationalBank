package com.pnb.collections;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * CollectionsValidator028 — Business rule validation.
 */
@ApplicationScoped
public class CollectionsValidator028 {

    public List<String> validate(CollectionsDto028 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("collections DTO must not be null");
            return errors;
        }
        if (dto.getCollField006() != null && dto.getCollField006() < 0) {
            errors.add("collField006 must not be negative");
        }
        if (dto.getCollField008() != null && dto.getCollField008() < 0) {
            errors.add("collField008 must not be negative");
        }
        if (dto.getCollField009() != null && dto.getCollField009() < 0) {
            errors.add("collField009 must not be negative");
        }
        if (dto.getCollField010() != null && dto.getCollField010().isBlank()) {
            errors.add("collField010 must not be blank if provided");
        }
        if (dto.getCollField011() != null && dto.getCollField011().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("collField011 must not be negative");
        }
        return errors;
    }
}
