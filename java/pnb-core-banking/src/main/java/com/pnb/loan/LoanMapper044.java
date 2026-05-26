package com.pnb.loan;

import javax.enterprise.context.ApplicationScoped;

/**
 * LoanMapper044 — Maps between entity and DTO.
 */
@ApplicationScoped
public class LoanMapper044 {

    public LoanDto044 toDto(LoanV044 entity) {
        if (entity == null) return null;
        LoanDto044 dto = new LoanDto044();
        // dto.setLoanField000(entity.getLoanField000());
        // dto.setLoanField001(entity.getLoanField001());
        // dto.setLoanField002(entity.getLoanField002());
        // dto.setLoanField003(entity.getLoanField003());
        // dto.setLoanField004(entity.getLoanField004());
        return dto;
    }

    public LoanV044 toEntity(LoanDto044 dto) {
        if (dto == null) return null;
        LoanV044 entity = new LoanV044();
        // entity.setLoanField000(dto.getLoanField000());
        // entity.setLoanField001(dto.getLoanField001());
        // entity.setLoanField002(dto.getLoanField002());
        // entity.setLoanField003(dto.getLoanField003());
        // entity.setLoanField004(dto.getLoanField004());
        return entity;
    }
}
