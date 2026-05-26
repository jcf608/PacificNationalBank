package com.pnb.fee;

import javax.enterprise.context.ApplicationScoped;

/**
 * FeeMapper052 — Maps between entity and DTO.
 */
@ApplicationScoped
public class FeeMapper052 {

    public FeeDto052 toDto(FeeV052 entity) {
        if (entity == null) return null;
        FeeDto052 dto = new FeeDto052();
        // dto.setFeeField000(entity.getFeeField000());
        // dto.setFeeField001(entity.getFeeField001());
        // dto.setFeeField002(entity.getFeeField002());
        // dto.setFeeField003(entity.getFeeField003());
        // dto.setFeeField004(entity.getFeeField004());
        return dto;
    }

    public FeeV052 toEntity(FeeDto052 dto) {
        if (dto == null) return null;
        FeeV052 entity = new FeeV052();
        // entity.setFeeField000(dto.getFeeField000());
        // entity.setFeeField001(dto.getFeeField001());
        // entity.setFeeField002(dto.getFeeField002());
        // entity.setFeeField003(dto.getFeeField003());
        // entity.setFeeField004(dto.getFeeField004());
        return entity;
    }
}
