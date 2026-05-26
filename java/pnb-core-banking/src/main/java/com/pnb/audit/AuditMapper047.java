package com.pnb.audit;

import javax.enterprise.context.ApplicationScoped;

/**
 * AuditMapper047 — Maps between entity and DTO.
 */
@ApplicationScoped
public class AuditMapper047 {

    public AuditDto047 toDto(AuditV047 entity) {
        if (entity == null) return null;
        AuditDto047 dto = new AuditDto047();
        // dto.setAudiField000(entity.getAudiField000());
        // dto.setAudiField001(entity.getAudiField001());
        // dto.setAudiField002(entity.getAudiField002());
        // dto.setAudiField003(entity.getAudiField003());
        // dto.setAudiField004(entity.getAudiField004());
        return dto;
    }

    public AuditV047 toEntity(AuditDto047 dto) {
        if (dto == null) return null;
        AuditV047 entity = new AuditV047();
        // entity.setAudiField000(dto.getAudiField000());
        // entity.setAudiField001(dto.getAudiField001());
        // entity.setAudiField002(dto.getAudiField002());
        // entity.setAudiField003(dto.getAudiField003());
        // entity.setAudiField004(dto.getAudiField004());
        return entity;
    }
}
