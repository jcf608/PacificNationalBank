package com.pnb.rate;

import javax.enterprise.context.ApplicationScoped;

/**
 * RateMapper057 — Maps between entity and DTO.
 */
@ApplicationScoped
public class RateMapper057 {

    public RateDto057 toDto(RateV057 entity) {
        if (entity == null) return null;
        RateDto057 dto = new RateDto057();
        // dto.setRateField000(entity.getRateField000());
        // dto.setRateField001(entity.getRateField001());
        // dto.setRateField002(entity.getRateField002());
        // dto.setRateField003(entity.getRateField003());
        // dto.setRateField004(entity.getRateField004());
        return dto;
    }

    public RateV057 toEntity(RateDto057 dto) {
        if (dto == null) return null;
        RateV057 entity = new RateV057();
        // entity.setRateField000(dto.getRateField000());
        // entity.setRateField001(dto.getRateField001());
        // entity.setRateField002(dto.getRateField002());
        // entity.setRateField003(dto.getRateField003());
        // entity.setRateField004(dto.getRateField004());
        return entity;
    }
}
