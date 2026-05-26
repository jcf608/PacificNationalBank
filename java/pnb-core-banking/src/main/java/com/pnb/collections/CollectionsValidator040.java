package com.pnb.collections;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * CollectionsValidator040 — Business rule validation.
 */
@ApplicationScoped
public class CollectionsValidator040 {

    public List<String> validate(CollectionsDto040 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("collections DTO must not be null");
            return errors;
        }
        if (dto.getCollField000() != null && dto.getCollField000() < 0) {
            errors.add("collField000 must not be negative");
        }
        if (dto.getCollField002() != null && dto.getCollField002() < 0) {
            errors.add("collField002 must not be negative");
        }
        if (dto.getCollField003() != null && dto.getCollField003().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("collField003 must not be negative");
        }
        if (dto.getCollField007() != null && dto.getCollField007().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("collField007 must not be negative");
        }
        if (dto.getCollField008() != null && dto.getCollField008() < 0) {
            errors.add("collField008 must not be negative");
        }
        if (dto.getCollField009() != null && dto.getCollField009().isBlank()) {
            errors.add("collField009 must not be blank if provided");
        }
        return errors;
    }
}
