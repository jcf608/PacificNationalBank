package com.pnb.customer;

import javax.enterprise.context.ApplicationScoped;

/**
 * CustomerMapper025 — Maps between entity and DTO.
 */
@ApplicationScoped
public class CustomerMapper025 {

    public CustomerDto025 toDto(CustomerV025 entity) {
        if (entity == null) return null;
        CustomerDto025 dto = new CustomerDto025();
        // dto.setCustField000(entity.getCustField000());
        // dto.setCustField001(entity.getCustField001());
        // dto.setCustField002(entity.getCustField002());
        // dto.setCustField003(entity.getCustField003());
        // dto.setCustField004(entity.getCustField004());
        return dto;
    }

    public CustomerV025 toEntity(CustomerDto025 dto) {
        if (dto == null) return null;
        CustomerV025 entity = new CustomerV025();
        // entity.setCustField000(dto.getCustField000());
        // entity.setCustField001(dto.getCustField001());
        // entity.setCustField002(dto.getCustField002());
        // entity.setCustField003(dto.getCustField003());
        // entity.setCustField004(dto.getCustField004());
        return entity;
    }
}
