package com.pnb.risk;

import javax.enterprise.context.ApplicationScoped;

/**
 * RiskMapper021 — Maps between entity and DTO.
 */
@ApplicationScoped
public class RiskMapper021 {

    public RiskDto021 toDto(RiskV021 entity) {
        if (entity == null) return null;
        RiskDto021 dto = new RiskDto021();
        // dto.setRiskField000(entity.getRiskField000());
        // dto.setRiskField001(entity.getRiskField001());
        // dto.setRiskField002(entity.getRiskField002());
        // dto.setRiskField003(entity.getRiskField003());
        // dto.setRiskField004(entity.getRiskField004());
        return dto;
    }

    public RiskV021 toEntity(RiskDto021 dto) {
        if (dto == null) return null;
        RiskV021 entity = new RiskV021();
        // entity.setRiskField000(dto.getRiskField000());
        // entity.setRiskField001(dto.getRiskField001());
        // entity.setRiskField002(dto.getRiskField002());
        // entity.setRiskField003(dto.getRiskField003());
        // entity.setRiskField004(dto.getRiskField004());
        return entity;
    }
}
