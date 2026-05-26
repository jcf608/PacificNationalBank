package com.pnb.collections;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * CollectionsValidator058 — Business rule validation.
 */
@ApplicationScoped
public class CollectionsValidator058 {

    public List<String> validate(CollectionsDto058 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("collections DTO must not be null");
            return errors;
        }
        if (dto.getCollField002() != null && dto.getCollField002().isBlank()) {
            errors.add("collField002 must not be blank if provided");
        }
        if (dto.getCollField006() != null && dto.getCollField006().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("collField006 must not be negative");
        }
        if (dto.getCollField007() != null && dto.getCollField007().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("collField007 must not be negative");
        }
        if (dto.getCollField009() != null && dto.getCollField009().isBlank()) {
            errors.add("collField009 must not be blank if provided");
        }
        if (dto.getCollField012() != null && dto.getCollField012().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("collField012 must not be negative");
        }
        if (dto.getCollField013() != null && dto.getCollField013() < 0) {
            errors.add("collField013 must not be negative");
        }
        if (dto.getCollField016() != null && dto.getCollField016().isBlank()) {
            errors.add("collField016 must not be blank if provided");
        }
        if (dto.getCollField017() != null && dto.getCollField017().isBlank()) {
            errors.add("collField017 must not be blank if provided");
        }
        return errors;
    }
}
