package com.pnb.loan;

import javax.enterprise.context.ApplicationScoped;

/**
 * LoanMapper046 — Maps between entity and DTO.
 */
@ApplicationScoped
public class LoanMapper046 {

    public LoanDto046 toDto(LoanV046 entity) {
        if (entity == null) return null;
        LoanDto046 dto = new LoanDto046();
        // dto.setLoanField000(entity.getLoanField000());
        // dto.setLoanField001(entity.getLoanField001());
        // dto.setLoanField002(entity.getLoanField002());
        // dto.setLoanField003(entity.getLoanField003());
        // dto.setLoanField004(entity.getLoanField004());
        return dto;
    }

    public LoanV046 toEntity(LoanDto046 dto) {
        if (dto == null) return null;
        LoanV046 entity = new LoanV046();
        // entity.setLoanField000(dto.getLoanField000());
        // entity.setLoanField001(dto.getLoanField001());
        // entity.setLoanField002(dto.getLoanField002());
        // entity.setLoanField003(dto.getLoanField003());
        // entity.setLoanField004(dto.getLoanField004());
        return entity;
    }
}
