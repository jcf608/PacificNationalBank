package com.pnb.compliance;

import javax.enterprise.context.ApplicationScoped;

/**
 * ComplianceMapper050 — Maps between entity and DTO.
 */
@ApplicationScoped
public class ComplianceMapper050 {

    public ComplianceDto050 toDto(ComplianceV050 entity) {
        if (entity == null) return null;
        ComplianceDto050 dto = new ComplianceDto050();
        // dto.setCompField000(entity.getCompField000());
        // dto.setCompField001(entity.getCompField001());
        // dto.setCompField002(entity.getCompField002());
        // dto.setCompField003(entity.getCompField003());
        // dto.setCompField004(entity.getCompField004());
        return dto;
    }

    public ComplianceV050 toEntity(ComplianceDto050 dto) {
        if (dto == null) return null;
        ComplianceV050 entity = new ComplianceV050();
        // entity.setCompField000(dto.getCompField000());
        // entity.setCompField001(dto.getCompField001());
        // entity.setCompField002(dto.getCompField002());
        // entity.setCompField003(dto.getCompField003());
        // entity.setCompField004(dto.getCompField004());
        return entity;
    }
}
