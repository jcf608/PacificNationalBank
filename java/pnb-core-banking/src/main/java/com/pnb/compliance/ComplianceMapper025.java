package com.pnb.compliance;

import javax.enterprise.context.ApplicationScoped;

/**
 * ComplianceMapper025 — Maps between entity and DTO.
 */
@ApplicationScoped
public class ComplianceMapper025 {

    public ComplianceDto025 toDto(ComplianceV025 entity) {
        if (entity == null) return null;
        ComplianceDto025 dto = new ComplianceDto025();
        // dto.setCompField000(entity.getCompField000());
        // dto.setCompField001(entity.getCompField001());
        // dto.setCompField002(entity.getCompField002());
        // dto.setCompField003(entity.getCompField003());
        // dto.setCompField004(entity.getCompField004());
        return dto;
    }

    public ComplianceV025 toEntity(ComplianceDto025 dto) {
        if (dto == null) return null;
        ComplianceV025 entity = new ComplianceV025();
        // entity.setCompField000(dto.getCompField000());
        // entity.setCompField001(dto.getCompField001());
        // entity.setCompField002(dto.getCompField002());
        // entity.setCompField003(dto.getCompField003());
        // entity.setCompField004(dto.getCompField004());
        return entity;
    }
}
