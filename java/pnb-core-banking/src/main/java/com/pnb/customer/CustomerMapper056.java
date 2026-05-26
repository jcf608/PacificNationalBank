package com.pnb.customer;

import javax.enterprise.context.ApplicationScoped;

/**
 * CustomerMapper056 — Maps between entity and DTO.
 */
@ApplicationScoped
public class CustomerMapper056 {

    public CustomerDto056 toDto(CustomerV056 entity) {
        if (entity == null) return null;
        CustomerDto056 dto = new CustomerDto056();
        // dto.setCustField000(entity.getCustField000());
        // dto.setCustField001(entity.getCustField001());
        // dto.setCustField002(entity.getCustField002());
        // dto.setCustField003(entity.getCustField003());
        // dto.setCustField004(entity.getCustField004());
        return dto;
    }

    public CustomerV056 toEntity(CustomerDto056 dto) {
        if (dto == null) return null;
        CustomerV056 entity = new CustomerV056();
        // entity.setCustField000(dto.getCustField000());
        // entity.setCustField001(dto.getCustField001());
        // entity.setCustField002(dto.getCustField002());
        // entity.setCustField003(dto.getCustField003());
        // entity.setCustField004(dto.getCustField004());
        return entity;
    }
}
