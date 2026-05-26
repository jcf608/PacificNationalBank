package com.pnb.fraud;

import javax.enterprise.context.ApplicationScoped;

/**
 * FraudMapper047 — Maps between entity and DTO.
 */
@ApplicationScoped
public class FraudMapper047 {

    public FraudDto047 toDto(FraudV047 entity) {
        if (entity == null) return null;
        FraudDto047 dto = new FraudDto047();
        // dto.setFrauField000(entity.getFrauField000());
        // dto.setFrauField001(entity.getFrauField001());
        // dto.setFrauField002(entity.getFrauField002());
        // dto.setFrauField003(entity.getFrauField003());
        // dto.setFrauField004(entity.getFrauField004());
        return dto;
    }

    public FraudV047 toEntity(FraudDto047 dto) {
        if (dto == null) return null;
        FraudV047 entity = new FraudV047();
        // entity.setFrauField000(dto.getFrauField000());
        // entity.setFrauField001(dto.getFrauField001());
        // entity.setFrauField002(dto.getFrauField002());
        // entity.setFrauField003(dto.getFrauField003());
        // entity.setFrauField004(dto.getFrauField004());
        return entity;
    }
}
