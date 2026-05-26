package com.pnb.trust;

import javax.enterprise.context.ApplicationScoped;

/**
 * TrustMapper024 — Maps between entity and DTO.
 */
@ApplicationScoped
public class TrustMapper024 {

    public TrustDto024 toDto(TrustV024 entity) {
        if (entity == null) return null;
        TrustDto024 dto = new TrustDto024();
        // dto.setTrusField000(entity.getTrusField000());
        // dto.setTrusField001(entity.getTrusField001());
        // dto.setTrusField002(entity.getTrusField002());
        // dto.setTrusField003(entity.getTrusField003());
        // dto.setTrusField004(entity.getTrusField004());
        return dto;
    }

    public TrustV024 toEntity(TrustDto024 dto) {
        if (dto == null) return null;
        TrustV024 entity = new TrustV024();
        // entity.setTrusField000(dto.getTrusField000());
        // entity.setTrusField001(dto.getTrusField001());
        // entity.setTrusField002(dto.getTrusField002());
        // entity.setTrusField003(dto.getTrusField003());
        // entity.setTrusField004(dto.getTrusField004());
        return entity;
    }
}
