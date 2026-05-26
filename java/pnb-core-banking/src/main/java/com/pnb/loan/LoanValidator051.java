package com.pnb.loan;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * LoanValidator051 — Business rule validation.
 */
@ApplicationScoped
public class LoanValidator051 {

    public List<String> validate(LoanDto051 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("loan DTO must not be null");
            return errors;
        }
        if (dto.getLoanField001() != null && dto.getLoanField001() < 0) {
            errors.add("loanField001 must not be negative");
        }
        if (dto.getLoanField003() != null && dto.getLoanField003() < 0) {
            errors.add("loanField003 must not be negative");
        }
        if (dto.getLoanField005() != null && dto.getLoanField005().isBlank()) {
            errors.add("loanField005 must not be blank if provided");
        }
        if (dto.getLoanField010() != null && dto.getLoanField010().isBlank()) {
            errors.add("loanField010 must not be blank if provided");
        }
        return errors;
    }
}
