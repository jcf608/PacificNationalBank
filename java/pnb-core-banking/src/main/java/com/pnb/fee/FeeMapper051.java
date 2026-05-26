package com.pnb.fee;

import javax.enterprise.context.ApplicationScoped;

/**
 * FeeMapper051 — Maps between entity and DTO.
 */
@ApplicationScoped
public class FeeMapper051 {

    public FeeDto051 toDto(FeeV051 entity) {
        if (entity == null) return null;
        FeeDto051 dto = new FeeDto051();
        // dto.setFeeField000(entity.getFeeField000());
        // dto.setFeeField001(entity.getFeeField001());
        // dto.setFeeField002(entity.getFeeField002());
        // dto.setFeeField003(entity.getFeeField003());
        // dto.setFeeField004(entity.getFeeField004());
        return dto;
    }

    public FeeV051 toEntity(FeeDto051 dto) {
        if (dto == null) return null;
        FeeV051 entity = new FeeV051();
        // entity.setFeeField000(dto.getFeeField000());
        // entity.setFeeField001(dto.getFeeField001());
        // entity.setFeeField002(dto.getFeeField002());
        // entity.setFeeField003(dto.getFeeField003());
        // entity.setFeeField004(dto.getFeeField004());
        return entity;
    }
}
