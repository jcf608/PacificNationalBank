package com.pnb.rate;

import javax.enterprise.context.ApplicationScoped;

/**
 * RateMapper029 — Maps between entity and DTO.
 */
@ApplicationScoped
public class RateMapper029 {

    public RateDto029 toDto(RateV029 entity) {
        if (entity == null) return null;
        RateDto029 dto = new RateDto029();
        // dto.setRateField000(entity.getRateField000());
        // dto.setRateField001(entity.getRateField001());
        // dto.setRateField002(entity.getRateField002());
        // dto.setRateField003(entity.getRateField003());
        // dto.setRateField004(entity.getRateField004());
        return dto;
    }

    public RateV029 toEntity(RateDto029 dto) {
        if (dto == null) return null;
        RateV029 entity = new RateV029();
        // entity.setRateField000(dto.getRateField000());
        // entity.setRateField001(dto.getRateField001());
        // entity.setRateField002(dto.getRateField002());
        // entity.setRateField003(dto.getRateField003());
        // entity.setRateField004(dto.getRateField004());
        return entity;
    }
}
