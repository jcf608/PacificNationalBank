package com.pnb.loan;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * LoanValidator038 — Business rule validation.
 */
@ApplicationScoped
public class LoanValidator038 {

    public List<String> validate(LoanDto038 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("loan DTO must not be null");
            return errors;
        }
        if (dto.getLoanField001() != null && dto.getLoanField001().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("loanField001 must not be negative");
        }
        if (dto.getLoanField002() != null && dto.getLoanField002().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("loanField002 must not be negative");
        }
        if (dto.getLoanField008() != null && dto.getLoanField008().isBlank()) {
            errors.add("loanField008 must not be blank if provided");
        }
        return errors;
    }
}
