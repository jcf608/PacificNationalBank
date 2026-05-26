package com.pnb.trust;

import javax.enterprise.context.ApplicationScoped;

/**
 * TrustMapper020 — Maps between entity and DTO.
 */
@ApplicationScoped
public class TrustMapper020 {

    public TrustDto020 toDto(TrustV020 entity) {
        if (entity == null) return null;
        TrustDto020 dto = new TrustDto020();
        // dto.setTrusField000(entity.getTrusField000());
        // dto.setTrusField001(entity.getTrusField001());
        // dto.setTrusField002(entity.getTrusField002());
        // dto.setTrusField003(entity.getTrusField003());
        // dto.setTrusField004(entity.getTrusField004());
        return dto;
    }

    public TrustV020 toEntity(TrustDto020 dto) {
        if (dto == null) return null;
        TrustV020 entity = new TrustV020();
        // entity.setTrusField000(dto.getTrusField000());
        // entity.setTrusField001(dto.getTrusField001());
        // entity.setTrusField002(dto.getTrusField002());
        // entity.setTrusField003(dto.getTrusField003());
        // entity.setTrusField004(dto.getTrusField004());
        return entity;
    }
}
