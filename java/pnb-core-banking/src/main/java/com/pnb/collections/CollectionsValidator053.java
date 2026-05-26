package com.pnb.collections;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * CollectionsValidator053 — Business rule validation.
 */
@ApplicationScoped
public class CollectionsValidator053 {

    public List<String> validate(CollectionsDto053 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("collections DTO must not be null");
            return errors;
        }
        if (dto.getCollField008() != null && dto.getCollField008().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("collField008 must not be negative");
        }
        if (dto.getCollField009() != null && dto.getCollField009() < 0) {
            errors.add("collField009 must not be negative");
        }
        return errors;
    }
}
