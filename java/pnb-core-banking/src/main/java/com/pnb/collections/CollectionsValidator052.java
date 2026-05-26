package com.pnb.collections;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * CollectionsValidator052 — Business rule validation.
 */
@ApplicationScoped
public class CollectionsValidator052 {

    public List<String> validate(CollectionsDto052 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("collections DTO must not be null");
            return errors;
        }
        if (dto.getCollField001() != null && dto.getCollField001().isBlank()) {
            errors.add("collField001 must not be blank if provided");
        }
        if (dto.getCollField006() != null && dto.getCollField006() < 0) {
            errors.add("collField006 must not be negative");
        }
        if (dto.getCollField011() != null && dto.getCollField011() < 0) {
            errors.add("collField011 must not be negative");
        }
        return errors;
    }
}
