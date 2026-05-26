package com.pnb.loan;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * LoanValidator039 — Business rule validation.
 */
@ApplicationScoped
public class LoanValidator039 {

    public List<String> validate(LoanDto039 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("loan DTO must not be null");
            return errors;
        }
        if (dto.getLoanField001() != null && dto.getLoanField001().isBlank()) {
            errors.add("loanField001 must not be blank if provided");
        }
        if (dto.getLoanField006() != null && dto.getLoanField006().isBlank()) {
            errors.add("loanField006 must not be blank if provided");
        }
        if (dto.getLoanField010() != null && dto.getLoanField010() < 0) {
            errors.add("loanField010 must not be negative");
        }
        return errors;
    }
}
