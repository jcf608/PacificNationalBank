package com.pnb.compliance;

import javax.enterprise.context.ApplicationScoped;

/**
 * ComplianceMapper049 — Maps between entity and DTO.
 */
@ApplicationScoped
public class ComplianceMapper049 {

    public ComplianceDto049 toDto(ComplianceV049 entity) {
        if (entity == null) return null;
        ComplianceDto049 dto = new ComplianceDto049();
        // dto.setCompField000(entity.getCompField000());
        // dto.setCompField001(entity.getCompField001());
        // dto.setCompField002(entity.getCompField002());
        // dto.setCompField003(entity.getCompField003());
        // dto.setCompField004(entity.getCompField004());
        return dto;
    }

    public ComplianceV049 toEntity(ComplianceDto049 dto) {
        if (dto == null) return null;
        ComplianceV049 entity = new ComplianceV049();
        // entity.setCompField000(dto.getCompField000());
        // entity.setCompField001(dto.getCompField001());
        // entity.setCompField002(dto.getCompField002());
        // entity.setCompField003(dto.getCompField003());
        // entity.setCompField004(dto.getCompField004());
        return entity;
    }
}
