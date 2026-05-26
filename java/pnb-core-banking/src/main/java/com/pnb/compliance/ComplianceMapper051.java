package com.pnb.compliance;

import javax.enterprise.context.ApplicationScoped;

/**
 * ComplianceMapper051 — Maps between entity and DTO.
 */
@ApplicationScoped
public class ComplianceMapper051 {

    public ComplianceDto051 toDto(ComplianceV051 entity) {
        if (entity == null) return null;
        ComplianceDto051 dto = new ComplianceDto051();
        // dto.setCompField000(entity.getCompField000());
        // dto.setCompField001(entity.getCompField001());
        // dto.setCompField002(entity.getCompField002());
        // dto.setCompField003(entity.getCompField003());
        // dto.setCompField004(entity.getCompField004());
        return dto;
    }

    public ComplianceV051 toEntity(ComplianceDto051 dto) {
        if (dto == null) return null;
        ComplianceV051 entity = new ComplianceV051();
        // entity.setCompField000(dto.getCompField000());
        // entity.setCompField001(dto.getCompField001());
        // entity.setCompField002(dto.getCompField002());
        // entity.setCompField003(dto.getCompField003());
        // entity.setCompField004(dto.getCompField004());
        return entity;
    }
}
