package com.pnb.audit;

import javax.enterprise.context.ApplicationScoped;

/**
 * AuditMapper029 — Maps between entity and DTO.
 */
@ApplicationScoped
public class AuditMapper029 {

    public AuditDto029 toDto(AuditV029 entity) {
        if (entity == null) return null;
        AuditDto029 dto = new AuditDto029();
        // dto.setAudiField000(entity.getAudiField000());
        // dto.setAudiField001(entity.getAudiField001());
        // dto.setAudiField002(entity.getAudiField002());
        // dto.setAudiField003(entity.getAudiField003());
        // dto.setAudiField004(entity.getAudiField004());
        return dto;
    }

    public AuditV029 toEntity(AuditDto029 dto) {
        if (dto == null) return null;
        AuditV029 entity = new AuditV029();
        // entity.setAudiField000(dto.getAudiField000());
        // entity.setAudiField001(dto.getAudiField001());
        // entity.setAudiField002(dto.getAudiField002());
        // entity.setAudiField003(dto.getAudiField003());
        // entity.setAudiField004(dto.getAudiField004());
        return entity;
    }
}
