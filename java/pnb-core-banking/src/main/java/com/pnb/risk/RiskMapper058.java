package com.pnb.risk;

import javax.enterprise.context.ApplicationScoped;

/**
 * RiskMapper058 — Maps between entity and DTO.
 */
@ApplicationScoped
public class RiskMapper058 {

    public RiskDto058 toDto(RiskV058 entity) {
        if (entity == null) return null;
        RiskDto058 dto = new RiskDto058();
        // dto.setRiskField000(entity.getRiskField000());
        // dto.setRiskField001(entity.getRiskField001());
        // dto.setRiskField002(entity.getRiskField002());
        // dto.setRiskField003(entity.getRiskField003());
        // dto.setRiskField004(entity.getRiskField004());
        return dto;
    }

    public RiskV058 toEntity(RiskDto058 dto) {
        if (dto == null) return null;
        RiskV058 entity = new RiskV058();
        // entity.setRiskField000(dto.getRiskField000());
        // entity.setRiskField001(dto.getRiskField001());
        // entity.setRiskField002(dto.getRiskField002());
        // entity.setRiskField003(dto.getRiskField003());
        // entity.setRiskField004(dto.getRiskField004());
        return entity;
    }
}
