package com.pnb.collections;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * CollectionsValidator059 — Business rule validation.
 */
@ApplicationScoped
public class CollectionsValidator059 {

    public List<String> validate(CollectionsDto059 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("collections DTO must not be null");
            return errors;
        }
        if (dto.getCollField007() != null && dto.getCollField007().isBlank()) {
            errors.add("collField007 must not be blank if provided");
        }
        if (dto.getCollField009() != null && dto.getCollField009().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("collField009 must not be negative");
        }
        if (dto.getCollField011() != null && dto.getCollField011().isBlank()) {
            errors.add("collField011 must not be blank if provided");
        }
        if (dto.getCollField018() != null && dto.getCollField018().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("collField018 must not be negative");
        }
        return errors;
    }
}
