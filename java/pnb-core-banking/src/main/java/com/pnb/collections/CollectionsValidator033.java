package com.pnb.collections;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * CollectionsValidator033 — Business rule validation.
 */
@ApplicationScoped
public class CollectionsValidator033 {

    public List<String> validate(CollectionsDto033 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("collections DTO must not be null");
            return errors;
        }
        if (dto.getCollField000() != null && dto.getCollField000().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("collField000 must not be negative");
        }
        if (dto.getCollField003() != null && dto.getCollField003().isBlank()) {
            errors.add("collField003 must not be blank if provided");
        }
        if (dto.getCollField004() != null && dto.getCollField004().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("collField004 must not be negative");
        }
        if (dto.getCollField006() != null && dto.getCollField006().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("collField006 must not be negative");
        }
        if (dto.getCollField007() != null && dto.getCollField007().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("collField007 must not be negative");
        }
        if (dto.getCollField010() != null && dto.getCollField010().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("collField010 must not be negative");
        }
        if (dto.getCollField015() != null && dto.getCollField015() < 0) {
            errors.add("collField015 must not be negative");
        }
        if (dto.getCollField016() != null && dto.getCollField016().isBlank()) {
            errors.add("collField016 must not be blank if provided");
        }
        return errors;
    }
}
