package com.pnb.risk;

import javax.enterprise.context.ApplicationScoped;

/**
 * RiskMapper044 — Maps between entity and DTO.
 */
@ApplicationScoped
public class RiskMapper044 {

    public RiskDto044 toDto(RiskV044 entity) {
        if (entity == null) return null;
        RiskDto044 dto = new RiskDto044();
        // dto.setRiskField000(entity.getRiskField000());
        // dto.setRiskField001(entity.getRiskField001());
        // dto.setRiskField002(entity.getRiskField002());
        // dto.setRiskField003(entity.getRiskField003());
        // dto.setRiskField004(entity.getRiskField004());
        return dto;
    }

    public RiskV044 toEntity(RiskDto044 dto) {
        if (dto == null) return null;
        RiskV044 entity = new RiskV044();
        // entity.setRiskField000(dto.getRiskField000());
        // entity.setRiskField001(dto.getRiskField001());
        // entity.setRiskField002(dto.getRiskField002());
        // entity.setRiskField003(dto.getRiskField003());
        // entity.setRiskField004(dto.getRiskField004());
        return entity;
    }
}
