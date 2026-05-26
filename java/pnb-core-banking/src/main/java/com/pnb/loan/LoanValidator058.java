package com.pnb.loan;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * LoanValidator058 — Business rule validation.
 */
@ApplicationScoped
public class LoanValidator058 {

    public List<String> validate(LoanDto058 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("loan DTO must not be null");
            return errors;
        }
        if (dto.getLoanField001() != null && dto.getLoanField001() < 0) {
            errors.add("loanField001 must not be negative");
        }
        if (dto.getLoanField002() != null && dto.getLoanField002().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("loanField002 must not be negative");
        }
        if (dto.getLoanField003() != null && dto.getLoanField003() < 0) {
            errors.add("loanField003 must not be negative");
        }
        if (dto.getLoanField004() != null && dto.getLoanField004().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("loanField004 must not be negative");
        }
        if (dto.getLoanField006() != null && dto.getLoanField006().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("loanField006 must not be negative");
        }
        if (dto.getLoanField007() != null && dto.getLoanField007().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("loanField007 must not be negative");
        }
        if (dto.getLoanField009() != null && dto.getLoanField009().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("loanField009 must not be negative");
        }
        if (dto.getLoanField012() != null && dto.getLoanField012() < 0) {
            errors.add("loanField012 must not be negative");
        }
        return errors;
    }
}
