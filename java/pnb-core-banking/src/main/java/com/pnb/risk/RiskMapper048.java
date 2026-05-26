package com.pnb.risk;

import javax.enterprise.context.ApplicationScoped;

/**
 * RiskMapper048 — Maps between entity and DTO.
 */
@ApplicationScoped
public class RiskMapper048 {

    public RiskDto048 toDto(RiskV048 entity) {
        if (entity == null) return null;
        RiskDto048 dto = new RiskDto048();
        // dto.setRiskField000(entity.getRiskField000());
        // dto.setRiskField001(entity.getRiskField001());
        // dto.setRiskField002(entity.getRiskField002());
        // dto.setRiskField003(entity.getRiskField003());
        // dto.setRiskField004(entity.getRiskField004());
        return dto;
    }

    public RiskV048 toEntity(RiskDto048 dto) {
        if (dto == null) return null;
        RiskV048 entity = new RiskV048();
        // entity.setRiskField000(dto.getRiskField000());
        // entity.setRiskField001(dto.getRiskField001());
        // entity.setRiskField002(dto.getRiskField002());
        // entity.setRiskField003(dto.getRiskField003());
        // entity.setRiskField004(dto.getRiskField004());
        return entity;
    }
}
