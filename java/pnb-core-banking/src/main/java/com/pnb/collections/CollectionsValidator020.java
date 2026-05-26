package com.pnb.collections;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * CollectionsValidator020 — Business rule validation.
 */
@ApplicationScoped
public class CollectionsValidator020 {

    public List<String> validate(CollectionsDto020 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("collections DTO must not be null");
            return errors;
        }
        if (dto.getCollField005() != null && dto.getCollField005().isBlank()) {
            errors.add("collField005 must not be blank if provided");
        }
        if (dto.getCollField006() != null && dto.getCollField006().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("collField006 must not be negative");
        }
        if (dto.getCollField015() != null && dto.getCollField015().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("collField015 must not be negative");
        }
        return errors;
    }
}
