package com.pnb.audit;

import javax.enterprise.context.ApplicationScoped;

/**
 * AuditMapper041 — Maps between entity and DTO.
 */
@ApplicationScoped
public class AuditMapper041 {

    public AuditDto041 toDto(AuditV041 entity) {
        if (entity == null) return null;
        AuditDto041 dto = new AuditDto041();
        // dto.setAudiField000(entity.getAudiField000());
        // dto.setAudiField001(entity.getAudiField001());
        // dto.setAudiField002(entity.getAudiField002());
        // dto.setAudiField003(entity.getAudiField003());
        // dto.setAudiField004(entity.getAudiField004());
        return dto;
    }

    public AuditV041 toEntity(AuditDto041 dto) {
        if (dto == null) return null;
        AuditV041 entity = new AuditV041();
        // entity.setAudiField000(dto.getAudiField000());
        // entity.setAudiField001(dto.getAudiField001());
        // entity.setAudiField002(dto.getAudiField002());
        // entity.setAudiField003(dto.getAudiField003());
        // entity.setAudiField004(dto.getAudiField004());
        return entity;
    }
}
