package com.pnb.collections;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * CollectionsValidator035 — Business rule validation.
 */
@ApplicationScoped
public class CollectionsValidator035 {

    public List<String> validate(CollectionsDto035 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("collections DTO must not be null");
            return errors;
        }
        if (dto.getCollField000() != null && dto.getCollField000().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("collField000 must not be negative");
        }
        if (dto.getCollField005() != null && dto.getCollField005().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("collField005 must not be negative");
        }
        if (dto.getCollField008() != null && dto.getCollField008().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("collField008 must not be negative");
        }
        if (dto.getCollField009() != null && dto.getCollField009().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("collField009 must not be negative");
        }
        if (dto.getCollField010() != null && dto.getCollField010() < 0) {
            errors.add("collField010 must not be negative");
        }
        if (dto.getCollField017() != null && dto.getCollField017().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("collField017 must not be negative");
        }
        return errors;
    }
}
