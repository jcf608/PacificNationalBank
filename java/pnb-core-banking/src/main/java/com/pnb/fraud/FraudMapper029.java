package com.pnb.fraud;

import javax.enterprise.context.ApplicationScoped;

/**
 * FraudMapper029 — Maps between entity and DTO.
 */
@ApplicationScoped
public class FraudMapper029 {

    public FraudDto029 toDto(FraudV029 entity) {
        if (entity == null) return null;
        FraudDto029 dto = new FraudDto029();
        // dto.setFrauField000(entity.getFrauField000());
        // dto.setFrauField001(entity.getFrauField001());
        // dto.setFrauField002(entity.getFrauField002());
        // dto.setFrauField003(entity.getFrauField003());
        // dto.setFrauField004(entity.getFrauField004());
        return dto;
    }

    public FraudV029 toEntity(FraudDto029 dto) {
        if (dto == null) return null;
        FraudV029 entity = new FraudV029();
        // entity.setFrauField000(dto.getFrauField000());
        // entity.setFrauField001(dto.getFrauField001());
        // entity.setFrauField002(dto.getFrauField002());
        // entity.setFrauField003(dto.getFrauField003());
        // entity.setFrauField004(dto.getFrauField004());
        return entity;
    }
}
