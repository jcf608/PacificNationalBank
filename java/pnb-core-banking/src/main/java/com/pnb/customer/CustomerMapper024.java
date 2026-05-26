package com.pnb.customer;

import javax.enterprise.context.ApplicationScoped;

/**
 * CustomerMapper024 — Maps between entity and DTO.
 */
@ApplicationScoped
public class CustomerMapper024 {

    public CustomerDto024 toDto(CustomerV024 entity) {
        if (entity == null) return null;
        CustomerDto024 dto = new CustomerDto024();
        // dto.setCustField000(entity.getCustField000());
        // dto.setCustField001(entity.getCustField001());
        // dto.setCustField002(entity.getCustField002());
        // dto.setCustField003(entity.getCustField003());
        // dto.setCustField004(entity.getCustField004());
        return dto;
    }

    public CustomerV024 toEntity(CustomerDto024 dto) {
        if (dto == null) return null;
        CustomerV024 entity = new CustomerV024();
        // entity.setCustField000(dto.getCustField000());
        // entity.setCustField001(dto.getCustField001());
        // entity.setCustField002(dto.getCustField002());
        // entity.setCustField003(dto.getCustField003());
        // entity.setCustField004(dto.getCustField004());
        return entity;
    }
}
