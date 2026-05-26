package com.pnb.collections;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * CollectionsValidator047 — Business rule validation.
 */
@ApplicationScoped
public class CollectionsValidator047 {

    public List<String> validate(CollectionsDto047 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("collections DTO must not be null");
            return errors;
        }
        if (dto.getCollField000() != null && dto.getCollField000() < 0) {
            errors.add("collField000 must not be negative");
        }
        if (dto.getCollField002() != null && dto.getCollField002() < 0) {
            errors.add("collField002 must not be negative");
        }
        if (dto.getCollField004() != null && dto.getCollField004().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("collField004 must not be negative");
        }
        if (dto.getCollField008() != null && dto.getCollField008().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("collField008 must not be negative");
        }
        if (dto.getCollField009() != null && dto.getCollField009() < 0) {
            errors.add("collField009 must not be negative");
        }
        if (dto.getCollField011() != null && dto.getCollField011() < 0) {
            errors.add("collField011 must not be negative");
        }
        if (dto.getCollField012() != null && dto.getCollField012().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("collField012 must not be negative");
        }
        if (dto.getCollField016() != null && dto.getCollField016() < 0) {
            errors.add("collField016 must not be negative");
        }
        return errors;
    }
}
