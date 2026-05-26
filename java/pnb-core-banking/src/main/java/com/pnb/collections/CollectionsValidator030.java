package com.pnb.collections;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * CollectionsValidator030 — Business rule validation.
 */
@ApplicationScoped
public class CollectionsValidator030 {

    public List<String> validate(CollectionsDto030 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("collections DTO must not be null");
            return errors;
        }
        if (dto.getCollField000() != null && dto.getCollField000().isBlank()) {
            errors.add("collField000 must not be blank if provided");
        }
        if (dto.getCollField002() != null && dto.getCollField002() < 0) {
            errors.add("collField002 must not be negative");
        }
        if (dto.getCollField003() != null && dto.getCollField003().isBlank()) {
            errors.add("collField003 must not be blank if provided");
        }
        if (dto.getCollField004() != null && dto.getCollField004().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("collField004 must not be negative");
        }
        if (dto.getCollField010() != null && dto.getCollField010().isBlank()) {
            errors.add("collField010 must not be blank if provided");
        }
        if (dto.getCollField011() != null && dto.getCollField011() < 0) {
            errors.add("collField011 must not be negative");
        }
        if (dto.getCollField012() != null && dto.getCollField012() < 0) {
            errors.add("collField012 must not be negative");
        }
        if (dto.getCollField013() != null && dto.getCollField013() < 0) {
            errors.add("collField013 must not be negative");
        }
        return errors;
    }
}
