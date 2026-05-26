package com.pnb.loan;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * LoanValidator052 — Business rule validation.
 */
@ApplicationScoped
public class LoanValidator052 {

    public List<String> validate(LoanDto052 dto) {
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
        if (dto.getLoanField005() != null && dto.getLoanField005() < 0) {
            errors.add("loanField005 must not be negative");
        }
        if (dto.getLoanField006() != null && dto.getLoanField006().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("loanField006 must not be negative");
        }
        if (dto.getLoanField007() != null && dto.getLoanField007().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("loanField007 must not be negative");
        }
        if (dto.getLoanField010() != null && dto.getLoanField010().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("loanField010 must not be negative");
        }
        return errors;
    }
}
