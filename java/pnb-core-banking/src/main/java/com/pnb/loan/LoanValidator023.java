package com.pnb.loan;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * LoanValidator023 — Business rule validation.
 */
@ApplicationScoped
public class LoanValidator023 {

    public List<String> validate(LoanDto023 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("loan DTO must not be null");
            return errors;
        }
        if (dto.getLoanField000() != null && dto.getLoanField000().isBlank()) {
            errors.add("loanField000 must not be blank if provided");
        }
        if (dto.getLoanField001() != null && dto.getLoanField001().isBlank()) {
            errors.add("loanField001 must not be blank if provided");
        }
        if (dto.getLoanField002() != null && dto.getLoanField002().isBlank()) {
            errors.add("loanField002 must not be blank if provided");
        }
        if (dto.getLoanField003() != null && dto.getLoanField003().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("loanField003 must not be negative");
        }
        if (dto.getLoanField005() != null && dto.getLoanField005().isBlank()) {
            errors.add("loanField005 must not be blank if provided");
        }
        if (dto.getLoanField007() != null && dto.getLoanField007().isBlank()) {
            errors.add("loanField007 must not be blank if provided");
        }
        if (dto.getLoanField009() != null && dto.getLoanField009() < 0) {
            errors.add("loanField009 must not be negative");
        }
        if (dto.getLoanField010() != null && dto.getLoanField010().isBlank()) {
            errors.add("loanField010 must not be blank if provided");
        }
        if (dto.getLoanField013() != null && dto.getLoanField013().isBlank()) {
            errors.add("loanField013 must not be blank if provided");
        }
        if (dto.getLoanField018() != null && dto.getLoanField018() < 0) {
            errors.add("loanField018 must not be negative");
        }
        return errors;
    }
}
