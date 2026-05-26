package com.pnb.escrow;

import javax.enterprise.context.ApplicationScoped;

/**
 * EscrowMapper052 — Maps between entity and DTO.
 */
@ApplicationScoped
public class EscrowMapper052 {

    public EscrowDto052 toDto(EscrowV052 entity) {
        if (entity == null) return null;
        EscrowDto052 dto = new EscrowDto052();
        // dto.setEscrField000(entity.getEscrField000());
        // dto.setEscrField001(entity.getEscrField001());
        // dto.setEscrField002(entity.getEscrField002());
        // dto.setEscrField003(entity.getEscrField003());
        // dto.setEscrField004(entity.getEscrField004());
        return dto;
    }

    public EscrowV052 toEntity(EscrowDto052 dto) {
        if (dto == null) return null;
        EscrowV052 entity = new EscrowV052();
        // entity.setEscrField000(dto.getEscrField000());
        // entity.setEscrField001(dto.getEscrField001());
        // entity.setEscrField002(dto.getEscrField002());
        // entity.setEscrField003(dto.getEscrField003());
        // entity.setEscrField004(dto.getEscrField004());
        return entity;
    }
}
