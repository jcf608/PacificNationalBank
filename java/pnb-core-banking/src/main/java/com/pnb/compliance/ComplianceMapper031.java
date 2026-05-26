package com.pnb.compliance;

import javax.enterprise.context.ApplicationScoped;

/**
 * ComplianceMapper031 — Maps between entity and DTO.
 */
@ApplicationScoped
public class ComplianceMapper031 {

    public ComplianceDto031 toDto(ComplianceV031 entity) {
        if (entity == null) return null;
        ComplianceDto031 dto = new ComplianceDto031();
        // dto.setCompField000(entity.getCompField000());
        // dto.setCompField001(entity.getCompField001());
        // dto.setCompField002(entity.getCompField002());
        // dto.setCompField003(entity.getCompField003());
        // dto.setCompField004(entity.getCompField004());
        return dto;
    }

    public ComplianceV031 toEntity(ComplianceDto031 dto) {
        if (dto == null) return null;
        ComplianceV031 entity = new ComplianceV031();
        // entity.setCompField000(dto.getCompField000());
        // entity.setCompField001(dto.getCompField001());
        // entity.setCompField002(dto.getCompField002());
        // entity.setCompField003(dto.getCompField003());
        // entity.setCompField004(dto.getCompField004());
        return entity;
    }
}
