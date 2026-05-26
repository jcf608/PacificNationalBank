package com.pnb.escrow;

import javax.enterprise.context.ApplicationScoped;

/**
 * EscrowMapper020 — Maps between entity and DTO.
 */
@ApplicationScoped
public class EscrowMapper020 {

    public EscrowDto020 toDto(EscrowV020 entity) {
        if (entity == null) return null;
        EscrowDto020 dto = new EscrowDto020();
        // dto.setEscrField000(entity.getEscrField000());
        // dto.setEscrField001(entity.getEscrField001());
        // dto.setEscrField002(entity.getEscrField002());
        // dto.setEscrField003(entity.getEscrField003());
        // dto.setEscrField004(entity.getEscrField004());
        return dto;
    }

    public EscrowV020 toEntity(EscrowDto020 dto) {
        if (dto == null) return null;
        EscrowV020 entity = new EscrowV020();
        // entity.setEscrField000(dto.getEscrField000());
        // entity.setEscrField001(dto.getEscrField001());
        // entity.setEscrField002(dto.getEscrField002());
        // entity.setEscrField003(dto.getEscrField003());
        // entity.setEscrField004(dto.getEscrField004());
        return entity;
    }
}
