package com.pnb.loan;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * LoanValidator034 — Business rule validation.
 */
@ApplicationScoped
public class LoanValidator034 {

    public List<String> validate(LoanDto034 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("loan DTO must not be null");
            return errors;
        }
        if (dto.getLoanField001() != null && dto.getLoanField001().isBlank()) {
            errors.add("loanField001 must not be blank if provided");
        }
        if (dto.getLoanField002() != null && dto.getLoanField002() < 0) {
            errors.add("loanField002 must not be negative");
        }
        if (dto.getLoanField003() != null && dto.getLoanField003() < 0) {
            errors.add("loanField003 must not be negative");
        }
        if (dto.getLoanField004() != null && dto.getLoanField004() < 0) {
            errors.add("loanField004 must not be negative");
        }
        if (dto.getLoanField005() != null && dto.getLoanField005().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("loanField005 must not be negative");
        }
        if (dto.getLoanField007() != null && dto.getLoanField007().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("loanField007 must not be negative");
        }
        if (dto.getLoanField011() != null && dto.getLoanField011() < 0) {
            errors.add("loanField011 must not be negative");
        }
        if (dto.getLoanField012() != null && dto.getLoanField012().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("loanField012 must not be negative");
        }
        if (dto.getLoanField014() != null && dto.getLoanField014().isBlank()) {
            errors.add("loanField014 must not be blank if provided");
        }
        if (dto.getLoanField016() != null && dto.getLoanField016().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("loanField016 must not be negative");
        }
        return errors;
    }
}
