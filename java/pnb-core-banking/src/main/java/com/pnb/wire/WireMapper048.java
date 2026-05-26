package com.pnb.wire;

import javax.enterprise.context.ApplicationScoped;

/**
 * WireMapper048 — Maps between entity and DTO.
 */
@ApplicationScoped
public class WireMapper048 {

    public WireDto048 toDto(WireV048 entity) {
        if (entity == null) return null;
        WireDto048 dto = new WireDto048();
        // dto.setWireField000(entity.getWireField000());
        // dto.setWireField001(entity.getWireField001());
        // dto.setWireField002(entity.getWireField002());
        // dto.setWireField003(entity.getWireField003());
        // dto.setWireField004(entity.getWireField004());
        return dto;
    }

    public WireV048 toEntity(WireDto048 dto) {
        if (dto == null) return null;
        WireV048 entity = new WireV048();
        // entity.setWireField000(dto.getWireField000());
        // entity.setWireField001(dto.getWireField001());
        // entity.setWireField002(dto.getWireField002());
        // entity.setWireField003(dto.getWireField003());
        // entity.setWireField004(dto.getWireField004());
        return entity;
    }
}
