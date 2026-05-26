package com.pnb.compliance;

import javax.enterprise.context.ApplicationScoped;

/**
 * ComplianceMapper037 — Maps between entity and DTO.
 */
@ApplicationScoped
public class ComplianceMapper037 {

    public ComplianceDto037 toDto(ComplianceV037 entity) {
        if (entity == null) return null;
        ComplianceDto037 dto = new ComplianceDto037();
        // dto.setCompField000(entity.getCompField000());
        // dto.setCompField001(entity.getCompField001());
        // dto.setCompField002(entity.getCompField002());
        // dto.setCompField003(entity.getCompField003());
        // dto.setCompField004(entity.getCompField004());
        return dto;
    }

    public ComplianceV037 toEntity(ComplianceDto037 dto) {
        if (dto == null) return null;
        ComplianceV037 entity = new ComplianceV037();
        // entity.setCompField000(dto.getCompField000());
        // entity.setCompField001(dto.getCompField001());
        // entity.setCompField002(dto.getCompField002());
        // entity.setCompField003(dto.getCompField003());
        // entity.setCompField004(dto.getCompField004());
        return entity;
    }
}
