package com.pnb.collections;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * CollectionsValidator042 — Business rule validation.
 */
@ApplicationScoped
public class CollectionsValidator042 {

    public List<String> validate(CollectionsDto042 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("collections DTO must not be null");
            return errors;
        }
        if (dto.getCollField001() != null && dto.getCollField001() < 0) {
            errors.add("collField001 must not be negative");
        }
        if (dto.getCollField002() != null && dto.getCollField002() < 0) {
            errors.add("collField002 must not be negative");
        }
        if (dto.getCollField004() != null && dto.getCollField004().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("collField004 must not be negative");
        }
        if (dto.getCollField006() != null && dto.getCollField006().isBlank()) {
            errors.add("collField006 must not be blank if provided");
        }
        if (dto.getCollField007() != null && dto.getCollField007().isBlank()) {
            errors.add("collField007 must not be blank if provided");
        }
        if (dto.getCollField010() != null && dto.getCollField010() < 0) {
            errors.add("collField010 must not be negative");
        }
        if (dto.getCollField013() != null && dto.getCollField013().isBlank()) {
            errors.add("collField013 must not be blank if provided");
        }
        return errors;
    }
}
