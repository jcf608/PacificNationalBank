package com.pnb.compliance;

import javax.enterprise.context.ApplicationScoped;

/**
 * ComplianceMapper039 — Maps between entity and DTO.
 */
@ApplicationScoped
public class ComplianceMapper039 {

    public ComplianceDto039 toDto(ComplianceV039 entity) {
        if (entity == null) return null;
        ComplianceDto039 dto = new ComplianceDto039();
        // dto.setCompField000(entity.getCompField000());
        // dto.setCompField001(entity.getCompField001());
        // dto.setCompField002(entity.getCompField002());
        // dto.setCompField003(entity.getCompField003());
        // dto.setCompField004(entity.getCompField004());
        return dto;
    }

    public ComplianceV039 toEntity(ComplianceDto039 dto) {
        if (dto == null) return null;
        ComplianceV039 entity = new ComplianceV039();
        // entity.setCompField000(dto.getCompField000());
        // entity.setCompField001(dto.getCompField001());
        // entity.setCompField002(dto.getCompField002());
        // entity.setCompField003(dto.getCompField003());
        // entity.setCompField004(dto.getCompField004());
        return entity;
    }
}
