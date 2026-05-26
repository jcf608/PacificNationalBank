package com.pnb.collections;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * CollectionsValidator026 — Business rule validation.
 */
@ApplicationScoped
public class CollectionsValidator026 {

    public List<String> validate(CollectionsDto026 dto) {
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
        if (dto.getCollField009() != null && dto.getCollField009().isBlank()) {
            errors.add("collField009 must not be blank if provided");
        }
        return errors;
    }
}
