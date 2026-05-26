package com.pnb.collections;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * CollectionsValidator048 — Business rule validation.
 */
@ApplicationScoped
public class CollectionsValidator048 {

    public List<String> validate(CollectionsDto048 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("collections DTO must not be null");
            return errors;
        }
        if (dto.getCollField000() != null && dto.getCollField000().isBlank()) {
            errors.add("collField000 must not be blank if provided");
        }
        if (dto.getCollField001() != null && dto.getCollField001() < 0) {
            errors.add("collField001 must not be negative");
        }
        if (dto.getCollField002() != null && dto.getCollField002() < 0) {
            errors.add("collField002 must not be negative");
        }
        if (dto.getCollField004() != null && dto.getCollField004() < 0) {
            errors.add("collField004 must not be negative");
        }
        if (dto.getCollField005() != null && dto.getCollField005() < 0) {
            errors.add("collField005 must not be negative");
        }
        if (dto.getCollField007() != null && dto.getCollField007() < 0) {
            errors.add("collField007 must not be negative");
        }
        return errors;
    }
}
