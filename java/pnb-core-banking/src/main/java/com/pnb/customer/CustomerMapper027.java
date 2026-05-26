package com.pnb.customer;

import javax.enterprise.context.ApplicationScoped;

/**
 * CustomerMapper027 — Maps between entity and DTO.
 */
@ApplicationScoped
public class CustomerMapper027 {

    public CustomerDto027 toDto(CustomerV027 entity) {
        if (entity == null) return null;
        CustomerDto027 dto = new CustomerDto027();
        // dto.setCustField000(entity.getCustField000());
        // dto.setCustField001(entity.getCustField001());
        // dto.setCustField002(entity.getCustField002());
        // dto.setCustField003(entity.getCustField003());
        // dto.setCustField004(entity.getCustField004());
        return dto;
    }

    public CustomerV027 toEntity(CustomerDto027 dto) {
        if (dto == null) return null;
        CustomerV027 entity = new CustomerV027();
        // entity.setCustField000(dto.getCustField000());
        // entity.setCustField001(dto.getCustField001());
        // entity.setCustField002(dto.getCustField002());
        // entity.setCustField003(dto.getCustField003());
        // entity.setCustField004(dto.getCustField004());
        return entity;
    }
}
