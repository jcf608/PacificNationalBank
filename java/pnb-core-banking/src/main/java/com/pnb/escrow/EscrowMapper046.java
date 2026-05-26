package com.pnb.escrow;

import javax.enterprise.context.ApplicationScoped;

/**
 * EscrowMapper046 — Maps between entity and DTO.
 */
@ApplicationScoped
public class EscrowMapper046 {

    public EscrowDto046 toDto(EscrowV046 entity) {
        if (entity == null) return null;
        EscrowDto046 dto = new EscrowDto046();
        // dto.setEscrField000(entity.getEscrField000());
        // dto.setEscrField001(entity.getEscrField001());
        // dto.setEscrField002(entity.getEscrField002());
        // dto.setEscrField003(entity.getEscrField003());
        // dto.setEscrField004(entity.getEscrField004());
        return dto;
    }

    public EscrowV046 toEntity(EscrowDto046 dto) {
        if (dto == null) return null;
        EscrowV046 entity = new EscrowV046();
        // entity.setEscrField000(dto.getEscrField000());
        // entity.setEscrField001(dto.getEscrField001());
        // entity.setEscrField002(dto.getEscrField002());
        // entity.setEscrField003(dto.getEscrField003());
        // entity.setEscrField004(dto.getEscrField004());
        return entity;
    }
}
