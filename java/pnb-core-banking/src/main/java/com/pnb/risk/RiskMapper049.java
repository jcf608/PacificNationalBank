package com.pnb.risk;

import javax.enterprise.context.ApplicationScoped;

/**
 * RiskMapper049 — Maps between entity and DTO.
 */
@ApplicationScoped
public class RiskMapper049 {

    public RiskDto049 toDto(RiskV049 entity) {
        if (entity == null) return null;
        RiskDto049 dto = new RiskDto049();
        // dto.setRiskField000(entity.getRiskField000());
        // dto.setRiskField001(entity.getRiskField001());
        // dto.setRiskField002(entity.getRiskField002());
        // dto.setRiskField003(entity.getRiskField003());
        // dto.setRiskField004(entity.getRiskField004());
        return dto;
    }

    public RiskV049 toEntity(RiskDto049 dto) {
        if (dto == null) return null;
        RiskV049 entity = new RiskV049();
        // entity.setRiskField000(dto.getRiskField000());
        // entity.setRiskField001(dto.getRiskField001());
        // entity.setRiskField002(dto.getRiskField002());
        // entity.setRiskField003(dto.getRiskField003());
        // entity.setRiskField004(dto.getRiskField004());
        return entity;
    }
}
