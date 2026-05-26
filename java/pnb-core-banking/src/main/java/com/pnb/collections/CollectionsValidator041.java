package com.pnb.collections;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * CollectionsValidator041 — Business rule validation.
 */
@ApplicationScoped
public class CollectionsValidator041 {

    public List<String> validate(CollectionsDto041 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("collections DTO must not be null");
            return errors;
        }
        if (dto.getCollField001() != null && dto.getCollField001() < 0) {
            errors.add("collField001 must not be negative");
        }
        if (dto.getCollField006() != null && dto.getCollField006() < 0) {
            errors.add("collField006 must not be negative");
        }
        if (dto.getCollField007() != null && dto.getCollField007() < 0) {
            errors.add("collField007 must not be negative");
        }
        if (dto.getCollField012() != null && dto.getCollField012() < 0) {
            errors.add("collField012 must not be negative");
        }
        return errors;
    }
}
