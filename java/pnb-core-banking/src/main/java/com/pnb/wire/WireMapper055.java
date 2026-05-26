package com.pnb.wire;

import javax.enterprise.context.ApplicationScoped;

/**
 * WireMapper055 — Maps between entity and DTO.
 */
@ApplicationScoped
public class WireMapper055 {

    public WireDto055 toDto(WireV055 entity) {
        if (entity == null) return null;
        WireDto055 dto = new WireDto055();
        // dto.setWireField000(entity.getWireField000());
        // dto.setWireField001(entity.getWireField001());
        // dto.setWireField002(entity.getWireField002());
        // dto.setWireField003(entity.getWireField003());
        // dto.setWireField004(entity.getWireField004());
        return dto;
    }

    public WireV055 toEntity(WireDto055 dto) {
        if (dto == null) return null;
        WireV055 entity = new WireV055();
        // entity.setWireField000(dto.getWireField000());
        // entity.setWireField001(dto.getWireField001());
        // entity.setWireField002(dto.getWireField002());
        // entity.setWireField003(dto.getWireField003());
        // entity.setWireField004(dto.getWireField004());
        return entity;
    }
}
