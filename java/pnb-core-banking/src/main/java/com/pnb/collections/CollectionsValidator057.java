package com.pnb.collections;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * CollectionsValidator057 — Business rule validation.
 */
@ApplicationScoped
public class CollectionsValidator057 {

    public List<String> validate(CollectionsDto057 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("collections DTO must not be null");
            return errors;
        }
        if (dto.getCollField002() != null && dto.getCollField002().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("collField002 must not be negative");
        }
        if (dto.getCollField005() != null && dto.getCollField005().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("collField005 must not be negative");
        }
        if (dto.getCollField007() != null && dto.getCollField007().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("collField007 must not be negative");
        }
        if (dto.getCollField012() != null && dto.getCollField012().isBlank()) {
            errors.add("collField012 must not be blank if provided");
        }
        if (dto.getCollField013() != null && dto.getCollField013().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("collField013 must not be negative");
        }
        if (dto.getCollField015() != null && dto.getCollField015().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("collField015 must not be negative");
        }
        return errors;
    }
}
