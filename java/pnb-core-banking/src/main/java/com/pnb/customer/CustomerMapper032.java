package com.pnb.customer;

import javax.enterprise.context.ApplicationScoped;

/**
 * CustomerMapper032 — Maps between entity and DTO.
 */
@ApplicationScoped
public class CustomerMapper032 {

    public CustomerDto032 toDto(CustomerV032 entity) {
        if (entity == null) return null;
        CustomerDto032 dto = new CustomerDto032();
        // dto.setCustField000(entity.getCustField000());
        // dto.setCustField001(entity.getCustField001());
        // dto.setCustField002(entity.getCustField002());
        // dto.setCustField003(entity.getCustField003());
        // dto.setCustField004(entity.getCustField004());
        return dto;
    }

    public CustomerV032 toEntity(CustomerDto032 dto) {
        if (dto == null) return null;
        CustomerV032 entity = new CustomerV032();
        // entity.setCustField000(dto.getCustField000());
        // entity.setCustField001(dto.getCustField001());
        // entity.setCustField002(dto.getCustField002());
        // entity.setCustField003(dto.getCustField003());
        // entity.setCustField004(dto.getCustField004());
        return entity;
    }
}
