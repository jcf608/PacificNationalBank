package com.pnb.risk;

import javax.enterprise.context.ApplicationScoped;

/**
 * RiskMapper052 — Maps between entity and DTO.
 */
@ApplicationScoped
public class RiskMapper052 {

    public RiskDto052 toDto(RiskV052 entity) {
        if (entity == null) return null;
        RiskDto052 dto = new RiskDto052();
        // dto.setRiskField000(entity.getRiskField000());
        // dto.setRiskField001(entity.getRiskField001());
        // dto.setRiskField002(entity.getRiskField002());
        // dto.setRiskField003(entity.getRiskField003());
        // dto.setRiskField004(entity.getRiskField004());
        return dto;
    }

    public RiskV052 toEntity(RiskDto052 dto) {
        if (dto == null) return null;
        RiskV052 entity = new RiskV052();
        // entity.setRiskField000(dto.getRiskField000());
        // entity.setRiskField001(dto.getRiskField001());
        // entity.setRiskField002(dto.getRiskField002());
        // entity.setRiskField003(dto.getRiskField003());
        // entity.setRiskField004(dto.getRiskField004());
        return entity;
    }
}
