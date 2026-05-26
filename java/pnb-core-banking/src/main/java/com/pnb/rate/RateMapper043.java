package com.pnb.rate;

import javax.enterprise.context.ApplicationScoped;

/**
 * RateMapper043 — Maps between entity and DTO.
 */
@ApplicationScoped
public class RateMapper043 {

    public RateDto043 toDto(RateV043 entity) {
        if (entity == null) return null;
        RateDto043 dto = new RateDto043();
        // dto.setRateField000(entity.getRateField000());
        // dto.setRateField001(entity.getRateField001());
        // dto.setRateField002(entity.getRateField002());
        // dto.setRateField003(entity.getRateField003());
        // dto.setRateField004(entity.getRateField004());
        return dto;
    }

    public RateV043 toEntity(RateDto043 dto) {
        if (dto == null) return null;
        RateV043 entity = new RateV043();
        // entity.setRateField000(dto.getRateField000());
        // entity.setRateField001(dto.getRateField001());
        // entity.setRateField002(dto.getRateField002());
        // entity.setRateField003(dto.getRateField003());
        // entity.setRateField004(dto.getRateField004());
        return entity;
    }
}
