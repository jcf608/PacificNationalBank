package com.pnb.compliance;

import javax.enterprise.context.ApplicationScoped;

/**
 * ComplianceMapper052 — Maps between entity and DTO.
 */
@ApplicationScoped
public class ComplianceMapper052 {

    public ComplianceDto052 toDto(ComplianceV052 entity) {
        if (entity == null) return null;
        ComplianceDto052 dto = new ComplianceDto052();
        // dto.setCompField000(entity.getCompField000());
        // dto.setCompField001(entity.getCompField001());
        // dto.setCompField002(entity.getCompField002());
        // dto.setCompField003(entity.getCompField003());
        // dto.setCompField004(entity.getCompField004());
        return dto;
    }

    public ComplianceV052 toEntity(ComplianceDto052 dto) {
        if (dto == null) return null;
        ComplianceV052 entity = new ComplianceV052();
        // entity.setCompField000(dto.getCompField000());
        // entity.setCompField001(dto.getCompField001());
        // entity.setCompField002(dto.getCompField002());
        // entity.setCompField003(dto.getCompField003());
        // entity.setCompField004(dto.getCompField004());
        return entity;
    }
}
