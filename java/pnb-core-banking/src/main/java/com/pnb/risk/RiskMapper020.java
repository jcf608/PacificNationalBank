package com.pnb.risk;

import javax.enterprise.context.ApplicationScoped;

/**
 * RiskMapper020 — Maps between entity and DTO.
 */
@ApplicationScoped
public class RiskMapper020 {

    public RiskDto020 toDto(RiskV020 entity) {
        if (entity == null) return null;
        RiskDto020 dto = new RiskDto020();
        // dto.setRiskField000(entity.getRiskField000());
        // dto.setRiskField001(entity.getRiskField001());
        // dto.setRiskField002(entity.getRiskField002());
        // dto.setRiskField003(entity.getRiskField003());
        // dto.setRiskField004(entity.getRiskField004());
        return dto;
    }

    public RiskV020 toEntity(RiskDto020 dto) {
        if (dto == null) return null;
        RiskV020 entity = new RiskV020();
        // entity.setRiskField000(dto.getRiskField000());
        // entity.setRiskField001(dto.getRiskField001());
        // entity.setRiskField002(dto.getRiskField002());
        // entity.setRiskField003(dto.getRiskField003());
        // entity.setRiskField004(dto.getRiskField004());
        return entity;
    }
}
