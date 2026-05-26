package com.pnb.customer;

import javax.enterprise.context.ApplicationScoped;

/**
 * CustomerMapper058 — Maps between entity and DTO.
 */
@ApplicationScoped
public class CustomerMapper058 {

    public CustomerDto058 toDto(CustomerV058 entity) {
        if (entity == null) return null;
        CustomerDto058 dto = new CustomerDto058();
        // dto.setCustField000(entity.getCustField000());
        // dto.setCustField001(entity.getCustField001());
        // dto.setCustField002(entity.getCustField002());
        // dto.setCustField003(entity.getCustField003());
        // dto.setCustField004(entity.getCustField004());
        return dto;
    }

    public CustomerV058 toEntity(CustomerDto058 dto) {
        if (dto == null) return null;
        CustomerV058 entity = new CustomerV058();
        // entity.setCustField000(dto.getCustField000());
        // entity.setCustField001(dto.getCustField001());
        // entity.setCustField002(dto.getCustField002());
        // entity.setCustField003(dto.getCustField003());
        // entity.setCustField004(dto.getCustField004());
        return entity;
    }
}
