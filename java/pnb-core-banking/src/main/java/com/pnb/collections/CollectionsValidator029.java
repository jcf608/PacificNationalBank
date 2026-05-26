package com.pnb.collections;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * CollectionsValidator029 — Business rule validation.
 */
@ApplicationScoped
public class CollectionsValidator029 {

    public List<String> validate(CollectionsDto029 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("collections DTO must not be null");
            return errors;
        }
        if (dto.getCollField000() != null && dto.getCollField000().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("collField000 must not be negative");
        }
        if (dto.getCollField003() != null && dto.getCollField003() < 0) {
            errors.add("collField003 must not be negative");
        }
        if (dto.getCollField005() != null && dto.getCollField005() < 0) {
            errors.add("collField005 must not be negative");
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
