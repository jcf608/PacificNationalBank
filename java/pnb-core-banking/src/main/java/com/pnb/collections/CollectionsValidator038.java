package com.pnb.collections;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * CollectionsValidator038 — Business rule validation.
 */
@ApplicationScoped
public class CollectionsValidator038 {

    public List<String> validate(CollectionsDto038 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("collections DTO must not be null");
            return errors;
        }
        if (dto.getCollField000() != null && dto.getCollField000().isBlank()) {
            errors.add("collField000 must not be blank if provided");
        }
        if (dto.getCollField003() != null && dto.getCollField003().isBlank()) {
            errors.add("collField003 must not be blank if provided");
        }
        if (dto.getCollField005() != null && dto.getCollField005().isBlank()) {
            errors.add("collField005 must not be blank if provided");
        }
        return errors;
    }
}
