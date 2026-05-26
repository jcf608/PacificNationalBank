package com.pnb.audit;

import javax.enterprise.context.ApplicationScoped;

/**
 * AuditMapper026 — Maps between entity and DTO.
 */
@ApplicationScoped
public class AuditMapper026 {

    public AuditDto026 toDto(AuditV026 entity) {
        if (entity == null) return null;
        AuditDto026 dto = new AuditDto026();
        // dto.setAudiField000(entity.getAudiField000());
        // dto.setAudiField001(entity.getAudiField001());
        // dto.setAudiField002(entity.getAudiField002());
        // dto.setAudiField003(entity.getAudiField003());
        // dto.setAudiField004(entity.getAudiField004());
        return dto;
    }

    public AuditV026 toEntity(AuditDto026 dto) {
        if (dto == null) return null;
        AuditV026 entity = new AuditV026();
        // entity.setAudiField000(dto.getAudiField000());
        // entity.setAudiField001(dto.getAudiField001());
        // entity.setAudiField002(dto.getAudiField002());
        // entity.setAudiField003(dto.getAudiField003());
        // entity.setAudiField004(dto.getAudiField004());
        return entity;
    }
}
