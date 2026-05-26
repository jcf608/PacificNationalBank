package com.pnb.escrow;

import javax.enterprise.context.ApplicationScoped;

/**
 * EscrowMapper028 — Maps between entity and DTO.
 */
@ApplicationScoped
public class EscrowMapper028 {

    public EscrowDto028 toDto(EscrowV028 entity) {
        if (entity == null) return null;
        EscrowDto028 dto = new EscrowDto028();
        // dto.setEscrField000(entity.getEscrField000());
        // dto.setEscrField001(entity.getEscrField001());
        // dto.setEscrField002(entity.getEscrField002());
        // dto.setEscrField003(entity.getEscrField003());
        // dto.setEscrField004(entity.getEscrField004());
        return dto;
    }

    public EscrowV028 toEntity(EscrowDto028 dto) {
        if (dto == null) return null;
        EscrowV028 entity = new EscrowV028();
        // entity.setEscrField000(dto.getEscrField000());
        // entity.setEscrField001(dto.getEscrField001());
        // entity.setEscrField002(dto.getEscrField002());
        // entity.setEscrField003(dto.getEscrField003());
        // entity.setEscrField004(dto.getEscrField004());
        return entity;
    }
}
