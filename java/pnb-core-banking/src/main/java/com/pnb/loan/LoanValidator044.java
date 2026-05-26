package com.pnb.loan;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * LoanValidator044 — Business rule validation.
 */
@ApplicationScoped
public class LoanValidator044 {

    public List<String> validate(LoanDto044 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("loan DTO must not be null");
            return errors;
        }
        if (dto.getLoanField000() != null && dto.getLoanField000().isBlank()) {
            errors.add("loanField000 must not be blank if provided");
        }
        if (dto.getLoanField001() != null && dto.getLoanField001().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("loanField001 must not be negative");
        }
        if (dto.getLoanField003() != null && dto.getLoanField003() < 0) {
            errors.add("loanField003 must not be negative");
        }
        if (dto.getLoanField004() != null && dto.getLoanField004() < 0) {
            errors.add("loanField004 must not be negative");
        }
        if (dto.getLoanField005() != null && dto.getLoanField005() < 0) {
            errors.add("loanField005 must not be negative");
        }
        if (dto.getLoanField006() != null && dto.getLoanField006().isBlank()) {
            errors.add("loanField006 must not be blank if provided");
        }
        if (dto.getLoanField007() != null && dto.getLoanField007().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("loanField007 must not be negative");
        }
        if (dto.getLoanField008() != null && dto.getLoanField008().isBlank()) {
            errors.add("loanField008 must not be blank if provided");
        }
        if (dto.getLoanField009() != null && dto.getLoanField009() < 0) {
            errors.add("loanField009 must not be negative");
        }
        return errors;
    }
}
