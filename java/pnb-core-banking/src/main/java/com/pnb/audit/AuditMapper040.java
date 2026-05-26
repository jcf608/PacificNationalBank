package com.pnb.audit;

import javax.enterprise.context.ApplicationScoped;

/**
 * AuditMapper040 — Maps between entity and DTO.
 */
@ApplicationScoped
public class AuditMapper040 {

    public AuditDto040 toDto(AuditV040 entity) {
        if (entity == null) return null;
        AuditDto040 dto = new AuditDto040();
        // dto.setAudiField000(entity.getAudiField000());
        // dto.setAudiField001(entity.getAudiField001());
        // dto.setAudiField002(entity.getAudiField002());
        // dto.setAudiField003(entity.getAudiField003());
        // dto.setAudiField004(entity.getAudiField004());
        return dto;
    }

    public AuditV040 toEntity(AuditDto040 dto) {
        if (dto == null) return null;
        AuditV040 entity = new AuditV040();
        // entity.setAudiField000(dto.getAudiField000());
        // entity.setAudiField001(dto.getAudiField001());
        // entity.setAudiField002(dto.getAudiField002());
        // entity.setAudiField003(dto.getAudiField003());
        // entity.setAudiField004(dto.getAudiField004());
        return entity;
    }
}
