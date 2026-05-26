package com.pnb.trust;

import javax.enterprise.context.ApplicationScoped;

/**
 * TrustMapper023 — Maps between entity and DTO.
 */
@ApplicationScoped
public class TrustMapper023 {

    public TrustDto023 toDto(TrustV023 entity) {
        if (entity == null) return null;
        TrustDto023 dto = new TrustDto023();
        // dto.setTrusField000(entity.getTrusField000());
        // dto.setTrusField001(entity.getTrusField001());
        // dto.setTrusField002(entity.getTrusField002());
        // dto.setTrusField003(entity.getTrusField003());
        // dto.setTrusField004(entity.getTrusField004());
        return dto;
    }

    public TrustV023 toEntity(TrustDto023 dto) {
        if (dto == null) return null;
        TrustV023 entity = new TrustV023();
        // entity.setTrusField000(dto.getTrusField000());
        // entity.setTrusField001(dto.getTrusField001());
        // entity.setTrusField002(dto.getTrusField002());
        // entity.setTrusField003(dto.getTrusField003());
        // entity.setTrusField004(dto.getTrusField004());
        return entity;
    }
}
