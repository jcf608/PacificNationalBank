package com.pnb.collections;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * CollectionsValidator032 — Business rule validation.
 */
@ApplicationScoped
public class CollectionsValidator032 {

    public List<String> validate(CollectionsDto032 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("collections DTO must not be null");
            return errors;
        }
        if (dto.getCollField000() != null && dto.getCollField000() < 0) {
            errors.add("collField000 must not be negative");
        }
        if (dto.getCollField001() != null && dto.getCollField001() < 0) {
            errors.add("collField001 must not be negative");
        }
        if (dto.getCollField005() != null && dto.getCollField005().isBlank()) {
            errors.add("collField005 must not be blank if provided");
        }
        if (dto.getCollField007() != null && dto.getCollField007().isBlank()) {
            errors.add("collField007 must not be blank if provided");
        }
        if (dto.getCollField009() != null && dto.getCollField009().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("collField009 must not be negative");
        }
        if (dto.getCollField015() != null && dto.getCollField015().isBlank()) {
            errors.add("collField015 must not be blank if provided");
        }
        return errors;
    }
}
