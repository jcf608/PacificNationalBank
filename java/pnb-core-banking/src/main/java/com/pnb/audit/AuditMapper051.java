package com.pnb.audit;

import javax.enterprise.context.ApplicationScoped;

/**
 * AuditMapper051 — Maps between entity and DTO.
 */
@ApplicationScoped
public class AuditMapper051 {

    public AuditDto051 toDto(AuditV051 entity) {
        if (entity == null) return null;
        AuditDto051 dto = new AuditDto051();
        // dto.setAudiField000(entity.getAudiField000());
        // dto.setAudiField001(entity.getAudiField001());
        // dto.setAudiField002(entity.getAudiField002());
        // dto.setAudiField003(entity.getAudiField003());
        // dto.setAudiField004(entity.getAudiField004());
        return dto;
    }

    public AuditV051 toEntity(AuditDto051 dto) {
        if (dto == null) return null;
        AuditV051 entity = new AuditV051();
        // entity.setAudiField000(dto.getAudiField000());
        // entity.setAudiField001(dto.getAudiField001());
        // entity.setAudiField002(dto.getAudiField002());
        // entity.setAudiField003(dto.getAudiField003());
        // entity.setAudiField004(dto.getAudiField004());
        return entity;
    }
}
