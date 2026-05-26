package com.pnb.fraud;

import javax.enterprise.context.ApplicationScoped;

/**
 * FraudMapper051 — Maps between entity and DTO.
 */
@ApplicationScoped
public class FraudMapper051 {

    public FraudDto051 toDto(FraudV051 entity) {
        if (entity == null) return null;
        FraudDto051 dto = new FraudDto051();
        // dto.setFrauField000(entity.getFrauField000());
        // dto.setFrauField001(entity.getFrauField001());
        // dto.setFrauField002(entity.getFrauField002());
        // dto.setFrauField003(entity.getFrauField003());
        // dto.setFrauField004(entity.getFrauField004());
        return dto;
    }

    public FraudV051 toEntity(FraudDto051 dto) {
        if (dto == null) return null;
        FraudV051 entity = new FraudV051();
        // entity.setFrauField000(dto.getFrauField000());
        // entity.setFrauField001(dto.getFrauField001());
        // entity.setFrauField002(dto.getFrauField002());
        // entity.setFrauField003(dto.getFrauField003());
        // entity.setFrauField004(dto.getFrauField004());
        return entity;
    }
}
