package com.pnb.collections;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * CollectionsValidator022 — Business rule validation.
 */
@ApplicationScoped
public class CollectionsValidator022 {

    public List<String> validate(CollectionsDto022 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("collections DTO must not be null");
            return errors;
        }
        if (dto.getCollField003() != null && dto.getCollField003() < 0) {
            errors.add("collField003 must not be negative");
        }
        if (dto.getCollField005() != null && dto.getCollField005().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("collField005 must not be negative");
        }
        if (dto.getCollField007() != null && dto.getCollField007() < 0) {
            errors.add("collField007 must not be negative");
        }
        if (dto.getCollField008() != null && dto.getCollField008().isBlank()) {
            errors.add("collField008 must not be blank if provided");
        }
        if (dto.getCollField010() != null && dto.getCollField010().isBlank()) {
            errors.add("collField010 must not be blank if provided");
        }
        if (dto.getCollField011() != null && dto.getCollField011().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("collField011 must not be negative");
        }
        if (dto.getCollField012() != null && dto.getCollField012().isBlank()) {
            errors.add("collField012 must not be blank if provided");
        }
        if (dto.getCollField015() != null && dto.getCollField015().isBlank()) {
            errors.add("collField015 must not be blank if provided");
        }
        if (dto.getCollField016() != null && dto.getCollField016().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("collField016 must not be negative");
        }
        if (dto.getCollField017() != null && dto.getCollField017().isBlank()) {
            errors.add("collField017 must not be blank if provided");
        }
        return errors;
    }
}
