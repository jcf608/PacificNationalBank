package com.pnb.loan;

import javax.enterprise.context.ApplicationScoped;

/**
 * LoanMapper032 — Maps between entity and DTO.
 */
@ApplicationScoped
public class LoanMapper032 {

    public LoanDto032 toDto(LoanV032 entity) {
        if (entity == null) return null;
        LoanDto032 dto = new LoanDto032();
        // dto.setLoanField000(entity.getLoanField000());
        // dto.setLoanField001(entity.getLoanField001());
        // dto.setLoanField002(entity.getLoanField002());
        // dto.setLoanField003(entity.getLoanField003());
        // dto.setLoanField004(entity.getLoanField004());
        return dto;
    }

    public LoanV032 toEntity(LoanDto032 dto) {
        if (dto == null) return null;
        LoanV032 entity = new LoanV032();
        // entity.setLoanField000(dto.getLoanField000());
        // entity.setLoanField001(dto.getLoanField001());
        // entity.setLoanField002(dto.getLoanField002());
        // entity.setLoanField003(dto.getLoanField003());
        // entity.setLoanField004(dto.getLoanField004());
        return entity;
    }
}
