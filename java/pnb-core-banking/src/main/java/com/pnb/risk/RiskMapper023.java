package com.pnb.risk;

import javax.enterprise.context.ApplicationScoped;

/**
 * RiskMapper023 — Maps between entity and DTO.
 */
@ApplicationScoped
public class RiskMapper023 {

    public RiskDto023 toDto(RiskV023 entity) {
        if (entity == null) return null;
        RiskDto023 dto = new RiskDto023();
        // dto.setRiskField000(entity.getRiskField000());
        // dto.setRiskField001(entity.getRiskField001());
        // dto.setRiskField002(entity.getRiskField002());
        // dto.setRiskField003(entity.getRiskField003());
        // dto.setRiskField004(entity.getRiskField004());
        return dto;
    }

    public RiskV023 toEntity(RiskDto023 dto) {
        if (dto == null) return null;
        RiskV023 entity = new RiskV023();
        // entity.setRiskField000(dto.getRiskField000());
        // entity.setRiskField001(dto.getRiskField001());
        // entity.setRiskField002(dto.getRiskField002());
        // entity.setRiskField003(dto.getRiskField003());
        // entity.setRiskField004(dto.getRiskField004());
        return entity;
    }
}
