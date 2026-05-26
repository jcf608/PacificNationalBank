package com.pnb.collections;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * CollectionsValidator027 — Business rule validation.
 */
@ApplicationScoped
public class CollectionsValidator027 {

    public List<String> validate(CollectionsDto027 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("collections DTO must not be null");
            return errors;
        }
        if (dto.getCollField000() != null && dto.getCollField000() < 0) {
            errors.add("collField000 must not be negative");
        }
        if (dto.getCollField001() != null && dto.getCollField001().isBlank()) {
            errors.add("collField001 must not be blank if provided");
        }
        if (dto.getCollField003() != null && dto.getCollField003().isBlank()) {
            errors.add("collField003 must not be blank if provided");
        }
        if (dto.getCollField008() != null && dto.getCollField008().isBlank()) {
            errors.add("collField008 must not be blank if provided");
        }
        if (dto.getCollField009() != null && dto.getCollField009().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("collField009 must not be negative");
        }
        if (dto.getCollField010() != null && dto.getCollField010().isBlank()) {
            errors.add("collField010 must not be blank if provided");
        }
        return errors;
    }
}
