package com.pnb.risk;

import javax.enterprise.context.ApplicationScoped;

/**
 * RiskMapper057 — Maps between entity and DTO.
 */
@ApplicationScoped
public class RiskMapper057 {

    public RiskDto057 toDto(RiskV057 entity) {
        if (entity == null) return null;
        RiskDto057 dto = new RiskDto057();
        // dto.setRiskField000(entity.getRiskField000());
        // dto.setRiskField001(entity.getRiskField001());
        // dto.setRiskField002(entity.getRiskField002());
        // dto.setRiskField003(entity.getRiskField003());
        // dto.setRiskField004(entity.getRiskField004());
        return dto;
    }

    public RiskV057 toEntity(RiskDto057 dto) {
        if (dto == null) return null;
        RiskV057 entity = new RiskV057();
        // entity.setRiskField000(dto.getRiskField000());
        // entity.setRiskField001(dto.getRiskField001());
        // entity.setRiskField002(dto.getRiskField002());
        // entity.setRiskField003(dto.getRiskField003());
        // entity.setRiskField004(dto.getRiskField004());
        return entity;
    }
}
