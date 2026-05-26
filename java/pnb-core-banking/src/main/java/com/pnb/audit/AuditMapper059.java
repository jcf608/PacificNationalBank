package com.pnb.audit;

import javax.enterprise.context.ApplicationScoped;

/**
 * AuditMapper059 — Maps between entity and DTO.
 */
@ApplicationScoped
public class AuditMapper059 {

    public AuditDto059 toDto(AuditV059 entity) {
        if (entity == null) return null;
        AuditDto059 dto = new AuditDto059();
        // dto.setAudiField000(entity.getAudiField000());
        // dto.setAudiField001(entity.getAudiField001());
        // dto.setAudiField002(entity.getAudiField002());
        // dto.setAudiField003(entity.getAudiField003());
        // dto.setAudiField004(entity.getAudiField004());
        return dto;
    }

    public AuditV059 toEntity(AuditDto059 dto) {
        if (dto == null) return null;
        AuditV059 entity = new AuditV059();
        // entity.setAudiField000(dto.getAudiField000());
        // entity.setAudiField001(dto.getAudiField001());
        // entity.setAudiField002(dto.getAudiField002());
        // entity.setAudiField003(dto.getAudiField003());
        // entity.setAudiField004(dto.getAudiField004());
        return entity;
    }
}
