package com.pnb.collections;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * CollectionsValidator046 — Business rule validation.
 */
@ApplicationScoped
public class CollectionsValidator046 {

    public List<String> validate(CollectionsDto046 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("collections DTO must not be null");
            return errors;
        }
        if (dto.getCollField000() != null && dto.getCollField000().isBlank()) {
            errors.add("collField000 must not be blank if provided");
        }
        if (dto.getCollField001() != null && dto.getCollField001() < 0) {
            errors.add("collField001 must not be negative");
        }
        if (dto.getCollField003() != null && dto.getCollField003().isBlank()) {
            errors.add("collField003 must not be blank if provided");
        }
        if (dto.getCollField004() != null && dto.getCollField004().isBlank()) {
            errors.add("collField004 must not be blank if provided");
        }
        if (dto.getCollField010() != null && dto.getCollField010() < 0) {
            errors.add("collField010 must not be negative");
        }
        if (dto.getCollField011() != null && dto.getCollField011().isBlank()) {
            errors.add("collField011 must not be blank if provided");
        }
        if (dto.getCollField013() != null && dto.getCollField013().isBlank()) {
            errors.add("collField013 must not be blank if provided");
        }
        if (dto.getCollField014() != null && dto.getCollField014() < 0) {
            errors.add("collField014 must not be negative");
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
