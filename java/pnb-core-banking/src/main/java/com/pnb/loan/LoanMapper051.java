package com.pnb.loan;

import javax.enterprise.context.ApplicationScoped;

/**
 * LoanMapper051 — Maps between entity and DTO.
 */
@ApplicationScoped
public class LoanMapper051 {

    public LoanDto051 toDto(LoanV051 entity) {
        if (entity == null) return null;
        LoanDto051 dto = new LoanDto051();
        // dto.setLoanField000(entity.getLoanField000());
        // dto.setLoanField001(entity.getLoanField001());
        // dto.setLoanField002(entity.getLoanField002());
        // dto.setLoanField003(entity.getLoanField003());
        // dto.setLoanField004(entity.getLoanField004());
        return dto;
    }

    public LoanV051 toEntity(LoanDto051 dto) {
        if (dto == null) return null;
        LoanV051 entity = new LoanV051();
        // entity.setLoanField000(dto.getLoanField000());
        // entity.setLoanField001(dto.getLoanField001());
        // entity.setLoanField002(dto.getLoanField002());
        // entity.setLoanField003(dto.getLoanField003());
        // entity.setLoanField004(dto.getLoanField004());
        return entity;
    }
}
