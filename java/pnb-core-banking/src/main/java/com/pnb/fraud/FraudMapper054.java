package com.pnb.fraud;

import javax.enterprise.context.ApplicationScoped;

/**
 * FraudMapper054 — Maps between entity and DTO.
 */
@ApplicationScoped
public class FraudMapper054 {

    public FraudDto054 toDto(FraudV054 entity) {
        if (entity == null) return null;
        FraudDto054 dto = new FraudDto054();
        // dto.setFrauField000(entity.getFrauField000());
        // dto.setFrauField001(entity.getFrauField001());
        // dto.setFrauField002(entity.getFrauField002());
        // dto.setFrauField003(entity.getFrauField003());
        // dto.setFrauField004(entity.getFrauField004());
        return dto;
    }

    public FraudV054 toEntity(FraudDto054 dto) {
        if (dto == null) return null;
        FraudV054 entity = new FraudV054();
        // entity.setFrauField000(dto.getFrauField000());
        // entity.setFrauField001(dto.getFrauField001());
        // entity.setFrauField002(dto.getFrauField002());
        // entity.setFrauField003(dto.getFrauField003());
        // entity.setFrauField004(dto.getFrauField004());
        return entity;
    }
}
