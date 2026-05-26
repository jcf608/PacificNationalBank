package com.pnb.fee;

import javax.enterprise.context.ApplicationScoped;

/**
 * FeeMapper026 — Maps between entity and DTO.
 */
@ApplicationScoped
public class FeeMapper026 {

    public FeeDto026 toDto(FeeV026 entity) {
        if (entity == null) return null;
        FeeDto026 dto = new FeeDto026();
        // dto.setFeeField000(entity.getFeeField000());
        // dto.setFeeField001(entity.getFeeField001());
        // dto.setFeeField002(entity.getFeeField002());
        // dto.setFeeField003(entity.getFeeField003());
        // dto.setFeeField004(entity.getFeeField004());
        return dto;
    }

    public FeeV026 toEntity(FeeDto026 dto) {
        if (dto == null) return null;
        FeeV026 entity = new FeeV026();
        // entity.setFeeField000(dto.getFeeField000());
        // entity.setFeeField001(dto.getFeeField001());
        // entity.setFeeField002(dto.getFeeField002());
        // entity.setFeeField003(dto.getFeeField003());
        // entity.setFeeField004(dto.getFeeField004());
        return entity;
    }
}
