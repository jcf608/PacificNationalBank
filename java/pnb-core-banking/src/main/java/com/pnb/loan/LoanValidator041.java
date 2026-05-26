package com.pnb.loan;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * LoanValidator041 — Business rule validation.
 */
@ApplicationScoped
public class LoanValidator041 {

    public List<String> validate(LoanDto041 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("loan DTO must not be null");
            return errors;
        }
        if (dto.getLoanField005() != null && dto.getLoanField005().isBlank()) {
            errors.add("loanField005 must not be blank if provided");
        }
        if (dto.getLoanField009() != null && dto.getLoanField009().isBlank()) {
            errors.add("loanField009 must not be blank if provided");
        }
        return errors;
    }
}
