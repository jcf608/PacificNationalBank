package com.pnb.audit;

import javax.enterprise.context.ApplicationScoped;

/**
 * AuditMapper024 — Maps between entity and DTO.
 */
@ApplicationScoped
public class AuditMapper024 {

    public AuditDto024 toDto(AuditV024 entity) {
        if (entity == null) return null;
        AuditDto024 dto = new AuditDto024();
        // dto.setAudiField000(entity.getAudiField000());
        // dto.setAudiField001(entity.getAudiField001());
        // dto.setAudiField002(entity.getAudiField002());
        // dto.setAudiField003(entity.getAudiField003());
        // dto.setAudiField004(entity.getAudiField004());
        return dto;
    }

    public AuditV024 toEntity(AuditDto024 dto) {
        if (dto == null) return null;
        AuditV024 entity = new AuditV024();
        // entity.setAudiField000(dto.getAudiField000());
        // entity.setAudiField001(dto.getAudiField001());
        // entity.setAudiField002(dto.getAudiField002());
        // entity.setAudiField003(dto.getAudiField003());
        // entity.setAudiField004(dto.getAudiField004());
        return entity;
    }
}
