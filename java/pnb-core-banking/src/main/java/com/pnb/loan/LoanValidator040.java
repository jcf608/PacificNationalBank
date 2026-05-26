package com.pnb.loan;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * LoanValidator040 — Business rule validation.
 */
@ApplicationScoped
public class LoanValidator040 {

    public List<String> validate(LoanDto040 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("loan DTO must not be null");
            return errors;
        }
        if (dto.getLoanField004() != null && dto.getLoanField004().isBlank()) {
            errors.add("loanField004 must not be blank if provided");
        }
        if (dto.getLoanField005() != null && dto.getLoanField005().isBlank()) {
            errors.add("loanField005 must not be blank if provided");
        }
        if (dto.getLoanField006() != null && dto.getLoanField006().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("loanField006 must not be negative");
        }
        if (dto.getLoanField011() != null && dto.getLoanField011().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("loanField011 must not be negative");
        }
        return errors;
    }
}
