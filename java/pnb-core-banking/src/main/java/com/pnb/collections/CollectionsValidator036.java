package com.pnb.collections;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * CollectionsValidator036 — Business rule validation.
 */
@ApplicationScoped
public class CollectionsValidator036 {

    public List<String> validate(CollectionsDto036 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("collections DTO must not be null");
            return errors;
        }
        if (dto.getCollField000() != null && dto.getCollField000() < 0) {
            errors.add("collField000 must not be negative");
        }
        if (dto.getCollField002() != null && dto.getCollField002().isBlank()) {
            errors.add("collField002 must not be blank if provided");
        }
        return errors;
    }
}
