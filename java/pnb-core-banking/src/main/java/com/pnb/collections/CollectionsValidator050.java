package com.pnb.collections;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * CollectionsValidator050 — Business rule validation.
 */
@ApplicationScoped
public class CollectionsValidator050 {

    public List<String> validate(CollectionsDto050 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("collections DTO must not be null");
            return errors;
        }
        if (dto.getCollField000() != null && dto.getCollField000() < 0) {
            errors.add("collField000 must not be negative");
        }
        if (dto.getCollField002() != null && dto.getCollField002().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("collField002 must not be negative");
        }
        if (dto.getCollField005() != null && dto.getCollField005() < 0) {
            errors.add("collField005 must not be negative");
        }
        if (dto.getCollField006() != null && dto.getCollField006().isBlank()) {
            errors.add("collField006 must not be blank if provided");
        }
        if (dto.getCollField007() != null && dto.getCollField007().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("collField007 must not be negative");
        }
        if (dto.getCollField009() != null && dto.getCollField009().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("collField009 must not be negative");
        }
        return errors;
    }
}
