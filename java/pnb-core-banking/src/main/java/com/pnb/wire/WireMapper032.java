package com.pnb.wire;

import javax.enterprise.context.ApplicationScoped;

/**
 * WireMapper032 — Maps between entity and DTO.
 */
@ApplicationScoped
public class WireMapper032 {

    public WireDto032 toDto(WireV032 entity) {
        if (entity == null) return null;
        WireDto032 dto = new WireDto032();
        // dto.setWireField000(entity.getWireField000());
        // dto.setWireField001(entity.getWireField001());
        // dto.setWireField002(entity.getWireField002());
        // dto.setWireField003(entity.getWireField003());
        // dto.setWireField004(entity.getWireField004());
        return dto;
    }

    public WireV032 toEntity(WireDto032 dto) {
        if (dto == null) return null;
        WireV032 entity = new WireV032();
        // entity.setWireField000(dto.getWireField000());
        // entity.setWireField001(dto.getWireField001());
        // entity.setWireField002(dto.getWireField002());
        // entity.setWireField003(dto.getWireField003());
        // entity.setWireField004(dto.getWireField004());
        return entity;
    }
}
