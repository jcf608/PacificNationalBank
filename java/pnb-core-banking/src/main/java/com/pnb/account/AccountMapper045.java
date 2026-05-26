package com.pnb.account;

import javax.enterprise.context.ApplicationScoped;

/**
 * AccountMapper045 — Maps between entity and DTO.
 */
@ApplicationScoped
public class AccountMapper045 {

    public AccountDto045 toDto(AccountV045 entity) {
        if (entity == null) return null;
        AccountDto045 dto = new AccountDto045();
        // dto.setAccoField000(entity.getAccoField000());
        // dto.setAccoField001(entity.getAccoField001());
        // dto.setAccoField002(entity.getAccoField002());
        // dto.setAccoField003(entity.getAccoField003());
        // dto.setAccoField004(entity.getAccoField004());
        return dto;
    }

    public AccountV045 toEntity(AccountDto045 dto) {
        if (dto == null) return null;
        AccountV045 entity = new AccountV045();
        // entity.setAccoField000(dto.getAccoField000());
        // entity.setAccoField001(dto.getAccoField001());
        // entity.setAccoField002(dto.getAccoField002());
        // entity.setAccoField003(dto.getAccoField003());
        // entity.setAccoField004(dto.getAccoField004());
        return entity;
    }
}
