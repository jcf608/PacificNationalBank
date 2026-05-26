package com.pnb.collections;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * CollectionsValidator034 — Business rule validation.
 */
@ApplicationScoped
public class CollectionsValidator034 {

    public List<String> validate(CollectionsDto034 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("collections DTO must not be null");
            return errors;
        }
        if (dto.getCollField000() != null && dto.getCollField000().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("collField000 must not be negative");
        }
        if (dto.getCollField002() != null && dto.getCollField002().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("collField002 must not be negative");
        }
        if (dto.getCollField008() != null && dto.getCollField008().isBlank()) {
            errors.add("collField008 must not be blank if provided");
        }
        if (dto.getCollField010() != null && dto.getCollField010().isBlank()) {
            errors.add("collField010 must not be blank if provided");
        }
        if (dto.getCollField011() != null && dto.getCollField011().isBlank()) {
            errors.add("collField011 must not be blank if provided");
        }
        if (dto.getCollField014() != null && dto.getCollField014().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("collField014 must not be negative");
        }
        if (dto.getCollField017() != null && dto.getCollField017() < 0) {
            errors.add("collField017 must not be negative");
        }
        return errors;
    }
}
