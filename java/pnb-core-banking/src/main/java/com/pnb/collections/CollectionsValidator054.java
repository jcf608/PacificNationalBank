package com.pnb.collections;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * CollectionsValidator054 — Business rule validation.
 */
@ApplicationScoped
public class CollectionsValidator054 {

    public List<String> validate(CollectionsDto054 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("collections DTO must not be null");
            return errors;
        }
        if (dto.getCollField002() != null && dto.getCollField002().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("collField002 must not be negative");
        }
        if (dto.getCollField006() != null && dto.getCollField006().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("collField006 must not be negative");
        }
        if (dto.getCollField007() != null && dto.getCollField007() < 0) {
            errors.add("collField007 must not be negative");
        }
        if (dto.getCollField008() != null && dto.getCollField008() < 0) {
            errors.add("collField008 must not be negative");
        }
        if (dto.getCollField011() != null && dto.getCollField011() < 0) {
            errors.add("collField011 must not be negative");
        }
        if (dto.getCollField013() != null && dto.getCollField013().isBlank()) {
            errors.add("collField013 must not be blank if provided");
        }
        return errors;
    }
}
