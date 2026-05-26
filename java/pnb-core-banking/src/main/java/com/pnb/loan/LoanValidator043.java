package com.pnb.loan;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * LoanValidator043 — Business rule validation.
 */
@ApplicationScoped
public class LoanValidator043 {

    public List<String> validate(LoanDto043 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("loan DTO must not be null");
            return errors;
        }
        if (dto.getLoanField000() != null && dto.getLoanField000().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("loanField000 must not be negative");
        }
        if (dto.getLoanField001() != null && dto.getLoanField001().isBlank()) {
            errors.add("loanField001 must not be blank if provided");
        }
        if (dto.getLoanField003() != null && dto.getLoanField003().isBlank()) {
            errors.add("loanField003 must not be blank if provided");
        }
        if (dto.getLoanField004() != null && dto.getLoanField004().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("loanField004 must not be negative");
        }
        if (dto.getLoanField005() != null && dto.getLoanField005().isBlank()) {
            errors.add("loanField005 must not be blank if provided");
        }
        if (dto.getLoanField007() != null && dto.getLoanField007().isBlank()) {
            errors.add("loanField007 must not be blank if provided");
        }
        if (dto.getLoanField008() != null && dto.getLoanField008().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("loanField008 must not be negative");
        }
        if (dto.getLoanField009() != null && dto.getLoanField009() < 0) {
            errors.add("loanField009 must not be negative");
        }
        if (dto.getLoanField011() != null && dto.getLoanField011() < 0) {
            errors.add("loanField011 must not be negative");
        }
        if (dto.getLoanField012() != null && dto.getLoanField012().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("loanField012 must not be negative");
        }
        if (dto.getLoanField013() != null && dto.getLoanField013().isBlank()) {
            errors.add("loanField013 must not be blank if provided");
        }
        if (dto.getLoanField014() != null && dto.getLoanField014() < 0) {
            errors.add("loanField014 must not be negative");
        }
        return errors;
    }
}
