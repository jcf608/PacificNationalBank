package com.pnb.loan;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * LoanValidator036 — Business rule validation.
 */
@ApplicationScoped
public class LoanValidator036 {

    public List<String> validate(LoanDto036 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("loan DTO must not be null");
            return errors;
        }
        if (dto.getLoanField000() != null && dto.getLoanField000() < 0) {
            errors.add("loanField000 must not be negative");
        }
        if (dto.getLoanField001() != null && dto.getLoanField001() < 0) {
            errors.add("loanField001 must not be negative");
        }
        if (dto.getLoanField002() != null && dto.getLoanField002().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("loanField002 must not be negative");
        }
        if (dto.getLoanField005() != null && dto.getLoanField005() < 0) {
            errors.add("loanField005 must not be negative");
        }
        return errors;
    }
}
