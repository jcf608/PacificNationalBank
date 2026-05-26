package com.pnb.product;

import javax.enterprise.context.ApplicationScoped;

/**
 * ProductMapper059 — Maps between entity and DTO.
 */
@ApplicationScoped
public class ProductMapper059 {

    public ProductDto059 toDto(ProductV059 entity) {
        if (entity == null) return null;
        ProductDto059 dto = new ProductDto059();
        // dto.setProdField000(entity.getProdField000());
        // dto.setProdField001(entity.getProdField001());
        // dto.setProdField002(entity.getProdField002());
        // dto.setProdField003(entity.getProdField003());
        // dto.setProdField004(entity.getProdField004());
        return dto;
    }

    public ProductV059 toEntity(ProductDto059 dto) {
        if (dto == null) return null;
        ProductV059 entity = new ProductV059();
        // entity.setProdField000(dto.getProdField000());
        // entity.setProdField001(dto.getProdField001());
        // entity.setProdField002(dto.getProdField002());
        // entity.setProdField003(dto.getProdField003());
        // entity.setProdField004(dto.getProdField004());
        return entity;
    }
}
