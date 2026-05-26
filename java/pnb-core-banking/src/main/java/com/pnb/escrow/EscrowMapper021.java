package com.pnb.escrow;

import javax.enterprise.context.ApplicationScoped;

/**
 * EscrowMapper021 — Maps between entity and DTO.
 */
@ApplicationScoped
public class EscrowMapper021 {

    public EscrowDto021 toDto(EscrowV021 entity) {
        if (entity == null) return null;
        EscrowDto021 dto = new EscrowDto021();
        // dto.setEscrField000(entity.getEscrField000());
        // dto.setEscrField001(entity.getEscrField001());
        // dto.setEscrField002(entity.getEscrField002());
        // dto.setEscrField003(entity.getEscrField003());
        // dto.setEscrField004(entity.getEscrField004());
        return dto;
    }

    public EscrowV021 toEntity(EscrowDto021 dto) {
        if (dto == null) return null;
        EscrowV021 entity = new EscrowV021();
        // entity.setEscrField000(dto.getEscrField000());
        // entity.setEscrField001(dto.getEscrField001());
        // entity.setEscrField002(dto.getEscrField002());
        // entity.setEscrField003(dto.getEscrField003());
        // entity.setEscrField004(dto.getEscrField004());
        return entity;
    }
}
