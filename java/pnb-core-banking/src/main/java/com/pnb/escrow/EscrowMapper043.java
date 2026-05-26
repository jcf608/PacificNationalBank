package com.pnb.escrow;

import javax.enterprise.context.ApplicationScoped;

/**
 * EscrowMapper043 — Maps between entity and DTO.
 */
@ApplicationScoped
public class EscrowMapper043 {

    public EscrowDto043 toDto(EscrowV043 entity) {
        if (entity == null) return null;
        EscrowDto043 dto = new EscrowDto043();
        // dto.setEscrField000(entity.getEscrField000());
        // dto.setEscrField001(entity.getEscrField001());
        // dto.setEscrField002(entity.getEscrField002());
        // dto.setEscrField003(entity.getEscrField003());
        // dto.setEscrField004(entity.getEscrField004());
        return dto;
    }

    public EscrowV043 toEntity(EscrowDto043 dto) {
        if (dto == null) return null;
        EscrowV043 entity = new EscrowV043();
        // entity.setEscrField000(dto.getEscrField000());
        // entity.setEscrField001(dto.getEscrField001());
        // entity.setEscrField002(dto.getEscrField002());
        // entity.setEscrField003(dto.getEscrField003());
        // entity.setEscrField004(dto.getEscrField004());
        return entity;
    }
}
