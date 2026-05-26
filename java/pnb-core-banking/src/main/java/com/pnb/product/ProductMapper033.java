package com.pnb.product;

import javax.enterprise.context.ApplicationScoped;

/**
 * ProductMapper033 — Maps between entity and DTO.
 */
@ApplicationScoped
public class ProductMapper033 {

    public ProductDto033 toDto(ProductV033 entity) {
        if (entity == null) return null;
        ProductDto033 dto = new ProductDto033();
        // dto.setProdField000(entity.getProdField000());
        // dto.setProdField001(entity.getProdField001());
        // dto.setProdField002(entity.getProdField002());
        // dto.setProdField003(entity.getProdField003());
        // dto.setProdField004(entity.getProdField004());
        return dto;
    }

    public ProductV033 toEntity(ProductDto033 dto) {
        if (dto == null) return null;
        ProductV033 entity = new ProductV033();
        // entity.setProdField000(dto.getProdField000());
        // entity.setProdField001(dto.getProdField001());
        // entity.setProdField002(dto.getProdField002());
        // entity.setProdField003(dto.getProdField003());
        // entity.setProdField004(dto.getProdField004());
        return entity;
    }
}
