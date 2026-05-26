package com.pnb.rate;

import javax.enterprise.context.ApplicationScoped;

/**
 * RateMapper054 — Maps between entity and DTO.
 */
@ApplicationScoped
public class RateMapper054 {

    public RateDto054 toDto(RateV054 entity) {
        if (entity == null) return null;
        RateDto054 dto = new RateDto054();
        // dto.setRateField000(entity.getRateField000());
        // dto.setRateField001(entity.getRateField001());
        // dto.setRateField002(entity.getRateField002());
        // dto.setRateField003(entity.getRateField003());
        // dto.setRateField004(entity.getRateField004());
        return dto;
    }

    public RateV054 toEntity(RateDto054 dto) {
        if (dto == null) return null;
        RateV054 entity = new RateV054();
        // entity.setRateField000(dto.getRateField000());
        // entity.setRateField001(dto.getRateField001());
        // entity.setRateField002(dto.getRateField002());
        // entity.setRateField003(dto.getRateField003());
        // entity.setRateField004(dto.getRateField004());
        return entity;
    }
}
