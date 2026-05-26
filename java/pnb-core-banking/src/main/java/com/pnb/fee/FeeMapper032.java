package com.pnb.fee;

import javax.enterprise.context.ApplicationScoped;

/**
 * FeeMapper032 — Maps between entity and DTO.
 */
@ApplicationScoped
public class FeeMapper032 {

    public FeeDto032 toDto(FeeV032 entity) {
        if (entity == null) return null;
        FeeDto032 dto = new FeeDto032();
        // dto.setFeeField000(entity.getFeeField000());
        // dto.setFeeField001(entity.getFeeField001());
        // dto.setFeeField002(entity.getFeeField002());
        // dto.setFeeField003(entity.getFeeField003());
        // dto.setFeeField004(entity.getFeeField004());
        return dto;
    }

    public FeeV032 toEntity(FeeDto032 dto) {
        if (dto == null) return null;
        FeeV032 entity = new FeeV032();
        // entity.setFeeField000(dto.getFeeField000());
        // entity.setFeeField001(dto.getFeeField001());
        // entity.setFeeField002(dto.getFeeField002());
        // entity.setFeeField003(dto.getFeeField003());
        // entity.setFeeField004(dto.getFeeField004());
        return entity;
    }
}
