package com.pnb.escrow;

import javax.enterprise.context.ApplicationScoped;

/**
 * EscrowMapper030 — Maps between entity and DTO.
 */
@ApplicationScoped
public class EscrowMapper030 {

    public EscrowDto030 toDto(EscrowV030 entity) {
        if (entity == null) return null;
        EscrowDto030 dto = new EscrowDto030();
        // dto.setEscrField000(entity.getEscrField000());
        // dto.setEscrField001(entity.getEscrField001());
        // dto.setEscrField002(entity.getEscrField002());
        // dto.setEscrField003(entity.getEscrField003());
        // dto.setEscrField004(entity.getEscrField004());
        return dto;
    }

    public EscrowV030 toEntity(EscrowDto030 dto) {
        if (dto == null) return null;
        EscrowV030 entity = new EscrowV030();
        // entity.setEscrField000(dto.getEscrField000());
        // entity.setEscrField001(dto.getEscrField001());
        // entity.setEscrField002(dto.getEscrField002());
        // entity.setEscrField003(dto.getEscrField003());
        // entity.setEscrField004(dto.getEscrField004());
        return entity;
    }
}
