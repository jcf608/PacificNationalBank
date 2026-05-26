package com.pnb.escrow;

import javax.enterprise.context.ApplicationScoped;

/**
 * EscrowMapper026 — Maps between entity and DTO.
 */
@ApplicationScoped
public class EscrowMapper026 {

    public EscrowDto026 toDto(EscrowV026 entity) {
        if (entity == null) return null;
        EscrowDto026 dto = new EscrowDto026();
        // dto.setEscrField000(entity.getEscrField000());
        // dto.setEscrField001(entity.getEscrField001());
        // dto.setEscrField002(entity.getEscrField002());
        // dto.setEscrField003(entity.getEscrField003());
        // dto.setEscrField004(entity.getEscrField004());
        return dto;
    }

    public EscrowV026 toEntity(EscrowDto026 dto) {
        if (dto == null) return null;
        EscrowV026 entity = new EscrowV026();
        // entity.setEscrField000(dto.getEscrField000());
        // entity.setEscrField001(dto.getEscrField001());
        // entity.setEscrField002(dto.getEscrField002());
        // entity.setEscrField003(dto.getEscrField003());
        // entity.setEscrField004(dto.getEscrField004());
        return entity;
    }
}
