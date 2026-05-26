package com.pnb.collections;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * CollectionsValidator023 — Business rule validation.
 */
@ApplicationScoped
public class CollectionsValidator023 {

    public List<String> validate(CollectionsDto023 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("collections DTO must not be null");
            return errors;
        }
        if (dto.getCollField000() != null && dto.getCollField000() < 0) {
            errors.add("collField000 must not be negative");
        }
        if (dto.getCollField002() != null && dto.getCollField002().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("collField002 must not be negative");
        }
        if (dto.getCollField003() != null && dto.getCollField003().isBlank()) {
            errors.add("collField003 must not be blank if provided");
        }
        if (dto.getCollField006() != null && dto.getCollField006().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("collField006 must not be negative");
        }
        if (dto.getCollField007() != null && dto.getCollField007().isBlank()) {
            errors.add("collField007 must not be blank if provided");
        }
        if (dto.getCollField008() != null && dto.getCollField008() < 0) {
            errors.add("collField008 must not be negative");
        }
        if (dto.getCollField011() != null && dto.getCollField011() < 0) {
            errors.add("collField011 must not be negative");
        }
        if (dto.getCollField012() != null && dto.getCollField012().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("collField012 must not be negative");
        }
        if (dto.getCollField013() != null && dto.getCollField013().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("collField013 must not be negative");
        }
        if (dto.getCollField014() != null && dto.getCollField014() < 0) {
            errors.add("collField014 must not be negative");
        }
        if (dto.getCollField016() != null && dto.getCollField016().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("collField016 must not be negative");
        }
        if (dto.getCollField017() != null && dto.getCollField017().isBlank()) {
            errors.add("collField017 must not be blank if provided");
        }
        if (dto.getCollField018() != null && dto.getCollField018().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("collField018 must not be negative");
        }
        return errors;
    }
}
