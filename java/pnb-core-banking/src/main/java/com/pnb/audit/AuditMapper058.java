package com.pnb.audit;

import javax.enterprise.context.ApplicationScoped;

/**
 * AuditMapper058 — Maps between entity and DTO.
 */
@ApplicationScoped
public class AuditMapper058 {

    public AuditDto058 toDto(AuditV058 entity) {
        if (entity == null) return null;
        AuditDto058 dto = new AuditDto058();
        // dto.setAudiField000(entity.getAudiField000());
        // dto.setAudiField001(entity.getAudiField001());
        // dto.setAudiField002(entity.getAudiField002());
        // dto.setAudiField003(entity.getAudiField003());
        // dto.setAudiField004(entity.getAudiField004());
        return dto;
    }

    public AuditV058 toEntity(AuditDto058 dto) {
        if (dto == null) return null;
        AuditV058 entity = new AuditV058();
        // entity.setAudiField000(dto.getAudiField000());
        // entity.setAudiField001(dto.getAudiField001());
        // entity.setAudiField002(dto.getAudiField002());
        // entity.setAudiField003(dto.getAudiField003());
        // entity.setAudiField004(dto.getAudiField004());
        return entity;
    }
}
