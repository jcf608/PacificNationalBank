package com.pnb.loan;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * LoanValidator047 — Business rule validation.
 */
@ApplicationScoped
public class LoanValidator047 {

    public List<String> validate(LoanDto047 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("loan DTO must not be null");
            return errors;
        }
        if (dto.getLoanField000() != null && dto.getLoanField000().isBlank()) {
            errors.add("loanField000 must not be blank if provided");
        }
        if (dto.getLoanField001() != null && dto.getLoanField001() < 0) {
            errors.add("loanField001 must not be negative");
        }
        if (dto.getLoanField002() != null && dto.getLoanField002().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("loanField002 must not be negative");
        }
        if (dto.getLoanField005() != null && dto.getLoanField005().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("loanField005 must not be negative");
        }
        if (dto.getLoanField006() != null && dto.getLoanField006().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("loanField006 must not be negative");
        }
        if (dto.getLoanField007() != null && dto.getLoanField007().isBlank()) {
            errors.add("loanField007 must not be blank if provided");
        }
        if (dto.getLoanField012() != null && dto.getLoanField012() < 0) {
            errors.add("loanField012 must not be negative");
        }
        if (dto.getLoanField013() != null && dto.getLoanField013().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("loanField013 must not be negative");
        }
        if (dto.getLoanField014() != null && dto.getLoanField014() < 0) {
            errors.add("loanField014 must not be negative");
        }
        if (dto.getLoanField017() != null && dto.getLoanField017().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("loanField017 must not be negative");
        }
        if (dto.getLoanField018() != null && dto.getLoanField018() < 0) {
            errors.add("loanField018 must not be negative");
        }
        return errors;
    }
}
