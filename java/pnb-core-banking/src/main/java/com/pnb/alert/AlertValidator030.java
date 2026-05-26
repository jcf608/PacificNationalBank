package com.pnb.alert;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * AlertValidator030 — Business rule validation.
 */
@ApplicationScoped
public class AlertValidator030 {

    public List<String> validate(AlertDto030 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("alert DTO must not be null");
            return errors;
        }
        if (dto.getAlerField000() != null && dto.getAlerField000().isBlank()) {
            errors.add("alerField000 must not be blank if provided");
        }
        if (dto.getAlerField001() != null && dto.getAlerField001() < 0) {
            errors.add("alerField001 must not be negative");
        }
        if (dto.getAlerField002() != null && dto.getAlerField002().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("alerField002 must not be negative");
        }
        if (dto.getAlerField006() != null && dto.getAlerField006().isBlank()) {
            errors.add("alerField006 must not be blank if provided");
        }
        if (dto.getAlerField009() != null && dto.getAlerField009().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("alerField009 must not be negative");
        }
        if (dto.getAlerField010() != null && dto.getAlerField010().isBlank()) {
            errors.add("alerField010 must not be blank if provided");
        }
        if (dto.getAlerField012() != null && dto.getAlerField012().isBlank()) {
            errors.add("alerField012 must not be blank if provided");
        }
        if (dto.getAlerField013() != null && dto.getAlerField013() < 0) {
            errors.add("alerField013 must not be negative");
        }
        return errors;
    }
}
