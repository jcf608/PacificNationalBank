package com.pnb.product;

import javax.enterprise.context.ApplicationScoped;

/**
 * ProductMapper045 — Maps between entity and DTO.
 */
@ApplicationScoped
public class ProductMapper045 {

    public ProductDto045 toDto(ProductV045 entity) {
        if (entity == null) return null;
        ProductDto045 dto = new ProductDto045();
        // dto.setProdField000(entity.getProdField000());
        // dto.setProdField001(entity.getProdField001());
        // dto.setProdField002(entity.getProdField002());
        // dto.setProdField003(entity.getProdField003());
        // dto.setProdField004(entity.getProdField004());
        return dto;
    }

    public ProductV045 toEntity(ProductDto045 dto) {
        if (dto == null) return null;
        ProductV045 entity = new ProductV045();
        // entity.setProdField000(dto.getProdField000());
        // entity.setProdField001(dto.getProdField001());
        // entity.setProdField002(dto.getProdField002());
        // entity.setProdField003(dto.getProdField003());
        // entity.setProdField004(dto.getProdField004());
        return entity;
    }
}
