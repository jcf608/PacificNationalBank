package com.pnb.collections;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * CollectionsValidator037 — Business rule validation.
 */
@ApplicationScoped
public class CollectionsValidator037 {

    public List<String> validate(CollectionsDto037 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("collections DTO must not be null");
            return errors;
        }
        if (dto.getCollField000() != null && dto.getCollField000().isBlank()) {
            errors.add("collField000 must not be blank if provided");
        }
        if (dto.getCollField001() != null && dto.getCollField001().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("collField001 must not be negative");
        }
        if (dto.getCollField002() != null && dto.getCollField002() < 0) {
            errors.add("collField002 must not be negative");
        }
        if (dto.getCollField005() != null && dto.getCollField005().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("collField005 must not be negative");
        }
        if (dto.getCollField006() != null && dto.getCollField006() < 0) {
            errors.add("collField006 must not be negative");
        }
        if (dto.getCollField007() != null && dto.getCollField007() < 0) {
            errors.add("collField007 must not be negative");
        }
        if (dto.getCollField008() != null && dto.getCollField008().isBlank()) {
            errors.add("collField008 must not be blank if provided");
        }
        return errors;
    }
}
