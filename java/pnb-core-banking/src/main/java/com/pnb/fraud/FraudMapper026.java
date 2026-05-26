package com.pnb.fraud;

import javax.enterprise.context.ApplicationScoped;

/**
 * FraudMapper026 — Maps between entity and DTO.
 */
@ApplicationScoped
public class FraudMapper026 {

    public FraudDto026 toDto(FraudV026 entity) {
        if (entity == null) return null;
        FraudDto026 dto = new FraudDto026();
        // dto.setFrauField000(entity.getFrauField000());
        // dto.setFrauField001(entity.getFrauField001());
        // dto.setFrauField002(entity.getFrauField002());
        // dto.setFrauField003(entity.getFrauField003());
        // dto.setFrauField004(entity.getFrauField004());
        return dto;
    }

    public FraudV026 toEntity(FraudDto026 dto) {
        if (dto == null) return null;
        FraudV026 entity = new FraudV026();
        // entity.setFrauField000(dto.getFrauField000());
        // entity.setFrauField001(dto.getFrauField001());
        // entity.setFrauField002(dto.getFrauField002());
        // entity.setFrauField003(dto.getFrauField003());
        // entity.setFrauField004(dto.getFrauField004());
        return entity;
    }
}
