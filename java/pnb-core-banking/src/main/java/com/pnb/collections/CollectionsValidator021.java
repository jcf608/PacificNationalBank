package com.pnb.collections;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * CollectionsValidator021 — Business rule validation.
 */
@ApplicationScoped
public class CollectionsValidator021 {

    public List<String> validate(CollectionsDto021 dto) {
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
        if (dto.getCollField007() != null && dto.getCollField007() < 0) {
            errors.add("collField007 must not be negative");
        }
        if (dto.getCollField010() != null && dto.getCollField010().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("collField010 must not be negative");
        }
        if (dto.getCollField014() != null && dto.getCollField014() < 0) {
            errors.add("collField014 must not be negative");
        }
        return errors;
    }
}
