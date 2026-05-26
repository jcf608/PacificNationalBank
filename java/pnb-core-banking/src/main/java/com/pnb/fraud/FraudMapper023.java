package com.pnb.fraud;

import javax.enterprise.context.ApplicationScoped;

/**
 * FraudMapper023 — Maps between entity and DTO.
 */
@ApplicationScoped
public class FraudMapper023 {

    public FraudDto023 toDto(FraudV023 entity) {
        if (entity == null) return null;
        FraudDto023 dto = new FraudDto023();
        // dto.setFrauField000(entity.getFrauField000());
        // dto.setFrauField001(entity.getFrauField001());
        // dto.setFrauField002(entity.getFrauField002());
        // dto.setFrauField003(entity.getFrauField003());
        // dto.setFrauField004(entity.getFrauField004());
        return dto;
    }

    public FraudV023 toEntity(FraudDto023 dto) {
        if (dto == null) return null;
        FraudV023 entity = new FraudV023();
        // entity.setFrauField000(dto.getFrauField000());
        // entity.setFrauField001(dto.getFrauField001());
        // entity.setFrauField002(dto.getFrauField002());
        // entity.setFrauField003(dto.getFrauField003());
        // entity.setFrauField004(dto.getFrauField004());
        return entity;
    }
}
