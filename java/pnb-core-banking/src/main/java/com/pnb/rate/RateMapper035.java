package com.pnb.rate;

import javax.enterprise.context.ApplicationScoped;

/**
 * RateMapper035 — Maps between entity and DTO.
 */
@ApplicationScoped
public class RateMapper035 {

    public RateDto035 toDto(RateV035 entity) {
        if (entity == null) return null;
        RateDto035 dto = new RateDto035();
        // dto.setRateField000(entity.getRateField000());
        // dto.setRateField001(entity.getRateField001());
        // dto.setRateField002(entity.getRateField002());
        // dto.setRateField003(entity.getRateField003());
        // dto.setRateField004(entity.getRateField004());
        return dto;
    }

    public RateV035 toEntity(RateDto035 dto) {
        if (dto == null) return null;
        RateV035 entity = new RateV035();
        // entity.setRateField000(dto.getRateField000());
        // entity.setRateField001(dto.getRateField001());
        // entity.setRateField002(dto.getRateField002());
        // entity.setRateField003(dto.getRateField003());
        // entity.setRateField004(dto.getRateField004());
        return entity;
    }
}
