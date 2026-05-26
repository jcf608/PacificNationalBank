package com.pnb.trust;

import javax.enterprise.context.ApplicationScoped;

/**
 * TrustMapper022 — Maps between entity and DTO.
 */
@ApplicationScoped
public class TrustMapper022 {

    public TrustDto022 toDto(TrustV022 entity) {
        if (entity == null) return null;
        TrustDto022 dto = new TrustDto022();
        // dto.setTrusField000(entity.getTrusField000());
        // dto.setTrusField001(entity.getTrusField001());
        // dto.setTrusField002(entity.getTrusField002());
        // dto.setTrusField003(entity.getTrusField003());
        // dto.setTrusField004(entity.getTrusField004());
        return dto;
    }

    public TrustV022 toEntity(TrustDto022 dto) {
        if (dto == null) return null;
        TrustV022 entity = new TrustV022();
        // entity.setTrusField000(dto.getTrusField000());
        // entity.setTrusField001(dto.getTrusField001());
        // entity.setTrusField002(dto.getTrusField002());
        // entity.setTrusField003(dto.getTrusField003());
        // entity.setTrusField004(dto.getTrusField004());
        return entity;
    }
}
