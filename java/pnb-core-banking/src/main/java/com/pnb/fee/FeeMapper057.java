package com.pnb.fee;

import javax.enterprise.context.ApplicationScoped;

/**
 * FeeMapper057 — Maps between entity and DTO.
 */
@ApplicationScoped
public class FeeMapper057 {

    public FeeDto057 toDto(FeeV057 entity) {
        if (entity == null) return null;
        FeeDto057 dto = new FeeDto057();
        // dto.setFeeField000(entity.getFeeField000());
        // dto.setFeeField001(entity.getFeeField001());
        // dto.setFeeField002(entity.getFeeField002());
        // dto.setFeeField003(entity.getFeeField003());
        // dto.setFeeField004(entity.getFeeField004());
        return dto;
    }

    public FeeV057 toEntity(FeeDto057 dto) {
        if (dto == null) return null;
        FeeV057 entity = new FeeV057();
        // entity.setFeeField000(dto.getFeeField000());
        // entity.setFeeField001(dto.getFeeField001());
        // entity.setFeeField002(dto.getFeeField002());
        // entity.setFeeField003(dto.getFeeField003());
        // entity.setFeeField004(dto.getFeeField004());
        return entity;
    }
}
