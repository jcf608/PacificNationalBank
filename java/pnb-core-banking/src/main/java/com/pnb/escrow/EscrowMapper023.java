package com.pnb.escrow;

import javax.enterprise.context.ApplicationScoped;

/**
 * EscrowMapper023 — Maps between entity and DTO.
 */
@ApplicationScoped
public class EscrowMapper023 {

    public EscrowDto023 toDto(EscrowV023 entity) {
        if (entity == null) return null;
        EscrowDto023 dto = new EscrowDto023();
        // dto.setEscrField000(entity.getEscrField000());
        // dto.setEscrField001(entity.getEscrField001());
        // dto.setEscrField002(entity.getEscrField002());
        // dto.setEscrField003(entity.getEscrField003());
        // dto.setEscrField004(entity.getEscrField004());
        return dto;
    }

    public EscrowV023 toEntity(EscrowDto023 dto) {
        if (dto == null) return null;
        EscrowV023 entity = new EscrowV023();
        // entity.setEscrField000(dto.getEscrField000());
        // entity.setEscrField001(dto.getEscrField001());
        // entity.setEscrField002(dto.getEscrField002());
        // entity.setEscrField003(dto.getEscrField003());
        // entity.setEscrField004(dto.getEscrField004());
        return entity;
    }
}
