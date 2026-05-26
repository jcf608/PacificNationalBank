package com.pnb.escrow;

import javax.enterprise.context.ApplicationScoped;

/**
 * EscrowMapper022 — Maps between entity and DTO.
 */
@ApplicationScoped
public class EscrowMapper022 {

    public EscrowDto022 toDto(EscrowV022 entity) {
        if (entity == null) return null;
        EscrowDto022 dto = new EscrowDto022();
        // dto.setEscrField000(entity.getEscrField000());
        // dto.setEscrField001(entity.getEscrField001());
        // dto.setEscrField002(entity.getEscrField002());
        // dto.setEscrField003(entity.getEscrField003());
        // dto.setEscrField004(entity.getEscrField004());
        return dto;
    }

    public EscrowV022 toEntity(EscrowDto022 dto) {
        if (dto == null) return null;
        EscrowV022 entity = new EscrowV022();
        // entity.setEscrField000(dto.getEscrField000());
        // entity.setEscrField001(dto.getEscrField001());
        // entity.setEscrField002(dto.getEscrField002());
        // entity.setEscrField003(dto.getEscrField003());
        // entity.setEscrField004(dto.getEscrField004());
        return entity;
    }
}
