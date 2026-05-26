package com.pnb.risk;

import javax.enterprise.context.ApplicationScoped;

/**
 * RiskMapper027 — Maps between entity and DTO.
 */
@ApplicationScoped
public class RiskMapper027 {

    public RiskDto027 toDto(RiskV027 entity) {
        if (entity == null) return null;
        RiskDto027 dto = new RiskDto027();
        // dto.setRiskField000(entity.getRiskField000());
        // dto.setRiskField001(entity.getRiskField001());
        // dto.setRiskField002(entity.getRiskField002());
        // dto.setRiskField003(entity.getRiskField003());
        // dto.setRiskField004(entity.getRiskField004());
        return dto;
    }

    public RiskV027 toEntity(RiskDto027 dto) {
        if (dto == null) return null;
        RiskV027 entity = new RiskV027();
        // entity.setRiskField000(dto.getRiskField000());
        // entity.setRiskField001(dto.getRiskField001());
        // entity.setRiskField002(dto.getRiskField002());
        // entity.setRiskField003(dto.getRiskField003());
        // entity.setRiskField004(dto.getRiskField004());
        return entity;
    }
}
