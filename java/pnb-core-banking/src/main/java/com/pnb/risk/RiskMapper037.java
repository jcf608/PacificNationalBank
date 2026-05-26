package com.pnb.risk;

import javax.enterprise.context.ApplicationScoped;

/**
 * RiskMapper037 — Maps between entity and DTO.
 */
@ApplicationScoped
public class RiskMapper037 {

    public RiskDto037 toDto(RiskV037 entity) {
        if (entity == null) return null;
        RiskDto037 dto = new RiskDto037();
        // dto.setRiskField000(entity.getRiskField000());
        // dto.setRiskField001(entity.getRiskField001());
        // dto.setRiskField002(entity.getRiskField002());
        // dto.setRiskField003(entity.getRiskField003());
        // dto.setRiskField004(entity.getRiskField004());
        return dto;
    }

    public RiskV037 toEntity(RiskDto037 dto) {
        if (dto == null) return null;
        RiskV037 entity = new RiskV037();
        // entity.setRiskField000(dto.getRiskField000());
        // entity.setRiskField001(dto.getRiskField001());
        // entity.setRiskField002(dto.getRiskField002());
        // entity.setRiskField003(dto.getRiskField003());
        // entity.setRiskField004(dto.getRiskField004());
        return entity;
    }
}
