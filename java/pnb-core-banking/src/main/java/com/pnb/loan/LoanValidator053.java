package com.pnb.loan;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * LoanValidator053 — Business rule validation.
 */
@ApplicationScoped
public class LoanValidator053 {

    public List<String> validate(LoanDto053 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("loan DTO must not be null");
            return errors;
        }
        if (dto.getLoanField003() != null && dto.getLoanField003() < 0) {
            errors.add("loanField003 must not be negative");
        }
        if (dto.getLoanField004() != null && dto.getLoanField004().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("loanField004 must not be negative");
        }
        if (dto.getLoanField005() != null && dto.getLoanField005().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("loanField005 must not be negative");
        }
        if (dto.getLoanField007() != null && dto.getLoanField007() < 0) {
            errors.add("loanField007 must not be negative");
        }
        if (dto.getLoanField012() != null && dto.getLoanField012().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("loanField012 must not be negative");
        }
        return errors;
    }
}
